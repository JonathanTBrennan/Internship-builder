import java.util.UUID;

public class Admin extends User{
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private UUID id;
    private int userType;

    public Admin(String username, String password, String email, String firstName, String lastName, int userType, UUID id) {
        super(username, password, email, firstName, lastName, userType, id);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail(){
        return email;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getUserType() {
        return userType;
    }

    public UUID getID() {
        return id;
    }
}
