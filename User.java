/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.UUID;

/**
 * Abstract class of all users, including students, employers, and admins
 */
public abstract class User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int userType;
    private String phoneNum;
    private UUID id;

    /**
     * Constructor for a user's account
     * @param username username of account
     * @param password password of account
     * @param email email of account
     * @param firstName first name of user
     * @param lastName last name of user
     * @param userType type of user
     * @param phoneNum phone number of user
     * @param id random id associated with user's account
     */
    public User(String username, String password, String email, String firstName, String lastName, int userType, String phoneNum, UUID id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.phoneNum = phoneNum;
        this.id = id;
    }

    /**
     * Base constructor for user accoyunt
     */
    public User() {
        
    }

    /**
     * Getter methods passed down to the specific user types
     * @return variable the method is getting
     */
    public abstract String getUsername();
    public abstract String getPassword();
    public abstract String getEmail();
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract UUID getID();
    public abstract int getUserType();
    public abstract String getPhone();
}