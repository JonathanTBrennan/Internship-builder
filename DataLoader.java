import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import javax.lang.model.util.ElementScanner6;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Written by team Portia Portia
 * This class loads a list of joblistings, Ratings, resumes, and Users from their respective json files
 */
public class DataLoader {

    // relative path to the file, based on the directory you currently have open
    private static final String JOBLISTING_FILE = "Internship-builder\\jobListing.json";
    private static final String RATING_FILE = "Internship-builder\\rating.json";
    private static final String RESUME_FILE = "Internship-builder\\resume.json";
    private static final String USER_FILE = "Internship-builder\\user.json";

    /**
     * Loads a list of users from user.json file
     * @return the list of users
     */
    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();

        try {
            FileReader reader = new FileReader(USER_FILE);
            JSONParser parser = new JSONParser();
            JSONArray userJSON = (JSONArray)new JSONParser().parse(reader);
            for(int i=0; i<userJSON.size(); i++) {
                JSONObject userJson = (JSONObject)userJSON.get(i);
                UUID userUUID = UUID.fromString((String)userJson.get("id"));
                int userType = ((Long)userJson.get("usertype")).intValue();
                String username = (String)userJson.get("username");
                String password = (String)userJson.get("password");
                String email = (String)userJson.get("email");
                String phone = (String)userJson.get("phone");
                String firstname = (String)userJson.get("firstName");
                String lastname = (String)userJson.get("lastName");
                if(userType == 0){
                    User user = new Admin(username, password, email, firstname, lastname, 0, phone, userUUID);
                    users.add(user);
                }
                else if(userType == 1){
                    User user = new Student(username, password, email, firstname, lastname, 1, phone, userUUID);
                    users.add(user);
                }
                else {
                    User user = new Employer(username, password, email, firstname, lastname, 2, phone, userUUID);
                    users.add(user);
                }
            }
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Loads a list of joblistings from 
     * @return the list of joblistings
     */
    public static ArrayList<JobListing> getJobListings() {
        ArrayList<JobListing> jobListings = new ArrayList<JobListing>();

        try {
            FileReader reader = new FileReader(JOBLISTING_FILE);
            JSONParser parser = new JSONParser();
            JSONArray jobListJSON = (JSONArray)new JSONParser().parse(reader);
            for(int i=0; i<jobListJSON.size(); i++) {
                JSONObject jobListingJSON = (JSONObject)jobListJSON.get(i);
                String title = (String)jobListingJSON.get("title");
                String location = (String)jobListingJSON.get("location");
                UUID employerID = UUID.fromString((String)jobListingJSON.get("employerID"));
                int pay = ((Long)jobListingJSON.get("pay")).intValue();
                String length = (String)jobListingJSON.get("length");
                String position = (String)jobListingJSON.get("position");
                String description = (String)jobListingJSON.get("description");
                ArrayList<String> skills = new ArrayList<String>();
                JSONArray skillsJSON = (JSONArray)jobListingJSON.get("skills");
                for (int j=0; j<skillsJSON.size(); j++) {
                    skills.add((String)skillsJSON.get(j));
                }
                ArrayList<UUID> studentIDS = new ArrayList<UUID>();
                JSONArray studentIDSJSON = (JSONArray)jobListingJSON.get("studentIDS");
                for (int j=0; j<studentIDSJSON.size(); j++) {
                    studentIDS.add(UUID.fromString((String)studentIDSJSON.get(j)));
                }
                JobListing jobListing = new JobListing(title, employerID, location, pay, length, position, description, skills, null, studentIDS);
                jobListings.add(jobListing);
            }
            return jobListings;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Loads a list of ratings from rating.json
     * @return List of ratings
     */
    public static ArrayList<Rating> getRatings() {
        ArrayList<Rating> ratings = new ArrayList<Rating>();
        UserList users = UserList.getInstance();
        try {
            FileReader reader = new FileReader(RATING_FILE);
            JSONParser parser = new JSONParser();
            JSONArray ratingsJSON = (JSONArray)new JSONParser().parse(reader);
            for(int i=0; i<ratingsJSON.size(); i++) {
                JSONObject ratingJSON = (JSONObject)ratingsJSON.get(i);
                String userName = (String)ratingJSON.get("userName");
                int numberRating = ((Long)ratingJSON.get("numberRating")).intValue();
                String description  = (String)ratingJSON.get("description");
                User user = users.getUser(userName);
                ratings.add(new Rating(numberRating, description, user));
            }
            return ratings;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * loads a list of resumes from resume.json
     * @return the list of resumes
     */
    public static ArrayList<Resume> getResumes() {
        ArrayList<Resume> resumes = new ArrayList<Resume>();
        try {
            FileReader reader = new FileReader(RESUME_FILE);
            JSONParser parser = new JSONParser();
            JSONArray resumesJSON = (JSONArray)new JSONParser().parse(reader);
            for(int i=0; i<resumesJSON.size(); i++) {
                JSONObject resumeJSON = (JSONObject)resumesJSON.get(i);
                UUID studentID = UUID.fromString((String)resumeJSON.get("id"));
                JSONArray skillsArray = (JSONArray)resumeJSON.get("skills");
                ArrayList<String> skills = new ArrayList<String>();
                for(int j=0; j<skillsArray.size(); j++) {
                    skills.add((String)skillsArray.get(j));
                }
                String university = (String)resumeJSON.get("university");
                String degree = (String)resumeJSON.get("degree");
                String graduation = (String)resumeJSON.get("graduationDate");
                Education education = new Education(university, degree, graduation);
                ArrayList<Experience> experiences = new ArrayList<Experience>();
                JSONArray companyArray = (JSONArray)resumeJSON.get("company");
                JSONArray positionArray = (JSONArray)resumeJSON.get("position");
                JSONArray descriptionArray = (JSONArray)resumeJSON.get("jobdescription");
                JSONArray durationArray = (JSONArray)resumeJSON.get("duration");
                for(int k=0; k<companyArray.size(); k++) {
                    String company = (String)companyArray.get(k);
                    String position = (String)positionArray.get(k);
                    String description = (String)descriptionArray.get(k);
                    String duration = (String)durationArray.get(k);
                    experiences.add(new Experience(company, position, description, duration));
                }
                resumes.add(new Resume(studentID, skills, experiences, education));
            }
            return resumes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}