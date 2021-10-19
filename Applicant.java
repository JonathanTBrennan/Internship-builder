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
    private ArrayList<String> languages;
    private ArrayList<String> workExperience;
    private ArrayList<String> education;
    private Rating rating;
    private ApplicantFilter applicantFilter;

    /**
     * Constructor for an applicant of a job listing
     * @param name of the applicant, first and last
     * @param langs languages the applicant listed
     * @param wExperience work experience the applicant listed
     * @param edu education the applicant listed
     * @param rate rating of the student's profile
     * @param appFilter 1
     */
    public Applicant(String name, ArrayList<String> langs, ArrayList<String> wExperience, ArrayList<String> edu, Rating rate, ApplicantFilter appFilter) {
        //this.firstName = getFirstName?
        //this.lastName = getLastName?
        this.languages = langs;
        this.workExperience = wExperience;
        this.education = edu;
        this.rating = rate;
        this.applicantFilter = appFilter;
    }

    public void Apply(JobListing jobListing) {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public ArrayList<String> getLanguage() {
        return this.languages;
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