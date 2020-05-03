package com.coden2020.hackaton.app.domain.model;

import com.coden2020.hackaton.app.infrastructure.entities.UserContractServiceKey;

public interface ProvideServiceInterface {
  UserContractServiceKey attachService(Long userId, Long serviceId);
}
