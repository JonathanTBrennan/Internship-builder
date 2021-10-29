import java.util.ArrayList;
public class Education {
    private String university;
    private String degree;
    private String gradDate;

    public Education(String university, String degree, String gradDate){
        this.university = university;
        this.degree = degree;
        this.gradDate = gradDate;
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
}
