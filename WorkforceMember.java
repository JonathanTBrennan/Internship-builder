import java.util.UUID;

public abstract class WorkforceMember extends User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int userType;
    private UUID id;
 
    public WorkforceMember(String username, String password, String email, String firstName, String lastName, int userType, UUID id) {
        super(username, password, email, firstName, lastName, userType, id);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.id = id;
    }
    public abstract String getUsername();
    public abstract String getPassword();
    public abstract String getEmail();
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract int getUserType();
    public abstract UUID getID();
}