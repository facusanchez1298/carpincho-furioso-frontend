package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserContractServiceKey implements Serializable {
    @Column(name = "idUser")
    private int idUser;
    @Column(name = "idService")
    private int idService;
}
