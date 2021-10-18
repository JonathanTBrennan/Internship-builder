public abstract class WorkforceMember {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
 
    public WorkforceMember(String username, String password, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public abstract String getEmail();
    public abstract String getFirstName();
    public abstract String getLastName();
}