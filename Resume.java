/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class Resume {
    private UUID studentID;
    private ArrayList<String> skills;
    private ArrayList<Experience> workExperience;
    private Education education;

    public Resume(){
        skills = new ArrayList<String>();
        workExperience = new ArrayList<Experience>();
    }

    public Resume(UUID studentID, ArrayList<String> skills, ArrayList<Experience> workExperiences, Education educationExperience) {
        this.studentID = studentID;
        this.skills = skills;
        this.workExperience = workExperiences;
        this.education = educationExperience;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void addWorkExperience(Experience experience) {
        if(workExperience == null) {
            workExperience = new ArrayList<Experience>();
        }
        workExperience.add(experience);
    }
    
    public void setEducation(Education education) {
        this.education = education;
    }

    public void setStudentID(UUID ID) {
        this.studentID = ID;
    }
    
    public UUID getStudentID() {
        return studentID;
    }
    public ArrayList<String> getSkills(){
        return skills;
    }

    public ArrayList<Experience> getWorkExperience(){
        return workExperience;
    }

    public Education getEducation(){
        return education;
    }

    public String skillBuilder() {
        String skillsBuilt = "";
            for (int i = 0; i < this.skills.size()-1; i++) {
                skillsBuilt += this.skills.get(i) + ", ";
            }
            skillsBuilt += this.skills.get(this.skills.size()-1);
        return skillsBuilt;
    }

    public void ResumeToText() {
        try {
            FileWriter resumeWriter = new FileWriter("Resume.txt");
            ArrayList<User> users = DataLoader.getUsers();
            User user  = null;
            for(int i = 0; i<users.size(); i++) {
                if(studentID.equals(users.get(i).getID())) {
                    user = users.get(i);
                }
            }
            resumeWriter.write(user.getFirstName() + user.getLastName());
            resumeWriter.write("\n" +user.getEmail());
            resumeWriter.write("\n" +user.getPhone());
            resumeWriter.write("\nSkills: ");
            for (int i = 0; i<skills.size()-1; i++) {
                resumeWriter.write(skills.get(i));
                resumeWriter.write(", ");
            }
            resumeWriter.write(skills.get(skills.size()-1));
            resumeWriter.write("\n");
            resumeWriter.write("\n");
            resumeWriter.write("  -- Education --  ");
            resumeWriter.write("\n");
            resumeWriter.write("University: " + education.getUniversity());
            resumeWriter.write("\n");
            resumeWriter.write("Degree: " + education.getDegree());
            resumeWriter.write("\n");
            resumeWriter.write("Graduation Date: " + education.getGradDate());
            resumeWriter.write("\n");
            resumeWriter.write("\n");
            resumeWriter.write("  -- Work Experience --  ");
            resumeWriter.write("\n");
            for (int j = 0; j<workExperience.size()-1; j++) {
                Experience exp = workExperience.get(j);
                resumeWriter.write("Company: " +exp.getPosition() + " at " + exp.getCompany() + " for " + exp.getDuration());
                resumeWriter.write("\n");
                resumeWriter.write("Description: " + exp.getDesciption());
                resumeWriter.write("\n");
                resumeWriter.write("\n");
            }
            Experience exp = workExperience.get(workExperience.size()-1);
            resumeWriter.write("Company: " +exp.getPosition() + " at " + exp.getCompany() + " for " + exp.getDuration());
            resumeWriter.write("\n");
            resumeWriter.write("Description: " + exp.getDesciption());
            resumeWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
