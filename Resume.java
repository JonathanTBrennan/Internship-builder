import java.util.ArrayList;

public class Resume {
    private ArrayList<String> skills;
    private ArrayList<String> description;
    private ArrayList<Experience> workExperience;
    private ArrayList<Education> educationExperience;

    public Resume(){
        skills = new ArrayList<String>();
        description = new ArrayList<String>();
        workExperience = new ArrayList<Experience>();
        educationExperience = new ArrayList<Education>();
    }

    public void addSkill(String skills){
        //skills.add(skills);
    }
    public void addDescription(String description){
        //description.add("");
    }
    public void addWorkExperience(Experience experience){
        workExperience.add(experience);
    }
    public void addEducation(Education education){
        educationExperience.add(education);
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
