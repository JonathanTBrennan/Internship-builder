/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */
import java.util.UUID;
import java.util.ArrayList;

 /**
  * Deals with the properties of each instance of a job listing
  */
public class JobListing {

    private String title;
    private UUID employerID;
    private String location;
    private float pay;
    private String length;
    private String position;
    private ArrayList<UUID> studentIDS;
    private String jobDescription;
    private ArrayList<String> skills;

    public JobListing(String title, UUID employerID, String location, float pay, String length, String position, String jobDescrip, ArrayList<String> sklls, ArrayList<UUID> studentIDS) {
        this.title = title;
        this.employerID = employerID;
        this.location = location;
        this.pay = pay;
        this.length = length;
        this.position = position;
        this.studentIDS = new ArrayList<UUID>();
        this.studentIDS = studentIDS;
        this.jobDescription = jobDescrip;
        this.skills = sklls;
    }

    public String getTitle() {
        return title;
    }

    public UUID getEmployerID() {
        return employerID;
    }

    public String getLocation() {
        return location;
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

    public ArrayList<UUID> getApplicants() {
        return this.studentIDS;
    }

    public String getJobDescription() {
        return this.jobDescription;
    }

    public ArrayList<String> getSkills() {
        return this.skills;
    }

    public void addApplicant(UUID studentID) {
        studentIDS.add(studentID); 
    }
}