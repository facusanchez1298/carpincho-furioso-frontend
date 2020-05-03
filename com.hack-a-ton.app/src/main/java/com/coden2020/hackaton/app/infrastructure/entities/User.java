package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private Long idUser;

    @OneToMany(mappedBy = "user")
    private Set<User_contracts_service> contracts;

    @ManyToMany
    private Set<Service> services = new HashSet<>();

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_lastName")
    private String userLastName;

    @Column(name = "user_phone")
    private String phone;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_dni")
    private String userDni;

    public User() {
    }

    public User(String userName, String userLastName, String userPass, String userEmail, String phone, String userDni) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.userPass = userPass;
        this.userEmail = userEmail;
        this.phone = phone;
        this.userDni = userDni;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Set<User_contracts_service> getContracts() {
        return contracts;
    }

    public void setContracts(Set<User_contracts_service> contracts) {
        this.contracts = contracts;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDni() {
        return userDni;
    }

    public void setUserDni(String userDni) {
        this.userDni = userDni;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }
}
