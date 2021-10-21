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
}