package com.coden2020.hackaton.app.domain.model;

import com.coden2020.hackaton.app.domain.model.usecases.FullUserData;

public interface ProvideUserDataService {
  FullUserData getFullUserDataByDni(String dni);
}
