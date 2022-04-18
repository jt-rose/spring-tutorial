package com.example.tutorial;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "JobApplication")
@Table(name = "job_applications")
public class JobApplication {

    @Id
    @SequenceGenerator(name = "job_application_sequence", sequenceName = "job_application_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_application_sequence")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "position", nullable = false)
    private String position;
    @Column(name = "company_name", nullable = false)
    private String companyName;
    @Column(name = "applied_on", nullable = false, columnDefinition = "TIMESTAMPTZ")
    private Date appliedOn;
    @Column(name = "website", nullable = false)
    private String website;
    @Column(name = "interview", nullable = false)
    private boolean interview;
    @Column(name = "notes", nullable = false, columnDefinition = "TEXT")
    private String notes;

    public JobApplication(String companyName, String position, Date appliedOn, String website, boolean interview, String notes) {
        this.companyName = companyName;
        this.position = position;
        this.appliedOn = appliedOn;
        this.website = website;
        this.interview = interview;
        this.notes = notes;
    }

    public JobApplication() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public boolean getInterview() {
        return interview;
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
                ", position='" + position +
                ", companyName='" + companyName + '\'' +
                ", appliedOn=" + appliedOn +
                ", website='" + website + '\'' +
                ", interview=" + interview +
                ", notes='" + notes + '\'' +
                '}';
    }
}
