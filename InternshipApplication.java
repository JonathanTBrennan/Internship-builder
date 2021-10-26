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

    public boolean login(String userName, String password){
        user = UserList.getInstance().getUser(userName);
        if (user == null) {
            return false;
        }
        else {
            if (user.getPassword() == password) {
                return true;
            }
            return false;
        }
    }

    public JobListing addJobListing(String titl, UUID employerID, float pay, String location, String length, String position, String jobDescription, ArrayList<String> skills){
        JobListing newJob = new JobListing(titl, employerID, location, pay, length, position, jobDescription, skills);
        return newJob;
    }

    public Rating addRating(int numRating, String comment, User user){
        Rating newRating = new Rating(numRating, comment, user);
        return newRating;
    }

    /**
     * Edits a current rating
     * 
     * @param rating the rating to be edited
     * @param numRating new numerical value of the rating
     * @param comment new comment on the rating
     * @return a refreshed version of the rating list with the edited rating
     */
    public RatingList editRating(Rating rating, int numRating, String comment){
        rating.editRating(rating, numRating, comment);
        return RatingList.getInstance();
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
    public void Apply(JobListing job, Student stu) {
        job.addApplicant(stu.getID());
    }
}
