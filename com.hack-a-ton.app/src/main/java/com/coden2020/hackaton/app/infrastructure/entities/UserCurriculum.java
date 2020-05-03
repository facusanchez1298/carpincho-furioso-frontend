package com.coden2020.hackaton.app.infrastructure.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class UserCurriculum {

    @EmbeddedId
    private ExtraDataUserProvider curriculumId;
    @Column(name = "user_experience")
    private String storyExperience;

    public UserCurriculum(String storyExperience){
        this.storyExperience = storyExperience;
    }

    public UserCurriculum() {
    }

    public ExtraDataUserProvider getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(ExtraDataUserProvider curriculumId) {
        this.curriculumId = curriculumId;
    }

    public String getStoryExperience() {
        return storyExperience;
    }

    public void setStoryExperience(String storyExperience) {
        this.storyExperience = storyExperience;
    }
}
