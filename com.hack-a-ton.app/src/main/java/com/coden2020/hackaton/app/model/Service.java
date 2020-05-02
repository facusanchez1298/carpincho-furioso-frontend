package com.coden2020.hackaton.app.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idService;

    @OneToMany(mappedBy = "service")
    private Set<User_contracts_service> contracts;

}
