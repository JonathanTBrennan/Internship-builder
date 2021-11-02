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
        workExperience.add(experience);
    }
    
    public void setEducation(Education education) {
        this.education = education;
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

    public Education educationExperience(){
        return education;
    }

    public void ResumeToText() {
        try {
            FileWriter resumeWriter = new FileWriter("Internship-builder\\Resume.txt");
            resumeWriter.write("Skills: ");
            for (int i = 0; i<skills.size(); i++) {
                resumeWriter.write(skills.get(i));
            }
            resumeWriter.write("Education: ");
            resumeWriter.write("University: " + education.getUniversity());
            resumeWriter.write("Degree: " + education.getDegree());
            resumeWriter.write("Graduation Date: " + education.getGradDate());
            resumeWriter.write("Work Experience: ");
            for (int j = 0; j<workExperience.size(); j++) {
                Experience exp = workExperience.get(j);
                resumeWriter.write("Company: " +exp.getCompany());
                resumeWriter.write("Position: " + exp.getPosition());
                resumeWriter.write("Description: " + exp.getDesciption());
                resumeWriter.write("Duration: " + exp.getDuration());
            }
            resumeWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
