package com.coden2020.hackaton.app.infrastructure.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ExtraDataUserProvider implements Serializable {

    @Column(name = "id_user")
    private int idUser;
    @Column(name = "id_service")
    private int idService;
}
