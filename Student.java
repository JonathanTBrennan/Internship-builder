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

    public Student() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public int getUserType() {
        return userType;
    }

    public String getPhone() {
        return phoneNum;
    }

    public void setPhone(String phone) {
        this.phoneNum = phone;
    }

    public UUID getID() {
        return id;
    }
}
