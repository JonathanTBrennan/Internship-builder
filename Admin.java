public class Admin extends User{
    String username;
    String password;
    String email;
    String firstName;
    String lastName;

    public Admin(String userName, String password, String email, String firstName, String lastName){
        this.username = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
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
}
