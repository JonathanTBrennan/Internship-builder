/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

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

    public Education educationExperience(){
        return education;
    }
}
