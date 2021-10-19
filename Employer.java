public class Employer extends WorkforceMember{
    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    String location;
    String company;
    int userType;

    public Employer(String username, String password, String email, String firstName, String lastName, String location, String company, int userType) {
        super(username, password, email, firstName, lastName, userType);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.company = company;
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
}
