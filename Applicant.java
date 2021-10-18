/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;

 /**
  * 
  */
public class Applicant {

    private String firstName;
    private String lastName;
    private ArrayList<String> language;
    private ArrayList<String> workExperience;
    private ArrayList<String> education;
    private Rating rating;
    private ApplicantFilter applicantFilter;

    public void Apply(JobListing jobListing) {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public ArrayList<String> getLanguage() {
        return this.language;
    }

    public ArrayList<String> getWorkExperience() {
        return this.workExperience;
    }

    public ArrayList<String> getEducation() {
        return this.education;
    }

    public Rating getRating() {
        return this.rating;
    }

    public ApplicantFilter getApplicantFilter() {
        return this.applicantFilter;
    }
}