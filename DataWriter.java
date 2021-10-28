import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter {
    private static final String JOBLISTING_FILE = "Internship-builder\\jobListing.json";
    private static final String RATING_FILE = "Internship-builder\\rating.json";
    private static final String RESUME_FILE = "Internship-builder\\resume.json";
    private static final String USER_FILE = "internship-builder\\user.json";

    public static void saveUsers() {
        UserList userList = UserList.getInstance();
        JSONArray userJSON = new JSONArray();
        for(int i=0; i<userList.getUsers().size(); i++) {
            JSONObject userDetails = new JSONObject();
            User user = userList.getUsers().get(i);
            userDetails.put("userUUID", user.getID());
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
            jobListJSON.add(jobDetails);
        }

        try (FileWriter file = new FileWriter(JOBLISTING_FILE)) {
            file.write(jobListJSON.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

    public static void saveResume() {
        ResumeList resumeList = ResumeList.getInstance();
        ArrayList<Resume> resumes = resumeList.getResumes();
        JSONArray resumeListJSON = new JSONArray();
        for(int i=0; i<resumes.size(); i++) {
            Resume resume = resumes.get(i);
            JSONObject resumeDetails = new JSONObject();
            resumeDetails.put("id", resume.getStudentID());

        }
    }
}