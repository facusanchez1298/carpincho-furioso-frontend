package com.coden2020.hackaton.app.infrastructure.controller;

import com.coden2020.hackaton.app.domain.usecases.ProvideServiceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UserController {
  ProvideServiceUseCase provideServiceUseCase;

  @Autowired
  public UserController(
      ProvideServiceUseCase provideServiceUseCase) {
    this.provideServiceUseCase = provideServiceUseCase;
  }

  @PostMapping("/addService/")
  public ResponseEntity addService(String userId, String serviceId) {
    return provideServiceUseCase.execute(userId,serviceId);
  }



}
