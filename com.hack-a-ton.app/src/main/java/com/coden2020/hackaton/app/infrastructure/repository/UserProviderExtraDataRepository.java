package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.infrastructure.entities.UserProviderExtraData;
import org.springframework.data.repository.CrudRepository;

public interface UserProviderExtraDataRepository extends CrudRepository<UserProviderExtraData, Long> {
}
