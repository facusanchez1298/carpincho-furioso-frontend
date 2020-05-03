package com.coden2020.hackaton.app.infrastructure.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Embeddable
public class UserContractServiceKey implements Serializable {
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "id_service")
    private Long idService;
    @Column(name = "id_userProvider")
    private Long idUserProvider;

    public UserContractServiceKey(){}

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public Long getIdUserProvider() {
        return idUserProvider;
    }

    public void setIdUserProvider(Long idUserProvider) {
        this.idUserProvider = idUserProvider;
    }
}
