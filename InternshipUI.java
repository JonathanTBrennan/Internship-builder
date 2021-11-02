import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import javax.lang.model.util.ElementScanner6;
import javax.naming.spi.DirStateFactory.Result;
public class InternshipUI {
    private Scanner scanner = new Scanner(System.in);
    private InternshipApplication application;
    private JobList jobList;
    public static void main(String[] args) {
        //System.out.println(UUID.randomUUID());
        InternshipUI driver = new InternshipUI();
        driver.displayMainMenu();
    }

    private void displayMainMenu() {
        application = new InternshipApplication();
        while(true){
            int selection;
            System.out.println("---*****Welcome to the USC Internship App*****---");
            System.out.println("******************* Main Menu *******************");
            System.out.println("");
            System.out.println("	1. Login as Student");
            System.out.println("	2. Login as Employer");
            System.out.println("	3. Login as Admin");
            System.out.println("	4. Create Student Account");
            System.out.println("	5. Create Business Account");
            System.out.println("	6. Exit Program");
            System.out.println("");
            System.out.println("Enter your selection: ");
            selection = scanner.nextInt();
            scanner.nextLine();
            if(selection == 1){
                displayLogin(1);
            }
            else if(selection == 2){
                displayLogin(2);
            }
            else if(selection == 3){
                displayLogin(0);
            }
            else if(selection == 4){
                Student student = new Student();
                Resume resume = new Resume();
                student = displayStudentAccountCreation(student);
                UserList.getInstance().addUser(student);
                resume = displayResumeBuilder(student, resume);
                ResumeList.getInstance().addResume(resume);
                displayStudentPortal(student);
            }
            else if(selection == 5){
                Employer employer = new Employer();
                employer = displayEmployerAccountCreation(employer);
                UserList.getInstance().addUser(employer);
                displayEmployerPortal(employer);
            }
            else if(selection == 6){
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }

    private void displayLogin(int selectionType){
        while(true){
            String username;
            String password;
            if(selectionType == 0){
                System.out.println("********* Admin Login *********");
            }
            else if(selectionType == 1){
                System.out.println("********* Student Login *********");
            }
            else{
                System.out.println("********* Employer Login *********");
            }
            System.out.println("");
            System.out.println("Username: ");
            username = scanner.next();
            System.out.println("Password: ");
            password = scanner.next();
            boolean hasAccount = application.login(username, password);
            if(hasAccount){
                ArrayList<User> users = DataLoader.getUsers();
                User user = null;
                for(int j = 0; j< users.size(); j++) {
                    if(users.get(j).getUsername().equals(username)) {
                        user = users.get(j);
                    }
                }
                if(selectionType == 0){
                    displayAdminPortal();
                }
                else if(selectionType == 1){
                    displayStudentPortal(user);
                }
                else{
                    displayEmployerPortal(user);
                }
            }
            else{
                System.out.println("Account not found. Please try again.");
            }
        }
    }

    private Employer displayEmployerAccountCreation(Employer theEmployer){
            theEmployer.setID();    
            System.out.println("**** Employer Account Creation ****");
            System.out.println("");
            System.out.println("Company Name: ");
            theEmployer.setCompany(scanner.nextLine());
            System.out.println("Username: ");
            theEmployer.setUsername(scanner.nextLine());
            System.out.println("Email: ");
            theEmployer.setEmail(scanner.nextLine());
            System.out.println("Phone Number: ");
            theEmployer.setPhone(scanner.nextLine());
            System.out.println("Manager First Name: ");
            theEmployer.setFirstName(scanner.nextLine());
            System.out.println("Manager Last Name: ");
            theEmployer.setLastName(scanner.nextLine());
            System.out.println("Company Location: ");
            theEmployer.setLocation(scanner.nextLine());
        return theEmployer;        
    }

    private void displayEmployerPortal(User user){
        while(true){
            System.out.println("********* Employer Portal *********");
            System.out.println("");
            System.out.println("	1. Post Job Listing");
            System.out.println("	2. Edit Job Posting");
            System.out.println("	3. View Applicants");
            System.out.println("	4. Rate a Student");
            System.out.println("	5. Log out");
            System.out.println("");
            System.out.println("Enter your selection: ");
            int selection = scanner.nextInt();

            if (selection == 1) {

            }
            else if (selection == 2) {

            }
            else if (selection == 3) {
                displayViewApplicants(user);
            }
            else if (selection == 4) {
                
            }
            else if (selection == 5) {
                displayMainMenu();
            }
            else {

            }
        }
    }

    private void displayCreateJobPosting(){
        while(true){
            System.out.println("********* Job Posting *********");
            System.out.println("");
            System.out.println("Position: ");
            System.out.println("Pay: ");
            System.out.println("Length: ");
            System.out.println("Job Description: ");
            System.out.println("Recommended Skills -");
            System.out.println("Enter Each Line by Line, Type \"0\" When finished: ");
            
        }
    }

    private void displayJobPostingPreview(){
        while(true){
            System.out.println("--- Posting Preview ---");
            System.out.println("");
            System.out.println("Position: ");
            System.out.println("Pay: ");
            System.out.println("Length: ");
            System.out.println("Job Description: ");
            System.out.println("Recommended Skills: ");
            System.out.println("");
            System.out.println("Type \"1\" to Post");
            System.out.println("Type \"2\" to Edit");
        }
    }

    private void displayViewApplicants(User user){
        while(true){
            System.out.println("********* View Applicants *********");
            System.out.println("");
            System.out.println("Select which job posting to view Applicants from ---");
            System.out.println("");
            ArrayList<JobListing> employersJobList = new ArrayList<JobListing>();
            for (int i = 0; i < JobList.getInstance().getJobListings().size(); i++) {
                if (JobList.getInstance().getJob(i).getEmployerID().equals(user.getID())) {
                    employersJobList.add(JobList.getInstance().getJob(i));
                }
            }
            for (int i = 0; i < employersJobList.size(); i++) {
                System.out.println("    " + (i+1) + ". " + employersJobList.get(i).getTitle());
            }
            System.out.println("    " + (employersJobList.size()+1) + ". Go back");
            System.out.println("");
            System.out.println("Enter your selection: ");
            int choice;
            while(true) {
                choice = scanner.nextInt();
                if (choice > employersJobList.size()+1) {
                    System.out.println("invalid selection, please try again");
                }
                else if (choice == employersJobList.size()+1) {
                    displayEmployerPortal(user);
                }
                else {
                    scanner.nextLine();
                    System.out.println("");
                    System.out.println(employersJobList.get(choice-1).toString());
                    ArrayList<UUID> applicantIDs = new ArrayList<UUID>();
                    applicantIDs = employersJobList.get(choice-1).getApplicants();
                    ArrayList<User> applicants = new ArrayList<User>();
                    System.out.println("");
                    System.out.println("--- Applicants ---");
                    System.out.println("");
                        for (int i = 0; i < applicantIDs.size(); i++) {
                            applicants.add(UserList.getInstance().getUserByID(applicantIDs.get(i)));
                            System.out.println("    " + (i+1) + ". " + applicants.get(i).getFirstName() + " " + applicants.get(i).getLastName());
                        }
                    System.out.println("");
                    System.out.println("Enter your selection: ");
                    int selection = scanner.nextInt();
                    while (true) {
                        if (selection > applicants.size()+1) {
                            System.out.println("Invalid selection, please try again");
                        }
                        else if (selection == applicants.size()+1) {
                            displayEmployerPortal(user);
                        }
                        else {
                            displayApplicant(applicants.get(selection-1));
                        }
                    }
                }    
            }
        }
    }

    private void displayFilterApplicants(){
        while(true){
            System.out.println("********* Filter Applicants *********");
            System.out.println("What would you like to filter by?");
            System.out.println("	1. Coding Languages");
            System.out.println("	2. Length of Internship");
            System.out.println("	3. Pay");
            System.out.println("	4. Go back");
            System.out.println("");
            System.out.println("Enter Selection: ");
        }
    }

    private void displayFilterLanguage(){
        while(true){
            System.out.println("--- What Language would you like to filter by? ---");
            System.out.println("");
            System.out.println("Enter Language: ");
            System.out.println("");
            System.out.println("--- These Applicants have <Language> listed as a skill --- ");
            System.out.println("<Applicants>");
            System.out.println("");
            System.out.println("Select Applicant: ");
        }
    }

    private void displayFilterLength(){
        while(true){
            
        }
    }

    private void displayApplicant(User user){
        Resume userResume = new Resume();
        userResume = ResumeList.getInstance().getResume(user.getID());
        while(true){
            System.out.println("--- Applicant: " + user.getFirstName() + " " + user.getLastName() + " ---");
            System.out.println("");
            System.out.println("Email: " + user.getEmail());
            System.out.println("Phone Number: " + user.getPhone());
            System.out.println("Skills: " + userResume.skillBuilder());
            ArrayList<Experience> experiences = new ArrayList<Experience>();
            experiences = userResume.getWorkExperience();
                for(int i = 0; i < userResume.getWorkExperience().size(); i++){
                    System.out.println("");
                    System.out.println(" -- Work Experience #" + (i+1) + " --");
                    System.out.println("");
                    System.out.println("Company: " + experiences.get(i).getCompany());
                    System.out.println("Position: " + experiences.get(i).getPosition());
                    System.out.println("Description: " + experiences.get(i).getDesciption());
                    System.out.println("Duration: " + experiences.get(i).getDuration());
                }
            System.out.println("");
            System.out.println(" -- Education --");
            System.out.println("");
            System.out.println("University: " + userResume.getEducation().getUniversity());
            System.out.println("Degree: " + userResume.getEducation().getDegree());
            System.out.println("Graduation Date: " + userResume.getEducation().getGradDate());
            System.out.println("");
            System.out.println("Enter anything to return");
            scanner.nextLine();
            while (true) {
                if (scanner.nextLine() != null) {
                    displayEmployerPortal(user);
                }
                else {
                    System.out.println("Invalid input, please try again");
                }
            }
        }
    }

    private void displayRateStudent(){
        while(true){
            System.out.println("********* Rate a Student *********");
            System.out.println("");
            System.out.println("---Past Employees---");
            //Display past employees
            System.out.println("");
            System.out.println("Enter your selection: ");
            System.out.println("");
            System.out.println("--- Rate UserName---");
            System.out.println("");
            System.out.println("On a scale of (1-10) How do you rate UserName: ");
            System.out.println("Comments or Concerns: ");
            System.out.println("");
            System.out.println("--- Preview of Rating ---");
            System.out.println("");
            System.out.println("Rating (1-10): ");
            System.out.println("Comments: ");
            System.out.println("");
            System.out.println("Enter \"1\" to submit. Enter \"2\" to go back: ");

        }
    }

    private Student displayStudentAccountCreation(Student theStudent) {
            theStudent.setID();
            System.out.println("");
            System.out.println("**** Student Account Creation ****");
            System.out.println("");
            System.out.println("First Name: ");
            theStudent.setFirstName(scanner.nextLine());
            System.out.println("Last Name: ");
            theStudent.setLastName(scanner.nextLine());
            System.out.println("Email Address: ");
            theStudent.setEmail(scanner.nextLine());
            System.out.println("Username: ");
            theStudent.setUsername(scanner.nextLine());
            System.out.println("Password: ");
            theStudent.setPassword(scanner.nextLine());
            System.out.println("Phone Number: ");
            theStudent.setPhone(scanner.nextLine());
        return theStudent;
    }

    private Resume displayResumeBuilder(User user, Resume resume){
            resume.setStudentID(user.getID());
            System.out.println("");
            System.out.println("*********** Resume Builder ***********");
            System.out.println("");
            System.out.println("Coding Languages (Enter your languages, ");
            System.out.println("Click enter after typing each language.");
            System.out.println("Then when finished Please Enter \"0\"):");
            while(true){
                String tempInput = scanner.nextLine();
                if(tempInput.equals("0")){
                    break;
                }
                else{
                    resume.addSkill(tempInput);
                }
            }
            System.out.println("");
            System.out.println("Education ---");
            System.out.println("");
            System.out.println("What university are you attending / did you attend?");
            Education newEducation = new Education();
            String newUniversity = scanner.nextLine();
            newEducation.setUniversity(newUniversity);
            System.out.println("What degree did / will you recieve?");
            String newDegree = scanner.nextLine();
            newEducation.setDegree(newDegree);
            System.out.println("When did / will you graduate?");
            String newGradDate = scanner.nextLine();
            newEducation.setGradDate(newGradDate);
            resume.setEducation(newEducation);
            System.out.println("");
            System.out.println("Past Work Experience ---");
            System.out.println("");
            System.out.println("How many Jobs would you like to enter?: ");
            int numberOfJobs = scanner.nextInt();
            System.out.println("");
            // for loop for how many times they choose
            scanner.nextLine();
            for(int i = 0; i < numberOfJobs; i++){
                //scanner.nextLine();
                System.out.println("Job #" + (i + 1));
                System.out.println("Company Name: ");
                String companyName = scanner.nextLine();
                System.out.println("Position at Company: ");
                String position = scanner.nextLine();
                System.out.println("Job Description: ");
                String description = scanner.nextLine();
                System.out.println("Duration of Employment: ");
                String duration = scanner.nextLine();
                //scanner.nextLine();
                System.out.println("");
                //scanner.next();
                Experience exp = new Experience(companyName, position, description, duration);
                resume.addWorkExperience(exp);
            }
            return resume;
        }

    private void displayStudentPortal(User user){
        while(true){
            System.out.println("********* Student Portal *********");
            System.out.println("Welcome, " + user.getFirstName() + " " + user.getLastName() + ".");
            System.out.println("");
            System.out.println("	1. View Job Listings");
            System.out.println("	2. Edit Resume");
            System.out.println("	3. Rate Employer");
            System.out.println("        4. Print Resume");
            System.out.println("	5. Log out");
            System.out.println("");
            System.out.println("Enter your selection: ");
            //scanner.nextLine();
            int selection = scanner.nextInt();

            if(selection == 1){
                System.out.println("");
                System.out.println("Would you like to view all listings or filtered listings?");
                System.out.println("Type \"1\" for all. Type \"2\" for filtered: ");
                int choice = scanner.nextInt();
                if(choice == 1){
                    displayJobListingsStudentViewAll(user);
                }
                else if(choice == 2){
                    displayJobListingsStudentFiltered(user);
                }
                else {
                    System.out.println("Invalid input. Please try again");
                }
            }
            else if(selection == 2){
                ArrayList<Resume> resumes = DataLoader.getResumes();
                Resume resume = null;
                for(int i = 0; i<resumes.size();i++) {
                    if(user.getID().equals(resumes.get(i).getStudentID())) {
                        resume = resumes.get(i);
                    }
                }
                System.out.println("");
                System.out.println("What aspect of the resume would you like to edit?");
                System.out.println("Type \"1\" for skills. Type \"2\" for work experience. Type \"3\" for education: ");
                int choice2 = scanner.nextInt();
                scanner.nextLine();
                if(choice2 == 1){
                    System.out.println("");
                    System.out.println("What skill would you like to add?");
                    String newSkill = scanner.nextLine();
                    resume.addSkill(newSkill);
                }
                else if(choice2 == 2) {
                    System.out.println("");
                    System.out.println("What company did you work for?");
                    Experience newExperience = new Experience();
                    String newCompany = scanner.nextLine();
                    newExperience.setCompany(newCompany);
                    System.out.println("What position did you hold?");
                    String newPosition = scanner.nextLine();
                    newExperience.setCompany(newPosition);
                    System.out.println("How would you describe this job?");
                    String newDescription = scanner.nextLine();
                    newExperience.setCompany(newDescription);
                    System.out.println("How long did you hold this position?");
                    String newDuration = scanner.nextLine();
                    newExperience.setCompany(newDuration);
                    resume.addWorkExperience(newExperience);
                }
                else if(choice2 == 3){
                    System.out.println("");
                    System.out.println("What university did you attend?");
                    Education newEducation = new Education();
                    String newUniversity = scanner.nextLine();
                    newEducation.setUniversity(newUniversity);
                    System.out.println("What degree did you recieve?");
                    String newDegree = scanner.nextLine();
                    newEducation.setDegree(newDegree);
                    System.out.println("When did you graduate?");
                    String newGradDate = scanner.nextLine();
                    newEducation.setGradDate(newGradDate);
                    resume.setEducation(newEducation);
                }
                else {
                    System.out.println("Invalid input. Please try again");
                }
            }
            else if(selection == 3){
                displayRateEmployer();
            }
            else if(selection == 4){
                ResumeList.getInstance().getResume(user.getID()).ResumeToText();
            }
            else if(selection == 5){
                displayMainMenu();
            }
            else {
                System.out.println("Invalid input. Please try again");
            }
        }
    }

    private void displayJobListingsStudentViewAll(User user){
        while(true){
            System.out.println("--- Job Listings ---");
            System.out.println("");
            System.out.println("Display all listings numbered. Ex below");
            System.out.println("	1. Software Engineering Intern: Microsoft");
            System.out.println("");
            System.out.println("Enter your selection: ");

        }
    }

    private void displaySelectedJobListing(){
        while(true){
            System.out.println("--- Job Title Name ---");
            System.out.println("");
            System.out.println("Company: ");
            System.out.println("Location: ");
            System.out.println("Pay: ");
            System.out.println("Duration: ");
            System.out.println("Reccomended Skills: ");
            System.out.println("Display The skills here");
            System.out.println("Job Description: ");
            System.out.println("");
            System.out.println("Type \"1\" to submit an application");
            System.out.println("Type \"2\" to go back");
        }

    }

    private void displayJobListingsStudentFiltered(User user){
        while(true){
            System.out.println("--- Filter Listings --- ");
            System.out.println("");
            System.out.println("	1. Coding Languages");
            System.out.println("	2. Location");
            System.out.println("	3. Employer Rating");
            System.out.println("	4. Go back");
            System.out.println("");
            System.out.println("Enter your selection: ");
            int choice = scanner.nextInt();
            if(choice == 1){
                displayJobListingsStudentFilteredByLanguage(user);
            }
            else if(choice == 2){
                displayJobListingsStudentFilteredByLocation();
            }
            else if(choice == 3){
                displayJobListingsStudentFilteredByRating();
            }
            else if(choice == 4){
                break;
            }
        }

    }

    private void displayJobListingsStudentFilteredByLanguage(User user){
        JobList jobs = JobList.getInstance();
        boolean tf = true;
        while(tf){
            System.out.println("--- Filter by Coding Language ---");
            System.out.println("What language would you like to search for: ");
            System.out.println("    1. Java");
            System.out.println("    2. C");
            System.out.println("    3. Python");
            System.out.println("    4. Ruby");
            System.out.println("    5. Javascript");
            System.out.println("    6. HTML");
            int lanChoice = scanner.nextInt();
            String language = null;
            if(lanChoice == 1) {
                language = "Java";
            } else if(lanChoice == 2) {
                language = "C";
            } else if(lanChoice == 3) {
                language = "Python";
            } else if(lanChoice == 4) {
                language = "Ruby";
            } else if(lanChoice == 5) {
                language = "Javascript";
            } else if(lanChoice == 6) {
                language = "HTML";
            } else {
                System.out.println("Incorrect input");
                displayJobListingsStudentFilteredByLanguage(user);
            }
            ArrayList<JobListing> filteredJobs = new ArrayList<JobListing>();
            System.out.println("");
            for(int i = 0; i<jobs.getJobLists().size(); i++) {
                for(int j = 0; j<jobs.getJobLists().get(i).getSkills().size(); j++) {
                    if(jobs.getJobLists().get(i).getSkills().get(j).equalsIgnoreCase(language)) {
                        filteredJobs.add(jobs.getJobLists().get(i));
                    }
                }
            }
            System.out.println("--- Filtered Listings ---");
            System.out.println("");
            for(int i = 0; i < filteredJobs.size(); i++) {
                System.out.println(i+1 + ": " + filteredJobs.get(i));
            }
            System.out.println("");
            System.out.println("Enter your selection to apply: (0 to exit)");
            int apply = scanner.nextInt();
            int location = 0;
            for(int i = 0; i< filteredJobs.size(); i++) {
                if(apply == i+1) {
                    location = i;
                }
            }
            for(int i=0; i<jobs.getJobLists().size(); i++) {
                if(jobs.getJobLists().get(i).equals(filteredJobs.get(location))) {
                    jobs.addApplicant(i, user.getID());
                }
            }
            DataWriter.saveJobListing(jobs);
            System.out.println("Do you want to continue? (1 to continue)");
            if(scanner.nextInt() != 1) {
                tf = false;
            }
        }
        displayStudentPortal(user);
    }

    private void displayJobListingsStudentFilteredByLocation(){
        while(true){
            System.out.println("--- Filter by location ---");
            System.out.println("What location would you like to search for: ");
            System.out.println("");
            System.out.println("--- Filtered Listings ---");
            System.out.println("");
            System.out.println("<the listings>");
            System.out.println("");
            System.out.println("Enter your selection: ");
        }
    }

    private void displayJobListingsStudentFilteredByRating(){
        while(true){
            System.out.println("--- Filter by rating ---");
            System.out.println("What rating would you like to search for: ");
            System.out.println("");
            System.out.println("--- Filtered Listings ---");
            System.out.println("");
            System.out.println("<the listings>");
            System.out.println("");
            System.out.println("Enter your selection: ");
        }
    }

    private void displayRateEmployer(){
        while(true){
            System.out.println("********* Rate an Employer *********");
            System.out.println("");
            System.out.println("---Past Employers---");
            System.out.println("<Insert past employers>");
            System.out.println("");
            System.out.println("Enter your selection: ");
            System.out.println("");
            Rating newRating = new Rating();
                String newRatedEmployer = scanner.nextLine();
                User newEmployer = new Employer();
                for (int i = 0; i < UserList.getInstance().listSize(); i++) {
                    if (newRatedEmployer == UserList.getInstance().getUsers().get(i).getEmail()) {
                        newEmployer = UserList.getInstance().getUsers().get(i);
                    }
                }
                newRating.setUser(newEmployer);
            System.out.println("");
            System.out.println("On a scale of (1-10) How do you rate <company>: ");
            System.out.println("Comments or Concerns: ");
            System.out.println("");
            System.out.println("--- Preview of Rating --- ");
            System.out.println("");
            System.out.println("Rating (1-10): <User Rating>");
            System.out.println("Comments or Concerns: <User input>");
            System.out.println("");
            System.out.println("Enter \"1\" to submit. Enter \"2\" to go back: ");
        }        
    }

    private void displayAdminPortal(){
        while(true){
            System.out.println("********* Admin Portal *********");
            System.out.println("");
            System.out.println("	1. Edit Student Account / Resume");
            System.out.println("	2. Edit Employer Job Listing");
            System.out.println("	3. Log out");
        }

    }
}