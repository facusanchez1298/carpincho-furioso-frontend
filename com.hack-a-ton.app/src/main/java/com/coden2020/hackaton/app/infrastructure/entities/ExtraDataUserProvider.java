package com.coden2020.hackaton.app.infrastructure.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.List;

@Embeddable
public class ExtraDataUserProvider implements Serializable {
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "id_service")
    private Long idService;


    public ExtraDataUserProvider() {
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
