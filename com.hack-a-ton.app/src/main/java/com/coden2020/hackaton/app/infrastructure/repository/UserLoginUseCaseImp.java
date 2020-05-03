package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.UserLoginUseCaseInterface;
import com.coden2020.hackaton.app.infrastructure.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserLoginUseCaseImp implements UserLoginUseCaseInterface {

    private UserRepository userRepository;

    @Autowired
    public UserLoginUseCaseImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User login(String email, String pass) {
        Optional<User> user = this.userRepository.findByUserEmail(email);
        if(!user.get().getUserName().isEmpty() && (!user.get().getUserPass().isEmpty() && user.get().getUserPass().equals(pass))){
            return user.get();
        }
        throw new RuntimeException();
    }
}
