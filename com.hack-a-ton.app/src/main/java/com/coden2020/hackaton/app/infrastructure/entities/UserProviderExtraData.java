package com.coden2020.hackaton.app.infrastructure.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class UserProviderExtraData {

    @Id
    private long dni;

    public List<UserCurriculum> getUserCurriculumList() {
        return userCurriculumList;
    }

    public void setUserCurriculumList(List<UserCurriculum> userCurriculumList) {
        this.userCurriculumList = userCurriculumList;
    }

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_professional_email")
    private String userProfessionalEmail;

    @Column(name = "user_location")
    private String location;

    @OneToMany
    @Column(name = "user_cv")
    private List<UserCurriculum> userCurriculumList;

    public UserProviderExtraData() {
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

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
