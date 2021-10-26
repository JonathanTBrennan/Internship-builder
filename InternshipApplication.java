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

    /**
     * Creates an account based on information given by user
     * 
     * @param username username entered by user
     * @param password password entered by user
     * @param email email entered by user
     * @param firstName first name entered by user
     * @param lastName last name entered by user
     * @param location location of company entered if user is employer
     * @param company name of company entered if user is employer
     * @param userType type of account being created
     * @param phoneNum phone number entered by user
     * @param ID random ID associated with account
     * @return the user's created account
     */
    public User createAccount(String username, String password, String email, String firstName, String lastName, String location, String company, int userType, String phoneNum, UUID ID){
        if (userType == 0) {
            user = new Admin(username, password, email, firstName, lastName, userType, phoneNum, ID);
        }
        else if (userType == 1) {
            user = new Student(username, password, email, firstName, lastName, userType, phoneNum, ID);
        }
        else if (userType == 2) {
            user = new Employer(username, password, email, firstName, lastName, location, company, userType, phoneNum, ID);
        }
        UserList.getInstance().addUser(user);
        return user;
    }

    /**
     * Deals with checking if user successfully logs in
     * 
     * @param userName username entered by user
     * @param password password entered by user
     * @return true if user logs in, false if unable
     */
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

    /**
     * Adds a job listing to the current list of jobs
     * 
     * @param title identifying name of the internship being listed
     * @param employerID random ID tied to the employer's account
     * @param pay what the internship would pay an applicant
     * @param location location of the internship
     * @param length length of the internship
     * @param position what position the intern would hold
     * @param jobDescription description of the internship being listed
     * @param skills skills required for the internship
     * @return the created job listing
     */
    public JobListing addJobListing(String title, UUID employerID, float pay, String location, String length, String position, String jobDescription, ArrayList<String> skills){
        JobListing newJob = new JobListing(title, employerID, location, pay, length, position, jobDescription, skills);
        return newJob;
    }

    /**
     * Adds a new rating to a user's account
     * 
     * @param numRating numerical value of the rating
     * @param comment comment attached to the rating
     * @param user user who is recieving the rating
     * @return the newly added rating
     */
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

    /**
     * Deletes a rating attached to a user's account
     * 
     * @param rating the rating to delete
     * @return newly refreshed list of the ratings with the requested rating deleted
     */
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
