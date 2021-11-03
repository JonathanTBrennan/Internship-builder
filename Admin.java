/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.UUID;


/**
 * WE DIDN'T FINISH ADMIN FUNCTIONALITY // NEVER USED IT SO IT IS UNCOMMENTED
 */


/**
 * Type of user who administrates and has the "master key" to aspects the program,
 * including student accounts and resumes, job listings, and ratings
 */
public class Admin extends User{
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int userType;
    private String phoneNum;
    private UUID ID;

    /**
     * 
     * @param username
     * @param password
     * @param email
     * @param firstName
     * @param lastName
     * @param userType
     * @param phoneNum
     * @param ID
     */
    public Admin(String username, String password, String email, String firstName, String lastName, int userType, String phoneNum, UUID ID) {
        super(username, password, email, firstName, lastName, userType, phoneNum, ID);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.phoneNum = phoneNum;
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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

    public int getUserType() {
        return userType;
    }

    public String getPhone() {
        return phoneNum;
    }
    
    public UUID getID() {
        return ID;
    }
}
