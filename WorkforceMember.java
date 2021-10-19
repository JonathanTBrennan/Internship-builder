public abstract class WorkforceMember {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int userType;
    private String id;
 
    public WorkforceMember(String username, String password, String email, String firstName, String lastName, int userType, String id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public abstract String getEmail();
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract int getUserType();
    public abstract String getID();
}