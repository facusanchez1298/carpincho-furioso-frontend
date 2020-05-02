package com.coden2020.hackaton.app.domain.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_service")
    private int idService;

    @OneToMany(mappedBy = "service")
    private Set<User_contracts_service> contracts;

    @ManyToMany
    @JoinTable(
            name = "service_category",
            joinColumns = { @JoinColumn(name = "id_category")},
            inverseJoinColumns = { @JoinColumn(name = "id_service")})
    private Set<Category> categories = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "user_service",
            joinColumns = { @JoinColumn(name = "id_user")},
            inverseJoinColumns = { @JoinColumn(name = "id_service")}
    )
    private Set<User> users = new HashSet<>();

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public Set<User_contracts_service> getContracts() {
        return contracts;
    }

    public void setContracts(Set<User_contracts_service> contracts) {
        this.contracts = contracts;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
