package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class User_Contract_Service_To_User_Provider {

    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "id_service")
    private Long idService;

    public User_Contract_Service_To_User_Provider() {
    }

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
