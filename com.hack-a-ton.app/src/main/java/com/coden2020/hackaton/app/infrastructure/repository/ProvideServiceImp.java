package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.ProvideServiceInterface;
import com.coden2020.hackaton.app.infrastructure.entities.Service;
import com.coden2020.hackaton.app.infrastructure.entities.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvideServiceImp implements ProvideServiceInterface {

  private UserRepository userRepository;
  private ServiceRepository serviceRepository;

  @Autowired
  public ProvideServiceImp(
      UserRepository userRepository,
      ServiceRepository serviceRepository) {
    this.userRepository = userRepository;
    this.serviceRepository = serviceRepository;
  }

  @Override
  public User attachService(Long userId, Long serviceId) {
    Optional<User> optionalUser = userRepository.findById(userId);
    Optional<Service> optionalService = serviceRepository.findById(serviceId);
    if (optionalUser.isEmpty() || optionalService.isEmpty())
      throw new RuntimeException("Invalid input");
    User user = optionalUser.get();
    Service service = optionalService.get();
    user.getServices().add(service);
    return userRepository.save(user);
  }
}
