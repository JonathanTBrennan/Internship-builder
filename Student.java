import java.util.UUID;
public class Student extends User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int userType;
    private Resume resume;
    private UUID id;

    public Student(String username, String password, String email, String firstName, String lastName,int userType, UUID id, Resume resume) {
        super(username, password, email, firstName, lastName, userType, id);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.resume = resume;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void Apply(JobListing jobListing) {
        //has job listing
        //add user to the jobListing list of applicants

    }
    public int getUserType() {
        return userType;
    }
    public UUID getID() {
        return id;
    }
    
}
