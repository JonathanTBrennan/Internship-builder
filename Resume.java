import java.util.ArrayList;
import java.util.UUID;

public class Resume {
    private UUID studentID;
    private ArrayList<String> skills;
    private ArrayList<Experience> workExperience;
    private ArrayList<Education> educationExperience;

    public Resume(){
        skills = new ArrayList<String>();
        workExperience = new ArrayList<Experience>();
        educationExperience = new ArrayList<Education>();
    }

    public Resume(UUID studentID, ArrayList<String> skills, ArrayList<Experience> workExperiences, ArrayList<Education> educationExperience) {
        this.studentID = studentID;
        this.skills = skills;
        this.workExperience = workExperiences;
        this.educationExperience = educationExperience;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void addWorkExperience(Experience experience) {
        workExperience.add(experience);
    }

    public void addEducation(Education education){
        educationExperience.add(education);
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

    public ArrayList<Education> educationExperience(){
        return educationExperience;
    }
}
