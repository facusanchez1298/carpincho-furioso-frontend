package com.coden2020.hackaton.app.domain.usecases;

import com.coden2020.hackaton.app.domain.model.ProvideUserDataService;
import com.coden2020.hackaton.app.domain.model.usecases.FullUserData;
import org.springframework.stereotype.Component;

@Component
public class ProvideUserInformationUseCase {
  private transient ProvideUserDataService provideUserData;

  public ProvideUserInformationUseCase(ProvideUserDataService provideUserData) {
    this.provideUserData = provideUserData;
  }

  public FullUserData execute(String dni){
    return provideUserData.getFullUserDataByDni(dni);
  }
}
