package com.coden2020.hackaton.app.domain.usecases;

import com.coden2020.hackaton.app.domain.model.UserSignInInterface;
import com.coden2020.hackaton.app.infrastructure.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class UserCreationUseCase {

    private UserSignInInterface userSignInInterface;

    @Autowired
    public UserCreationUseCase(UserSignInInterface userSignInInterface) {
        this.userSignInInterface = userSignInInterface;
    }

    public ResponseEntity createUser(String email, String fName, String lName, String pass, String phone, String dni){
        try{
            this.userSignInInterface.createUser(email, fName, lName, pass, phone, dni);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }
}
