import java.util.ArrayList;
import java.util.UUID;

public class InternshipApplication {
    JobList jobListing;
    UserList userList;
    User user;

    public InternshipApplication(){
        
    }

    public ArrayList<JobListing> findJobs(){
        return null;
    }

    public User createAccount(String username, String password, String email, String firstName, String lastName){
        return null;
    }

    public User login(String userName, String password){
        return null;
    }

    public JobListing addJobListing(String titl, UUID employerID, float pay, String length, String position, String jobDescription, ArrayList<String> skills){
        JobListing newJob = new JobListing(titl, employerID, pay, length, position, jobDescription, skills);
        return newJob;
    }

    public Rating addRating(int numRating, String comment, User user){
        Rating newRating = new Rating(numRating, comment, user);
        return newRating;
    }

    public Rating editRating(Rating rating, int numRating, String comment, User user){
       
        return null;
    }

    public Rating deleteRating(Rating rating){
        //fix rating ID
        return rating.getRatings().remove(rating.getNumRating());
    }

    public JobListing editListing(JobListing job, float pay, String length, String position, String jobDescription, ArrayList<String> skills) {
        return null;
    }

    public JobListing deleteJobListing(JobListing job) {
        return null;
    }

    public void Apply(JobListing job) {
        
    }
    public void Apply(JobListing job, UUID stu) {
        job.addApplicant(stu);
    }
}
