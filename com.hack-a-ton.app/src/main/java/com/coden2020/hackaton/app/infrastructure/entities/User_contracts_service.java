package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.util.Date;

public class User_contracts_service {
    @EmbeddedId
    private UserContractServiceKey key;

    @ManyToOne
    @MapsId("idUser")
    private User user;

    @ManyToOne
    @MapsId("idService")
    private Service service;

    @Column(name = "id_user_provider")
    private User_Contract_Service_To_User_Provider idUserProvider;

    @Column(name = "client_accepted")
    private boolean acceptedClient;

    @Column(name = "userProvider_accepted")
    private boolean provider_accepted;

    @Column(name = "contract_date")
    private Date contractDate;

    public UserContractServiceKey getKey() {
        return key;
    }

    public void setKey(UserContractServiceKey key) {
        this.key = key;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public User_Contract_Service_To_User_Provider getIdUserProvider() {
        return idUserProvider;
    }

    public void setIdUserProvider(User_Contract_Service_To_User_Provider idUserProvider) {
        this.idUserProvider = idUserProvider;
    }

    public boolean isAcceptedClient() {
        return acceptedClient;
    }

    public void setAcceptedClient(boolean acceptedClient) {
        this.acceptedClient = acceptedClient;
    }

    public boolean isProvider_accepted() {
        return provider_accepted;
    }

    public void setProvider_accepted(boolean provider_accepted) {
        this.provider_accepted = provider_accepted;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }
}
