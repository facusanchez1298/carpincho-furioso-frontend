package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.EmbeddedId;

public class UserProviderExtraData {

    @EmbeddedId
    private ExtraDataUserProvider userServiceProviderId;


}
