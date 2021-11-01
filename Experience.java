/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

public class Experience {
    private String company;
    private String position;
    private String description;
    private String duration;

    public Experience(String company, String position, String description, String duration) {
        this.company = company;
        this.position = position;
        this.description = description;
        this.duration = duration;
    }
    
    public Experience() {

    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public String getDesciption() {
        return description;
    }

    public String getDuration() {
        return duration;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}