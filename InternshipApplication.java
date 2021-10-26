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

    public JobListing addJobListing(String titl, UUID employerID, float pay, String location, String length, String position, String jobDescription, ArrayList<String> skills){
        JobListing newJob = new JobListing(titl, employerID, location, pay, length, position, jobDescription, skills);
        return newJob;
    }

    public Rating addRating(int numRating, String comment, User user){
        Rating newRating = new Rating(numRating, comment, user);
        return newRating;
    }

<<<<<<< HEAD
    public RatingList editRating(Rating rating, int numRating, String comment){
        rating.editRating(rating, numRating, comment);
        return RatingList.getInstance();
=======
    public Rating editRating(Rating rating, int numRating, String comment, User user){
       
        return null;
>>>>>>> 0b72fe83bcf71a99de707407a0acf56b850dec26
    }

    public RatingList deleteRating(Rating rating){
        return RatingList.getInstance().deleteRating(rating.getID());
    }

    public JobListing editListing(JobListing job, float pay, String length, String position, String jobDescription, ArrayList<String> skills) {
        return null;
    }

    public JobListing deleteJobListing(JobListing job) {
        return null;
    }

    public void Apply(JobListing job) {
        
    }
<<<<<<< HEAD
    public void Apply(JobListing job, Student stu) {
        job.addApplicant(stu.getID());
=======
    public void Apply(JobListing job, UUID stu) {
        job.addApplicant(stu);
>>>>>>> 0b72fe83bcf71a99de707407a0acf56b850dec26
    }
}
