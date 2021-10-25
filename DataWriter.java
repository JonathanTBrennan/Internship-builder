import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter {
    private static final String ADMIN_FILE = "Internship-builder\\admin.json";
    private static final String EDUCATION_FILE = "Internship-builder\\education.json";
    private static final String EMPLOYER_FILE = "Internship-builder\\employer.json";
    private static final String EXPERIENCE_FILE = "Internship-builder\\experience.json";
    private static final String JOBLISTING_FILE = "Internship-builder\\jobListing.json";
    private static final String RATING_FILE = "Internship-builder\\rating.json";
    private static final String RESUME_FILE = "Internship-builder\\resume.json";
    private static final String STUDENT_FILE = "Internship-builder\\student.json";

    public static void saveUsers() {

    }

    public static void saveJobListing() {
        JobList jobList = JobList.getInstance();
        ArrayList<JobListing> jobListings = jobList.getJobListings();
        JSONArray jobListJSON = new JSONArray();
        for(int i=0;i<jobListings.size(); i++) {
            JobListing jobListing = jobListings.get(i);
            JSONObject jobDetails = new JSONObject();
            jobDetails.put("title", jobListing.getTitle());
            jobDetails.put("employerID", jobListing.getEmployerID().toString());
            jobDetails.put("pay", jobListing.getPay());
            jobDetails.put("length", jobListing.getLength());
            jobDetails.put("position", jobListing.getPosition());
            jobDetails.put("description", jobListing.getJobDescription());
        }

        try (FileWriter file = new FileWriter(JOBLISTING_FILE)) {
            file.write(jobListJSON.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveRating() {
        
    }
}