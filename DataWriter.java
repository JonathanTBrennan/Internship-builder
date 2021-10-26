import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter {
    private static final String EMPLOYER_FILE = "Internship-builder\\employer.json";
    private static final String JOBLISTING_FILE = "Internship-builder\\jobListing.json";
    private static final String RATING_FILE = "Internship-builder\\rating.json";
    private static final String RESUME_FILE = "Internship-builder\\resume.json";

    public static void saveUsers() {

    }

    public static void saveJobListing() {
        JobList jobList = JobList.getInstance();
        JSONArray jobListJSON = new JSONArray();
        for(int i=0; i<jobList.getJobLists().size(); i++) {
            JobListing jobListing = jobList.getJob(i);
            JSONObject jobDetails = new JSONObject();
            jobDetails.put("title", jobListing.getTitle());
            jobDetails.put("employerID", jobListing.getEmployerID().toString());
            jobDetails.put("pay", jobListing.getPay());
            jobDetails.put("length", jobListing.getLength());
            jobDetails.put("position", jobListing.getPosition());
            jobDetails.put("description", jobListing.getJobDescription());
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

    }
}