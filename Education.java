/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

public class Education {
    private String university;
    private String degree;
    private String gradDate;

    public Education(String university, String degree, String gradDate){
        this.university = university;
        this.degree = degree;
        this.gradDate = gradDate;
    }

    public Education() {

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

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setGradDate(String gradDate) {
        this.gradDate = gradDate;
    }
}
