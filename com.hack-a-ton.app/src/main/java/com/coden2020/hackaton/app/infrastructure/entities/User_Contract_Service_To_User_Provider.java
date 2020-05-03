package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class User_Contract_Service_To_User_Provider {

    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "id_service")
    private Long idService;
}
