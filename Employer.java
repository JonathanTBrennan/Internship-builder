import java.util.UUID;

public class Employer extends WorkforceMember{
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String location;
    private String company;
    private int userType;
    private UUID id;

    public Employer(String username, String password, String email, String firstName, String lastName, String location, String company, int userType, UUID id) {
        super(username, password, email, firstName, lastName, userType, id);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.company = company;
        this.userType = userType;
        this.id = id;
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

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getLocation(){
        return location;
    }

    public String getCompany(){
        return company;
    }

    public int getUserType(){
        return userType;
    }

    public UUID getID() {
        return id;
    }
}
