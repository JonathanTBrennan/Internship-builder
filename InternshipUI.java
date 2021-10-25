import java.util.Scanner;
import java.util.UUID;
public class InternshipUI {
    private Scanner scanner;
    private InternshipApplication application;
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
    }

    private void displayMainMenu() {
        while(true){
            System.out.println("---*****Welcome to the USC Internship App*****---");
            System.out.println("******************* Main Menu *******************");
            System.out.println("");
            System.out.println("	1. Login as Student");
            System.out.println("	2. Login as Employer");
            System.out.println("	3. Login as Admin");
            System.out.println("	4. Create Student Account");
            System.out.println("	5. Create Business Account");
            System.out.println("	6. Exit Program");
        }
    }

    private void displayLogin(int selectionType){
        while(true){
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
            System.out.println("Password: ");
        }
    }

    private void displayEmployerAccountCreation(){
        while(true){
            System.out.println("**** Employer Account Creation ****");
            System.out.println("");
            System.out.println("Company Name: ");
            System.out.println("Username: ");
            System.out.println("email: ");
            System.out.println("Manager First Name: ");
            System.out.println("Manager Last Name: ");
            System.out.println("Company Location: ");
        }
    }

    private void displayEmployerPortal(){
        while(true){
            System.out.println("********* Employer Portal *********");
            System.out.println("");
            System.out.println("	1. Post Job Listing");
            System.out.println("	2. Edit Job Posting");
            System.out.println("	3. View Applicants");
            System.out.println("	4. Rate a Student");
            System.out.println("	5. Log out");
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

    private void displayViewApplicants(){
        // Come back to this
    }

    private void displayFilterApplicants(){
        // Come back to this
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

    private void displayStudentAccountCreation(){
        while(true){
            System.out.println("**** Student Account Creation ****");
            System.out.println("");
            System.out.println("First Name: ");
            System.out.println("Last Name: ");
            System.out.println("Username: ");
            System.out.println("Graduation Year: ");
            System.out.println("Email Address: ");
            System.out.println("Password: ");
            System.out.println("Re-enter Password: ");
        }
    }

    private void displayResumeBuilder(){
        while(true){
            System.out.println("*********** Resume Builder ***********");
            System.out.println("Coding Languages (Enter your languages, ");
            System.out.println("Click enter after typing each language.");
            System.out.println("Then when finished Please Enter \"0\"):");
            System.out.println("");
            System.out.println("Past Work Experience ---");
            System.out.println("");
            System.out.println("How many Jobs would you like to enter?: ");
            System.out.println("");
            // for loop for how many times they choose
            //for(int i = 0; i < numberOfJobs; i++){
                System.out.println("Job #1");
                System.out.println("Company Name: ");
                System.out.println("Location of Job: ");
                System.out.println("Position at Company: ");
                System.out.println("Job Description: ");
                System.out.println("Duration of Employment: ");
            //}
        }
    }

    private void displayStudentPortal(){
        while(true){
            System.out.println("********* Student Portal *********");
            System.out.println("");
            System.out.println("	1. View Job Listings");
            System.out.println("	2. Edit Resume");
            System.out.println("	3. Rate Employer");
            System.out.println("	4. Log out");
            System.out.println("");
            System.out.println("Enter your selection: ");
        }
    }

    private void displayJobListingsStudentViewAll(){
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

    private void displayJobListingsStudentFiltered(){
        while(true){
            System.out.println("--- Filter Listings --- ");
            System.out.println("");
            System.out.println("	1. Coding Languages");
            System.out.println("	2. Location");
            System.out.println("	3. Employer Rating");
            System.out.println("	4. Go back");
            System.out.println("");
            System.out.println("Enter your selection: ");
        }

    }

    private void displayJobListingsStudentFilteredBy(){
        while(true){
            System.out.println("--- Filter by <Coding Language> ---");
            System.out.println("What language would you like to search for: ");
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
            System.out.println("--- Rate <company> ---");
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