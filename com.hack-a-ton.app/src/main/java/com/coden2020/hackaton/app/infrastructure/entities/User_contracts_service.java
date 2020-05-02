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
    private int idUserProvider;

    @Column(name = "fecha")
    private Date fecha;

}
