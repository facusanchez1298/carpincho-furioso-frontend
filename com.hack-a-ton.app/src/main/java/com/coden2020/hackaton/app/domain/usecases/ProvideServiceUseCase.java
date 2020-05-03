package com.coden2020.hackaton.app.domain.usecases;

import com.coden2020.hackaton.app.domain.model.ProvideServiceInterface;
import com.coden2020.hackaton.app.infrastructure.entities.UserContractServiceKey;
import com.coden2020.hackaton.app.infrastructure.repository.UserContractServiceKeyRepository;

public class ProvideServiceUseCase implements ProvideServiceInterface {

  UserContractServiceKeyRepository userContractServiceKeyRepository;

  @Override
  public UserContractServiceKey attachService(Long userId, Long serviceId) {
    UserContractServiceKey userContractServiceKey= new UserContractServiceKey();
    userContractServiceKey.setIdService(serviceId);
    userContractServiceKey.setIdUser(userId);

    return userContractServiceKeyRepository.save(userContractServiceKey);
  }
}
