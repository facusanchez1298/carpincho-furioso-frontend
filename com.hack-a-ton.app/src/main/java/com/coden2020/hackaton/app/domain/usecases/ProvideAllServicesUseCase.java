package com.coden2020.hackaton.app.domain.usecases;

import com.coden2020.hackaton.app.domain.model.AllServicesUCInterface;
import com.coden2020.hackaton.app.infrastructure.entities.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProvideAllServicesUseCase {
  private AllServicesUCInterface allServicesUCInterface;
  @Autowired
  public ProvideAllServicesUseCase(
      AllServicesUCInterface allServicesUCInterface) {
    this.allServicesUCInterface = allServicesUCInterface;
  }

  public List<Service> execute() {
    return allServicesUCInterface.execute();
  }
}
