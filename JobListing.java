/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;

 /**
  * 
  */
public class JobListing {

    private float pay;
    private String length;
    private String position;
    private ArrayList<Applicant> applicants;
    private String jobDescription;
    private ArrayList<String> skills;

    public JobListing(float pay, String length, String position) {

    }

    public float getPay() {
        return this.pay;
    }

    public String getLength() {
        return this.length;
    }

    public String getPosition() {
        return this.position;
    }

    public ArrayList<Applicant> getApplicants() {
        return this.applicants;
    }

    public String getJobDescription() {
        return this.jobDescription;
    }

    public ArrayList<String> getSkills() {
        return this.skills;
    }
}