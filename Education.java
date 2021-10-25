import java.util.ArrayList;
public class Education {
    private String university;
    private String degree;
    private String gradDate;
    private String location;
    private float gpa;
    private ArrayList<String> awardList;

    public Education(String university, String degree, String gradDate, String location, float gpa){
        this.university = university;
        this.degree = degree;
        this.gradDate = gradDate;
        this.location = location;
        this.gpa = gpa;
        awardList = new ArrayList<String>();
    }
    public String getUniversity() {
        return university;
    }

    public String getDegree() {
        return degree;
    }

    public String getGradDate() {
        return gradDate;
    }

    public String getLocation() {
        return location;
    }
    
    public float getGpa() {
        return gpa;
    }

    public ArrayList<String> getAwards() {
        return awardList;
    }
    
    
    public void addAwards(String awards) {
        awardList.add(awards);
    }
}
