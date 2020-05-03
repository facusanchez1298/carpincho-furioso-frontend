package com.coden2020.hackaton.app.infrastructure.controller;

import com.coden2020.hackaton.app.domain.model.usecases.FullUserData;
import com.coden2020.hackaton.app.domain.usecases.ProvideServiceUseCase;
import com.coden2020.hackaton.app.domain.usecases.ProvideUserInformationUseCase;
import com.coden2020.hackaton.app.domain.usecases.UserCreationUseCase;
import com.coden2020.hackaton.app.domain.usecases.UserLoginUseCase;
import com.coden2020.hackaton.app.infrastructure.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UserController {
  ProvideServiceUseCase provideServiceUseCase;
  UserLoginUseCase userLoginUseCase;
  UserCreationUseCase userCreationUseCase;
  ProvideUserInformationUseCase provideUserInformationUseCase;
  @Autowired
  public UserController(
          ProvideServiceUseCase provideServiceUseCase,
          UserLoginUseCase userLoginUseCase,
          UserCreationUseCase userCreationUseCase,
          FindByNameUseCase findByNameUseCase) {
    this.provideServiceUseCase = provideServiceUseCase;
    this.userLoginUseCase = userLoginUseCase;
    this.userCreationUseCase = userCreationUseCase;
  }

  @PostMapping("/addService")
  public ResponseEntity addService(@RequestParam String userId, @RequestParam String serviceId) {
    return provideServiceUseCase.execute(userId,serviceId);
  }

  @GetMapping("/login")
  public ResponseEntity<User> getUser(@RequestParam String fullName, @RequestParam String pass){
    return this.userLoginUseCase.execute(fullName, pass);
  }

  @PostMapping("/SingIn")
  public ResponseEntity createUser(@RequestParam String email, @RequestParam String fName,
                                   @RequestParam String lName, @RequestParam String pass,
                                   @RequestParam String phone, @RequestParam String dni){
    return this.userCreationUseCase.createUser(email, fName, lName, pass, phone, dni);
  }

  @GetMapping("/{dni}")
  public ResponseEntity<FullUserData> getUserByDNI(@PathVariable(value = "dni") String dni){
    FullUserData userData = provideUserInformationUseCase.execute(dni);

    if(userData == null) return ResponseEntity.notFound().build();
    return ResponseEntity.ok().body(userData);

}
