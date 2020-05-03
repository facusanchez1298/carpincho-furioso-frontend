package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserContractServiceKey implements Serializable {
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "id_service")
    private Long idService;
    @Column(name = "id_userProvider")
    private Long idUserProvider;
}
