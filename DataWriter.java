import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Written by team Portia Portia
 * This class saves a list of joblistings, Ratings, resumes, and Users to a their respective json files
 */

public class DataWriter {
    private static final String JOBLISTING_FILE = "Internship-builder\\jobListing.json";
    private static final String RATING_FILE = "Internship-builder\\rating.json";
    private static final String RESUME_FILE = "Internship-builder\\resume.json";
    private static final String USER_FILE = "internship-builder\\user.json";

    /**
     * Saves a list of users to the user.json file
     */
    public static void saveUsers() {
        UserList userList = UserList.getInstance();
        JSONArray userJSON = new JSONArray();
        for(int i=0; i<userList.getUsers().size(); i++) {
            JSONObject userDetails = new JSONObject();
            User user = userList.getUsers().get(i);
            userDetails.put("id", user.getID());
            userDetails.put("usertype", user.getUserType());
            userDetails.put("username", user.getUsername());
            userDetails.put("password", user.getPassword());
            userDetails.put("email", user.getEmail());
            userDetails.put("phone", user.getPhone());
            userDetails.put("firstName", user.getFirstName());
            userDetails.put("lastName", user.getLastName());
            userJSON.add(userDetails);
        }
        try (FileWriter file = new FileWriter(USER_FILE)) {
            file.write(userJSON.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves a list of job listings to jobListing.json
     */
    public static void saveJobListing() {
        JobList jobList = JobList.getInstance();
        JSONArray jobListJSON = new JSONArray();
        for(int i=0; i<jobList.getJobLists().size(); i++) {
            JobListing jobListing = jobList.getJob(i);
            JSONObject jobDetails = new JSONObject();
            jobDetails.put("title", jobListing.getTitle());
            jobDetails.put("location", jobListing.getLocation());
            jobDetails.put("employerID", jobListing.getEmployerID().toString());
            jobDetails.put("pay", jobListing.getPay());
            jobDetails.put("length", jobListing.getLength());
            jobDetails.put("position", jobListing.getPosition());
            jobDetails.put("description", jobListing.getJobDescription());
            JSONArray skills = new JSONArray();
            for(int j = 0; j<jobListing.getSkills().size(); j++) {
                skills.add(jobListing.getSkills().get(j));
            }
            jobDetails.put("skills", skills);
            JSONArray studentIDS = new JSONArray();
            for(int k = 0; k<jobListing.getApplicants().size(); k++) {
                studentIDS.add(jobListing.getApplicants().get(k));
            }
            jobDetails.put("studentIDS", studentIDS);
            jobListJSON.add(jobDetails);
        }

        try (FileWriter file = new FileWriter(JOBLISTING_FILE)) {
            file.write(jobListJSON.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves a list of ratings to rating.json
     */
    public static void saveRating() {
        RatingList ratingList = RatingList.getInstance();
        ArrayList<Rating> ratings = ratingList.getRatings();
        JSONArray ratingListJSON = new JSONArray();
        for(int i=0; i<ratings.size(); i++) {
            Rating rating = ratings.get(i);
            JSONObject ratingDetails = new JSONObject();
            ratingDetails.put("userName", rating.getUser().getUsername());
            ratingDetails.put("numberRating", rating.getNumRating());
            ratingDetails.put("description", rating.getComment());
            ratingListJSON.add(ratingDetails);
        }
        try (FileWriter file = new FileWriter(RATING_FILE)) {
            file.write(ratingListJSON.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves a list of Resumes to resume.json
     */
    public static void saveResume() {
        ResumeList resumeList = ResumeList.getInstance();
        ArrayList<Resume> resumes = resumeList.getResumes();
        JSONArray resumeListJSON = new JSONArray();
        for(int i=0; i<resumes.size(); i++) {
            Resume resume = resumes.get(i);
            JSONObject resumeDetails = new JSONObject();
            resumeDetails.put("id", resume.getStudentID());
            JSONArray skills = new JSONArray();
            for(int j=0; j<resume.getSkills().size(); j++) {
                skills.add(resume.getSkills().get(j));
            }
            resumeDetails.put("skills", skills);
            resumeDetails.put("university", resume.educationExperience().getUniversity());
            resumeDetails.put("degree", resume.educationExperience().getDegree());
            resumeDetails.put("graduationDate", resume.educationExperience().getGradDate());
            for(int k=0; k<resume.getWorkExperience().size(); k++) {
                resumeDetails.put("company", resume.getWorkExperience().get(k).getCompany());
                resumeDetails.put("position", resume.getWorkExperience().get(k).getPosition());
                resumeDetails.put("jobdescription", resume.getWorkExperience().get(k).getDesciption());
                resumeDetails.put("duration", resume.getWorkExperience().get(k).getDuration());
            }
            resumeListJSON.add(resumeDetails);
        }
        try (FileWriter file = new FileWriter(RESUME_FILE)) {
            file.write(resumeListJSON.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}