import java.util.ArrayList;

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
}