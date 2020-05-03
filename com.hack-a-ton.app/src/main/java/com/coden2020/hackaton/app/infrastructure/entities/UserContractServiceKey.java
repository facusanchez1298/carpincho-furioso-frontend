package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserContractServiceKey implements Serializable {
    @Column(name = "idUser")
    private Long idUser;
    @Column(name = "idService")
    private Long idService;

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
}
