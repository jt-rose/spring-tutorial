package com.example.tutorial;

import java.util.Date;

public class JobApplication {

    private Long id;
    private String companyName;
    private Date appliedOn;
    private String website;
    private boolean interview;
    private String notes;

    public JobApplication(Long id, String companyName, Date appliedOn, String website, boolean interview, String notes) {
        this.id = id;
        this.companyName = companyName;
        this.appliedOn = appliedOn;
        this.website = website;
        this.interview = interview;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getAppliedOn() {
        return appliedOn;
    }

    public void setAppliedOn(Date appliedOn) {
        this.appliedOn = appliedOn;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isInterview() {
        return interview;
    }

    public void setInterview(boolean interview) {
        this.interview = interview;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "JobApplication{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", appliedOn=" + appliedOn +
                ", website='" + website + '\'' +
                ", interview=" + interview +
                ", notes='" + notes + '\'' +
                '}';
    }
}
