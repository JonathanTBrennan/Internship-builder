/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.UUID;

/**
 * Student version of a user
 */
public class Student extends User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int userType;
    private String phoneNum;
    private UUID id;

    /**
     * Constructor for all aspects of a student
     * @param username username of student
     * @param password password of student's account
     * @param email email of student
     * @param firstName first name of student
     * @param lastName last name of student
     * @param userType type of user the student is
     * @param phoneNum phone number of student
     * @param id random ID assigned to student
     */
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

    /**
     * Empty constructor for a student to later be assigned information
     */
    public Student() {

    }

    /**
     * Getter for the username of a student's account
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username for a student account
     * @param username username of the account
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for the password of a student's account
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for the password of a student's account
     * @param password password for the account
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for the email of a student's account
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for the email of a student's account
     * @param email email of the account
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for the first name of a student's account
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for the first name of a student's account
     * @param fName first name of student
     */
    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    /**
     * Getter for last name of a student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for last name of a student
     * @param lName last name of the student
     */
    public void setLastName(String lName) {
        this.lastName = lName;
    }

    /**
     * Getter for the type of user this account is
     */
    public int getUserType() {
        return userType;
    }

    /**
     * Getter for the student's phone number
     */
    public String getPhone() {
        return phoneNum;
    }

    /**
     * Setter for the phone number of the student
     * @param phone student's phone number
     */
    public void setPhone(String phone) {
        this.phoneNum = phone;
    }

    /**
     * Getter of the student account's UUID
     */
    public UUID getID() {
        return id;
    }

    /**
     * Sets the random ID for the student account
     */
    public void setID() {
        this.id = UUID.randomUUID();
    }
}
