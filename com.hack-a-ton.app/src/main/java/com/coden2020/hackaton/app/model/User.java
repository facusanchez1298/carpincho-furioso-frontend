package com.coden2020.hackaton.app.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;

    @OneToMany(mappedBy = "user")
    private Set<User_contracts_service> contracts;


}
