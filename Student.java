public class Student extends WorkforceMember {
    public String username;
    public String password;
    public String email;
    public String firstName;
    public String lastName;
    public int userType;

    public Student(String username, String password, String email, String firstName, String lastName, int userType) {
        super(username, password, email, firstName, lastName, userType);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
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

    public int getUserType(){
        return userType;
    }
}
