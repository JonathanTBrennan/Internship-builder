import java.util.ArrayList;

public class Resume {
    ArrayList<String> skills;
    ArrayList<String> description;
    ArrayList<String> languages;
    ArrayList<Experience> workExperience;
    ArrayList<Education> educationExperience;

    public Resume(ArrayList<String> skills, ArrayList<String> description, ArrayList<String> languages, ArrayList<Experience> workExperience, ArrayList<Education> educationExperience){
        this.skills = skills;
        this.description = description;
        this.languages = languages;
        this.workExperience = workExperience;
        this.educationExperience = educationExperience;
    }

    public void addSkill(String skills){

    }

    public ArrayList<String> getSkills(){
        return skills;
    }

    public ArrayList<String> getLanguages(){
        return languages;
    }

    public ArrayList<Experience> getWorkExperience(){
        return workExperience;
    }

    public ArrayList<Education> educationExperience(){
        return educationExperience;
    }
}
