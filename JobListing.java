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
    private int pay;
    private String length;
    private String position;
    private ArrayList<UUID> studentIDS;
    private String jobDescription;
    private ArrayList<String> skills;
    private int ID;
    private CodingFilters codeFilter;

    /**
     * Constructor for each new job listing
     * 
     * @param title Title of the job listing
     * @param employerID ID of the employer creating the job listing
     * @param location Location of the job listing
     * @param pay Pay for the job listing
     * @param length Length of the job listing
     * @param position Position of the job listing
     * @param jobDescrip Description of the job listing
     * @param sklls Skills required for the job listing
     * @param codeFilter Coding languages required for the job listing
     * @param studentIDS List of IDs of the applicants
     */
    public JobListing(String title, UUID employerID, String location, int pay, String length, String position, String jobDescrip, ArrayList<String> sklls, CodingFilters codeFilter, ArrayList<UUID> studentIDS) {
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
        this.codeFilter = codeFilter;
        //this.ID = JobList.getJobListings().size();
    }

    /**
     * Getter for the job's title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter for the employer's ID
     * @return employer's UUID
     */
    public UUID getEmployerID() {
        return employerID;
    }

    /**
     * Getter for the job's location
     * @return location
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Getter for the job's pay
     * @return pay
     */
    public int getPay() {
        return this.pay;
    }

    /**
     * Getter for the job's length
     * @return length
     */
    public String getLength() {
        return this.length;
    }

    /**
     * Getter for the job's position
     * @return position
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * Getter for the job's list of applicants
     * @return list of applicant IDs
     */
    public ArrayList<UUID> getApplicants() {
        return this.studentIDS;
    }

    /**
     * Getter for the job's description
     * @return job description
     */
    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * Getter for the job's required skills
     * @return list of required skills
     */
    public ArrayList<String> getSkills() {
        return this.skills;
    }

    /**
     * Getter for the jobs's identifier
     * @return jobs's identifier
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Getter for the 
     * @return job's required coding languages
     */
    public CodingFilters getCodeFilter() {
        return this.codeFilter;
    }

    /**
     * Setter for the new ID of a job listing
     * @param ID the new ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Adds a student to the list of applicants for a job listing
     * @param studentID ID of the applicant
     */
    public void addApplicant(UUID studentID) {
        studentIDS.add(studentID); 
    }

    /**
     * Edits a listing attached to an employer's account
     * 
     * @param job Job listing that is being edited
     * @param title New title of the job listing
     * @param location New location of the job listing
     * @param pay New pay of the job listing
     * @param length New length of the job listing
     * @param position New position of the job listing
     * @param jobDescription New description of the job listing
     * @param skills New skills required by the job listing
     */
    public void editJobListing(JobListing job, String title, String location, int pay, String length, String position, String jobDescription, ArrayList<String> skills) {
        job.title = title;
        job.location = location;
        job.pay = pay;
        job.length = length;
        job.position = position;
        job.jobDescription = jobDescription;
        job.skills = skills;
    }

    public String toString() {
        String ret = "";
        ret+= "Title: " +title;
        ret+= "\nLocation: " +location;
        ret+= "\nPay: " +pay;
        ret+= "\nLength: " +length;
        ret+= "\nPosition: " +position;
        ret+= "\nDescription: " +jobDescription;
        ret+= "\nSkills: ["+skills.get(0);
        for(int i = 1; i<skills.size(); i++) {
            ret+= ", "+skills.get(i);
        }
        ret+= "]";
        return ret;
    }
}