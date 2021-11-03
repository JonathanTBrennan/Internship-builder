/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

 /**
  * Holds the education variables for each student user
  */
public class Education {
    private String university;
    private String degree;
    private String gradDate;

    /**
     * Constructor for each student user's education variables
     * @param university university student is attending / attended
     * @param degree degree student will recieve / recieved
     * @param gradDate date student wil graduate / graduated
     */
    public Education(String university, String degree, String gradDate){
        this.university = university;
        this.degree = degree;
        this.gradDate = gradDate;
    }

    /**
     * Empty constructor for a student's education information
     */
    public Education() {

    }
    
    /**
     * Getter for the university the student will attend
     * @return the university the student will attend
     */
    public String getUniversity() {
        return university;
    }

    /**
     * Getter for the degree the student will recieve
     * @return student's degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Getter for the date the student graduates
     * @return date student graduates
     */
    public String getGradDate() {
        return gradDate;
    }

    /**
     * Setter for the university the student attends
     * @param university
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     * Setter for the degree the student will recieve
     * @param student's degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * Setter for the date the student graduates
     * @param gradDate student graduates
     */
    public void setGradDate(String gradDate) {
        this.gradDate = gradDate;
    }
}
