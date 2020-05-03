package com.coden2020.hackaton.app.infrastructure.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.persistence.EmbeddedId;
import java.util.List;


public class UserCurriculum {

    @EmbeddedId
    private ExtraDataUserProvider curriculumId;

    private List<String> storyExperience;

    @Autowired
    public UserCurriculum(List<String> storyExperience){
        this.storyExperience = storyExperience;
    }

    public ExtraDataUserProvider getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(ExtraDataUserProvider curriculumId) {
        this.curriculumId = curriculumId;
    }

    public List<String> getStoryExperience() {
        return storyExperience;
    }

    public void setStoryExperience(List<String> storyExperience) {
        this.storyExperience = storyExperience;
    }
}
