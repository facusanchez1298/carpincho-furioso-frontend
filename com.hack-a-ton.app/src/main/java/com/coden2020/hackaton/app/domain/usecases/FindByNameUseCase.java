package com.coden2020.hackaton.app.domain.usecases;

import com.coden2020.hackaton.app.infrastructure.entities.User;
import com.coden2020.hackaton.app.infrastructure.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FindByNameUseCase {

  UserRepository userRepository;
  @Autowired
  public FindByNameUseCase(
      UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public ResponseEntity<User> execute(String userName){
    try {
      userRepository.findByUserName(userName);
    } catch (Exception e) {
      return ResponseEntity.notFound().build();
    }
    Optional<User> optionalUser = userRepository.findByUserName(userName);
    if (optionalUser.isEmpty())
      return ResponseEntity.notFound().build();

    return new ResponseEntity<>(optionalUser.get(), HttpStatus.OK);
  }
}
