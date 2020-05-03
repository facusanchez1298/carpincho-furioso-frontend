package com.coden2020.hackaton.app.domain.model;

import org.springframework.http.ResponseEntity;

public interface UserSignInInterface {

    boolean createUser(String email, String firstName, String lastName, String pass, String phone, String dni);

}
