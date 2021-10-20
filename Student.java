public class Student extends WorkforceMember {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int userType;
    private String id;

    public Student(String username, String password, String email, String firstName, String lastName,int userType, String id) {
        super(username, password, email, firstName, lastName,userType, id);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
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
    public String getID() {
        return id;
    }
    public void uuID() {

    }
    public void userType() {
        if(userType == 1){
            userType = 1;
        }
        else {
            
        }
    }
    public void firstName() {
        
    }

    public void lastName() {

    }

    public void email() {

    }
}
