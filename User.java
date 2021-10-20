import java.util.UUID;
public abstract class User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private UUID id;
    private int userType;

    public User(String username, String password, String email, String firstName, String lastName, int userType, UUID id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.userType = userType;
    }

    public abstract String getUsername();
    public abstract String getPassword();
    public abstract String getEmail();
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract UUID getID();
    public abstract int getUserType();
}