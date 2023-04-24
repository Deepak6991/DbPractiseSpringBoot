package com.candidate.model;

public class Candidate {
    String candidateName;
    String experience;
    String eduBack ;
    String techSkills ;
    String comSkills;

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEduBack() {
        return eduBack;
    }

    public void setEduBack(String eduBack) {
        this.eduBack = eduBack;
    }

    public String getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(String techSkills) {
        this.techSkills = techSkills;
    }

    public String getComSkills() {
        return comSkills;
    }

    public void setComSkills(String comSkills) {
        this.comSkills = comSkills;
    }

    public Candidate(String candidateName, String experience, String eduBack, String techSkills, String comSkills) {
        super();
        this.candidateName = candidateName;
        this.experience = experience;
        this.eduBack = eduBack;
        this.techSkills = techSkills;
        this.comSkills = comSkills;
    }

    public Candidate() {
        super();
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateName='" + candidateName + '\'' +
                ", experience='" + experience + '\'' +
                ", eduBack='" + eduBack + '\'' +
                ", techSkills='" + techSkills + '\'' +
                ", comSkills='" + comSkills + '\'' +
                '}';
    }
}
