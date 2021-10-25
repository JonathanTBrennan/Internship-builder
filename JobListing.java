/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;

 /**
  * Deals with the properties of each instance of a job listing
  */
public class JobListing {

    private String title;
    private float pay;
    private String length;
    private String position;
    private ArrayList<Student> applicants;
    private String jobDescription;
    private ArrayList<String> skills;

    public JobListing(String title, float pay, String length, String position, String jobDescrip, ArrayList<String> sklls) {
        this.title = title;
        this.pay = pay;
        this.length = length;
        this.position = position;
        this.applicants = new ArrayList<Student>();
        this.jobDescription = jobDescrip;
        this.skills = sklls;
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

    public ArrayList<Student> getApplicants() {
        return this.applicants;
    }

    public String getJobDescription() {
        return this.jobDescription;
    }

    public ArrayList<String> getSkills() {
        return this.skills;
    }

    public void addApplicant(Student stu) {
        applicants.add(stu); 
    }
}