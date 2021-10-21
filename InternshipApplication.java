import java.util.ArrayList;

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

    public JobListing addJobListing(float pay, String length, String position, String jobDescription, ArrayList<String> skills){
        return null;
    }

    public Rating addRating(int numRating, String comment, User member){
        return null;
    }

    public Rating editRating(Rating rating, int numRating, String comment, User member){
        return null;
    }

    public Rating deleteRating(Rating rating){
        return null;
    }

    public JobListing editListing(JobListing job, float pay, String length, String position, String jobDescription, ArrayList<String> skills){
        return null;
    }

    public JobListing deleteJobListing(JobListing job){
        return null;
    }

    public void Apply(JobListing job){
        
    }
}
