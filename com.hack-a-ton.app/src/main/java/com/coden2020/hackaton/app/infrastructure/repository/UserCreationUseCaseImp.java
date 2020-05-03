package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.UserSignInInterface;
import com.coden2020.hackaton.app.infrastructure.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserCreationUseCaseImp implements UserSignInInterface {

    private UserRepository userRepository;

    @Autowired
    public UserCreationUseCaseImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public boolean createUser(String email, String firstName, String lastName, String pass, String phone, String dni) {
        if(!firstName.isEmpty() && !pass.isEmpty() && !dni.isEmpty()){
            User user = new User(firstName, lastName, pass, email, phone, dni);
            this.userRepository.save(user);
            return true;
        }
        return false;
    }
}
