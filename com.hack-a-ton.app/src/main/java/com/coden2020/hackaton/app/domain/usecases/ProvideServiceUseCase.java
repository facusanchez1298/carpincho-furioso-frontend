package com.coden2020.hackaton.app.domain.usecases;

import com.coden2020.hackaton.app.domain.model.ProvideServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProvideServiceUseCase {
  ProvideServiceInterface provideServiceInterface;

  @Autowired
  public ProvideServiceUseCase(
      ProvideServiceInterface provideServiceInterface) {
    this.provideServiceInterface = provideServiceInterface;
  }

  public ResponseEntity execute(String userId, String serviceId) {
    Long userId2 = Long.parseLong(userId);
    Long serviceId2 = Long.parseLong(serviceId);
    try {
      provideServiceInterface.attachService(userId2, serviceId2);
    } catch (Exception e) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok().build();
  }
}
