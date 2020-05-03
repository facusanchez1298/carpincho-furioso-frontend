package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.ProvideUserDataService;
import com.coden2020.hackaton.app.domain.model.usecases.FullUserData;
import com.coden2020.hackaton.app.infrastructure.entities.User;
import com.coden2020.hackaton.app.infrastructure.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProvideUserDataImp implements ProvideUserDataService {
  private transient UserRepository userRepository;
  private transient UserMapper userMapper;

  private transient UserProviderExtraDataRepository userProviderExtraDataRepository;

  @Autowired
  public ProvideUserDataImp(UserRepository userRepository, UserMapper userMapper, UserProviderExtraDataRepository userProviderExtraDataRepository) {
    this.userRepository = userRepository;
    this.userMapper = userMapper;
    this.userProviderExtraDataRepository = userProviderExtraDataRepository;
  }

  @Override
  public FullUserData getFullUserDataByDni(String dni) {
    User user = userRepository.findByUserDni(dni);
    FullUserData fullUserData = new FullUserData();
    fullUserData.setUser(
      userMapper.map(user)
    );
    fullUserData.setUserProviderExtraData(
      userProviderExtraDataRepository.findById(user.getIdUser()).get()
    );

    return fullUserData;
  }
}
