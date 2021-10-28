import java.util.UUID;
public class Student extends User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int userType;
    private String phoneNum;
    private UUID id;

    public Student(String username, String password, String email, String firstName, String lastName, int userType, String phoneNum, UUID id) {
        super(username, password, email, firstName, lastName, userType, phoneNum, id);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.phoneNum = phoneNum;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUserType() {
        return userType;
    }

    public String getPhone() {
        return phoneNum;
    }

    public UUID getID() {
        return id;
    }
    
}
