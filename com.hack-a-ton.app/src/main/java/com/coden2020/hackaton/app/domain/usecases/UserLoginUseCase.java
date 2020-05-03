package com.coden2020.hackaton.app.domain.usecases;

import com.coden2020.hackaton.app.domain.model.UserLoginUseCaseInterface;
import com.coden2020.hackaton.app.infrastructure.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserLoginUseCase {

    private UserLoginUseCaseInterface userLoginUseCase;

    @Autowired
    public UserLoginUseCase(UserLoginUseCaseInterface userLoginUseCase) {
        this.userLoginUseCase = userLoginUseCase;
    }

    public ResponseEntity<User> execute(String name, String pass){
        try{
            this.userLoginUseCase.login(name, pass);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

}
