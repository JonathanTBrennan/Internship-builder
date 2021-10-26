import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader {

    // relative path to the file, based on the directory you currently have open
    private static final String ADMIN_FILE = "Internship-builder\\admin.json";
    private static final String EDUCATION_FILE = "Internship-builder\\education.json";
    private static final String EMPLOYER_FILE = "Internship-builder\\employer.json";
    private static final String EXPERIENCE_FILE = "Internship-builder\\experience.json";
    private static final String JOBLISTING_FILE = "Internship-builder\\jobListing.json";
    private static final String RATING_FILE = "Internship-builder\\rating.json";
    private static final String RESUME_FILE = "Internship-builder\\resume.json";
    private static final String STUDENT_FILE = "Internship-builder\\student.json";
    private static final String USER_FILE = "Internship-builder\\user.json";

    public static ArrayList<UserList> getUsers() {
        ArrayList<UserList> users = new ArrayList<UserList>();

        try {
            FileReader reader = new FileReader(USER_FILE);
            JSONParser parser = new JSONParser();
            JSONArray userJSON = (JSONArray)new JSONParser().parse(reader);
            for(int i=0; i<userJSON.size(); i++) {
                JSONObject userJson = (JSONObject)userJson.get(i);
                UUID userUUID = UUID.fromString((String)userJSON.get("userID"));
                
            }
        }
    }

    public static ArrayList<JobListing> getJobListings() {
        ArrayList<JobListing> jobListings = new ArrayList<JobListing>();

        try {
            FileReader reader = new FileReader(JOBLISTING_FILE);
            JSONParser parser = new JSONParser();
            JSONArray jobListJSON = (JSONArray)new JSONParser().parse(reader);
            for(int i=0; i<jobListJSON.size(); i++) {
                JSONObject jobListingJSON = (JSONObject)jobListJSON.get(i);
                String title = (String)jobListingJSON.get("title");
                UUID employerID = UUID.fromString((String)jobListingJSON.get("employerID"));
                String location = (String)jobListingJSON.get("location");
                float pay = ((Long)jobListingJSON.get("pay")).floatValue();
                String length = (String)jobListingJSON.get("length");
                String position = (String)jobListingJSON.get("position");
                String description = (String)jobListingJSON.get("description");
                ArrayList<String> skills = new ArrayList<String>();
                JSONArray skillsJSON = (JSONArray)new JSONParser().parse("skills");
                for (int j=0; j<skillsJSON.size(); j++) {
                    skills.add((String)skillsJSON.get(j));
                }
                ArrayList<UUID> studentIDS = new ArrayList<UUID>();
                JSONArray studentIDSJSON = (JSONArray)new JSONParser().parse("studentIDS");
                for (int j=0; j<studentIDSJSON.size(); j++) {
                    studentIDS.add(UUID.fromString((String)studentIDSJSON.get(j)));
                }
                JobListing jobListing = new JobListing(title, employerID, location, pay, length, position, description, skills, studentIDS);
                jobListings.add(jobListing);
            }
            return jobListings;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Rating> getRatings() {
        return null;
    }
}