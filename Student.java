public class Student extends WorkforceMember {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String id;
    private Resume resume;

    public Student(String username, String password, String email, String firstName, String lastName, String id, Resume resume) {
        super(username, password, email, firstName, lastName, id);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.resume = resume;
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

    public void Apply(JobListing jobListing) {
        //has job listing
        //add user to the jobListing list of applicants

    }
}
