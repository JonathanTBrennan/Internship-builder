/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

/**
 * Holds the variables for a resume's work experience
*/
public class Experience {
    private String company;
    private String position;
    private String description;
    private String duration;

    /**
     * Constructor for a work experience's variables
     * @param company where a student worked
     * @param position position student held
     * @param description description of what the student did at work
     * @param duration how long this work lasted
     */
    public Experience(String company, String position, String description, String duration) {
        this.company = company;
        this.position = position;
        this.description = description;
        this.duration = duration;
    }
    
    /**
     * Empty constructor for a work experience
     */
    public Experience() {

    }

    /**
     * Getter for the company a student worked for
     * @return company a student worked for
     */
    public String getCompany() {
        return company;
    }

    /**
     * Getter for the position a student held
     * @return position student held
     */
    public String getPosition() {
        return position;
    }

    /**
     * Getter for the description of a student's work experience
     * @return description of a student's work experience
     */
    public String getDesciption() {
        return description;
    }

    /**
     * Getter for the duration of the job
     * @return duration of the job
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Setter for the company the student worked at
     * @param company name of company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Setter for the position the student held
     * @param position the student held @ the job
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Setter for the description of the work experience
     * @param description of the work experience
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Setter for the duration of the work experience
     * @param duration of the work experience
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
}