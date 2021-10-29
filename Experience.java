import java.util.ArrayList;

public class Experience {
    private ArrayList<String> company;
    private ArrayList<String> position;
    private ArrayList<String> description;
    private ArrayList<String> duration;

    public Experience(ArrayList<String> company, ArrayList<String> position, ArrayList<String> description, ArrayList<String> duration) {
        this.company = new ArrayList<String>();
        this.position = new ArrayList<String>();
        this.description = new ArrayList<String>();
        this.duration = new ArrayList<String>();
    }

    public ArrayList<String> getCompany() {
        return company;
    }

    public ArrayList<String> getPosition() {
        return position;
    }

    public ArrayList<String> getDesciption() {
        return description;
    }

    public ArrayList<String> getDuration() {
        return duration;
    }

    public void addCompany(String companies) {
        company.add(companies);
    }

    public void addPosition(String positions) {
        position.add(positions);
    }

    public void addDescription(String descriptions) {
        description.add(descriptions);
    }

    public void addDuration(String durations) {
        duration.add(durations);
    }
}