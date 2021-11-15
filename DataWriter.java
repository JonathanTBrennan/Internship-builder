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
    private static final String JOBLISTING_FILE = "jobListing.json";
    private static final String RATING_FILE = "rating.json";
    private static final String RESUME_FILE = "resume.json";
    private static final String USER_FILE = "user.json";

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
     * Saves a list of users to the user.json file
     */
    public static void saveUsers(ArrayList<User> users) {
        JSONArray userJSON = new JSONArray();
        for(int i=0; i<users.size(); i++) {
            JSONObject userDetails = new JSONObject();
            User user = users.get(i);
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
                studentIDS.add(jobListing.getApplicants().get(k).toString());
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

    public static void saveJobListing(ArrayList<JobListing> jobList) {
        JSONArray jobListJSON = new JSONArray();
        for(int i=0; i<jobList.size(); i++) {
            JobListing jobListing = jobList.get(i);
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
                studentIDS.add(jobListing.getApplicants().get(k).toString());
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
    public static void saveResume(ArrayList<Resume> resumes) {
        ResumeList resumeList = ResumeList.getInstance();
        JSONArray resumeListJSON = new JSONArray();
        for(int i=0; i<resumes.size(); i++) {
            Resume resume = resumes.get(i);
            JSONObject resumeDetails = new JSONObject();
            resumeDetails.put("id", resume.getStudentID().toString());
            JSONArray skills = new JSONArray();
            for(int j=0; j<resume.getSkills().size(); j++) {
                skills.add(resume.getSkills().get(j));
            }
            resumeDetails.put("skills", skills);
            resumeDetails.put("university", resume.getEducation().getUniversity());
            resumeDetails.put("degree", resume.getEducation().getDegree());
            resumeDetails.put("graduationDate", resume.getEducation().getGradDate());
            JSONArray company = new JSONArray();
            for(int j=0; j<resume.getWorkExperience().size(); j++) {
                company.add(resume.getWorkExperience().get(j).getCompany());
            }
            resumeDetails.put("company", company);
            JSONArray pos = new JSONArray();
            for(int j=0; j<resume.getWorkExperience().size(); j++) {
                pos.add(resume.getWorkExperience().get(j).getPosition());
            }
            resumeDetails.put("position", pos);
            JSONArray desc = new JSONArray();
            for(int j=0; j<resume.getWorkExperience().size(); j++) {
                desc.add(resume.getWorkExperience().get(j).getDesciption());
            }
            resumeDetails.put("jobdescription", desc);
            JSONArray duration = new JSONArray();
            for(int j=0; j<resume.getWorkExperience().size(); j++) {
                duration.add(resume.getWorkExperience().get(j).getDuration());
            }
            resumeDetails.put("duration", duration);
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