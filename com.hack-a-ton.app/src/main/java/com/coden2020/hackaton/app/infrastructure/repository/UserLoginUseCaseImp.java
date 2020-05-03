package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.UserLoginUseCaseInterface;
import com.coden2020.hackaton.app.infrastructure.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserLoginUseCaseImp implements UserLoginUseCaseInterface {

    private UserRepository userRepository;

    @Autowired
    public UserLoginUseCaseImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User login(String fullName, String pass) {
        Optional<User> user = this.userRepository.findByName(fullName);
        if(!user.get().getUserName().isEmpty() && (!user.get().getUserPass().isEmpty() && user.get().getUserPass().equals(pass))){
            return user.get();
        }
        throw new RuntimeException();
    }
}
