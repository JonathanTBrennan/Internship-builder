/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Resume created by a student
 */
public class Resume {
    private UUID studentID;
    private ArrayList<String> skills;
    private ArrayList<Experience> workExperience;
    private Education education;

    /**
     * Constructor for an empty resume
     */
    public Resume(){
        skills = new ArrayList<String>();
        workExperience = new ArrayList<Experience>();
    }

    /**
     * Constructor for a resume with the information sent it
     * @param studentID student whose resume this is
     * @param skills programming languages known by the student
     * @param workExperiences work experiences of the student
     * @param educationExperience education of the student
     */
    public Resume(UUID studentID, ArrayList<String> skills, ArrayList<Experience> workExperiences, Education educationExperience) {
        this.studentID = studentID;
        this.skills = skills;
        this.workExperience = workExperiences;
        this.education = educationExperience;
    }

    /**
     * Adds a skill to the list of the resume's skills
     * @param skill being added
     */
    public void addSkill(String skill) {
        skills.add(skill);
    }

    /**
     * Adds a work experience to the list of the resume's work experiences
     * @param experience being added
     */
    public void addWorkExperience(Experience experience) {
        if(workExperience == null) {
            workExperience = new ArrayList<Experience>();
        }
        workExperience.add(experience);
    }
    
    /**
     * Sets the education level of the student
     * @param education level of the student
     */
    public void setEducation(Education education) {
        this.education = education;
    }

    /**
     * Sets the student's ID for the resume
     * @param ID being attached to the resume
     */
    public void setStudentID(UUID ID) {
        this.studentID = ID;
    }
    
    /**
     * Gets the student whose resume this is' ID
     * @return the ID of the student whose resume this is
     */
    public UUID getStudentID() {
        return studentID;
    }

    /**
     * Gets the list of skills from the resume
     * @return list of skills
     */
    public ArrayList<String> getSkills(){
        return skills;
    }

    /**
     * Gets the list of work experience from the resume
     * @return list of work experience
     */
    public ArrayList<Experience> getWorkExperience(){
        return workExperience;
    }

    /**
     * Gets the education information of the resume
     * @return the education information
     */
    public Education getEducation(){
        return education;
    }

    /**
     * Concatenates the resume's skills into a readable string
     * @return the readable string
     */
    public String skillBuilder() {
        String skillsBuilt = "";
            for (int i = 0; i < this.skills.size()-1; i++) {
                skillsBuilt += this.skills.get(i) + ", ";
            }
            skillsBuilt += this.skills.get(this.skills.size()-1);
        return skillsBuilt;
    }

    /**
     * Turns the resume's information into a readable, formatted text file
     */
    public void ResumeToText() {
        try {
            FileWriter resumeWriter = new FileWriter("Resume.txt");
            resumeWriter.write("Skills: ");
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
