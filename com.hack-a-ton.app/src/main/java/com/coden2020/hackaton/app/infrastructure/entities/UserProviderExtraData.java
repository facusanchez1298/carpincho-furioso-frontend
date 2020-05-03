package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class UserProviderExtraData {

    @EmbeddedId
    private ExtraDataUserProvider userServiceProviderId;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_professional_email")
    private String userProfessionalEmail;

    @Column(name = "user_location")
    private String location;

    @OneToMany
    @Column(name = "user_cv")
    private List<UserCurriculum> userCurriculumList;

    public ExtraDataUserProvider getUserServiceProviderId() {
        return userServiceProviderId;
    }

    public void setUserServiceProviderId(ExtraDataUserProvider userServiceProviderId) {
        this.userServiceProviderId = userServiceProviderId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserProfessionalEmail() {
        return userProfessionalEmail;
    }

    public void setUserProfessionalEmail(String userProfessionalEmail) {
        this.userProfessionalEmail = userProfessionalEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
