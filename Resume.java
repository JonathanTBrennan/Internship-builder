import java.util.ArrayList;

public class Resume {
    private ArrayList<String> skills;
    private ArrayList<String> descriptions;
    private ArrayList<String> languages;
    private ArrayList<Experience> workExperience;
    private ArrayList<Education> educationExperience;

    public Resume(){
        skills = new ArrayList<String>();
        descriptions = new ArrayList<String>();
        languages = new ArrayList<String>();
        workExperience = new ArrayList<Experience>();
        educationExperience = new ArrayList<Education>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }
    public void addDescription(String description) {
        descriptions.add(description);
    }
    public void addLanguage(String language) {
        languages.add(language);
    }
    public void addWorkExperience(Experience experience) {
        workExperience.add(experience);
    }
    public void addEducation(Education education){
        educationExperience.add(education);
    }

    public ArrayList<String> getSkills(){
        return skills;
    }

    public ArrayList<String> getDescription() {
        return descriptions;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }
    public ArrayList<Experience> getWorkExperience(){
        return workExperience;
    }

    public ArrayList<Education> educationExperience(){
        return educationExperience;
    }
}
