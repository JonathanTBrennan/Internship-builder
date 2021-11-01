import java.util.UUID;
public class Employer extends User{
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String location;
    private String company;
    private int userType;
    private String phoneNum;
    private UUID ID;

    /**
     * Constructor for all aspects of the employer's account
     * @param username username of the employer's account
     * @param password password of the employer's account
     * @param email email of the employer's account
     * @param firstName first name of the employer's account manager
     * @param lastName last name of the employer's account manager
     * @param userType type of user this account is
     * @param phoneNum phone number for the employer's account
     * @param ID random ID associated with the account
     */
    public Employer(String username, String password, String email, String firstName, String lastName, int userType, String phoneNum, UUID ID) {
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

    /**
     * Empty constructor for an employer account
     */
    public Employer() {
        super();
    }

    /**
     * Getter for username of employer's account
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for the username of the employer's account
     * @param username username of the employer's account
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for the password of the employer's account
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for the password for the employer's account
     * @param password password of the account
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for the email of the employer's account
     */
    public String getEmail()  {
        return email;
    }

    /**
     * Setter for the email for the employer's account
     * @param email email of the employer's account
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for the last name of the account manager
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for the first name of the account manager
     * @param fName first name of the account manager
     */
    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    /**
     * Getter for the last name of the account manager
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Setter of the last name of the account manager
     * @param lName last name of the account manager
     */
    public void setLastName(String lName) {
        this.lastName = lName;
    }

    /**
     * Getter for the location of the company
     * @return location of the company
     */
    public String getLocation() {
        return location;
    }

    /**
     * Setter for the location of the company
     * @param location location of the company
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Getter for the company name
     * @return company name
     */
    public String getCompany() {
        return company;
    }

    /**
     * Setter for the company name
     * @param company company name
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Getter for the type of user account
     * @return type of user account
     */
    public int getUserType(){
        return userType;
    }

    /**
     * Getter for the phone number of the company or account manager
     * @return phone number
     */
    public String getPhone() {
        return phoneNum;
    }

    /**
     * Setter for the phone number of the company or account manager
     * @param phoneNum phone number
     */
    public void setPhone(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * Getter for the random ID associated with the employer account
     * @return the random ID
     */
    public UUID getID(){
        return ID;
    }

    /**
     * Setter for the random ID to be associated with the employer account
     */
    public void setID() {
        this.ID = UUID.randomUUID();
    }
}
