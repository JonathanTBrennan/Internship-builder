import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DataWriterTest {
    private UserList userList = UserList.getInstance();
    private ArrayList<User> users = userList.getUsers();
    private ResumeList resumeList = ResumeList.getInstance();
    private ArrayList<Resume> resumes = resumeList.getResumes();
    private JobList jobList = JobList.getInstance();
    private ArrayList<JobListing> jobs = jobList.getJobLists();

    @BeforeEach
    public void setup() {
        users.clear();
        DataWriter.saveUsers(users);
        resumes.clear();
        DataWriter.saveResume(resumes);
        jobs.clear();
        DataWriter.saveJobListing(jobs);
    }

    @AfterEach
    public void tearDown() {
        users.clear();
        DataWriter.saveUsers(users);
        resumes.clear();
        DataWriter.saveResume(resumes);
        jobs.clear();
        DataWriter.saveJobListing(jobs);
    }

    @Test
    public void testWritingZeroUsers() {
        users = DataLoader.getUsers();
        assertEquals(0, users.size());
    }
    
    @Test
    public void testWritingOneUser() {
        users.add(new Student("jtb", "cheese", "jtb18@email.sc.edu", "Jonathan", "Brennan", 1, "800-000-0000", UUID.randomUUID()));
        DataWriter.saveUsers(users);
        assertEquals("jtb", DataLoader.getUsers().get(0).getUsername());
    }

    @Test
    public void testWritingFiveUsers() {
        users.add(new Student("abc", "cheese", "jtb18@email.sc.edu", "Jonathan", "Brennan", 1, "800-000-0000", UUID.randomUUID()));
        users.add(new Student("bbc", "cheese", "jtb18@email.sc.edu", "Jonathan", "Brennan", 1, "800-000-0000", UUID.randomUUID()));
        users.add(new Student("cbc", "cheese", "jtb18@email.sc.edu", "Jonathan", "Brennan", 1, "800-000-0000", UUID.randomUUID()));
        users.add(new Employer("dbc", "cheese", "jtb18@email.sc.edu", "Jonathan", "Brennan", 1, "800-000-0000", UUID.randomUUID()));
        users.add(new Employer("ebc", "cheese", "jtb18@email.sc.edu", "Jonathan", "Brennan", 1, "800-000-0000", UUID.randomUUID()));
        DataWriter.saveUsers(users);
        assertEquals("ebc", DataLoader.getUsers().get(4).getUsername());
    }

    @Test
    public void testWritingZeroResumes() {
        resumes = DataLoader.getResumes();
        assertEquals(0, resumes.size());
    }

    @Test
    public void testWritingOneResumes() {
        UUID id = UUID.randomUUID();
        ArrayList<String> skills = new ArrayList<String>();
        ArrayList<Experience> exp = new ArrayList<Experience>();
        Education edu = new Education("UofSC", "Comp Sci", "2024");
        Resume res = new Resume(id, skills, exp, edu);
        resumes.add(res);
        DataWriter.saveResume(resumes);
        assertEquals(id, DataLoader.getResumes().get(0).getStudentID());
    }

    @Test
    public void testWritingResumeSkill() {
        UUID id = UUID.randomUUID();
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        ArrayList<Experience> exp = new ArrayList<Experience>();
        Education edu = new Education("UofSC", "Comp Sci", "2024");
        Resume res = new Resume(id, skills, exp, edu);
        resumes.add(res);
        DataWriter.saveResume(resumes);
        assertEquals("Java", DataLoader.getResumes().get(0).getSkills().get(0));
    }

    @Test
    public void testWritingResumeTwoSkill() {
        UUID id = UUID.randomUUID();
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("C++");
        ArrayList<Experience> exp = new ArrayList<Experience>();
        Education edu = new Education("UofSC", "Comp Sci", "2024");
        Resume res = new Resume(id, skills, exp, edu);
        resumes.add(res);
        DataWriter.saveResume(resumes);
        assertEquals("C++", DataLoader.getResumes().get(0).getSkills().get(1));
    }

    @Test
    public void testWritingResumeEducation() {
        UUID id = UUID.randomUUID();
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("C++");
        ArrayList<Experience> exp = new ArrayList<Experience>();
        Education edu = new Education("UofSC", "Comp Sci", "2024");
        Resume res = new Resume(id, skills, exp, edu);
        resumes.add(res);
        DataWriter.saveResume(resumes);
        assertEquals("UofSC", DataLoader.getResumes().get(0).getEducation().getUniversity());
    }

    @Test
    public void testWritingResumeExperience() {
        UUID id = UUID.randomUUID();
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("C++");
        ArrayList<Experience> exp = new ArrayList<Experience>();
        Experience xp = new Experience("Google", "Intern", "Coded", "6 months");
        exp.add(xp);
        Education edu = new Education("UofSC", "Comp Sci", "2024");
        Resume res = new Resume(id, skills, exp, edu);
        resumes.add(res);
        DataWriter.saveResume(resumes);
        assertEquals("Google", DataLoader.getResumes().get(0).getWorkExperience().get(0).getCompany());
    }

    @Test
    public void testWritingResumeTwoResumes() {
        UUID id = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("C++");
        ArrayList<Experience> exp = new ArrayList<Experience>();
        Experience xp = new Experience("Google", "Intern", "Coded", "6 months");
        exp.add(xp);
        Education edu = new Education("UofSC", "Comp Sci", "2024");
        Resume res = new Resume(id, skills, exp, edu);
        Resume res2 = new Resume(id2, skills, exp, edu);
        resumes.add(res);
        resumes.add(res2);
        DataWriter.saveResume(resumes);
        assertEquals(id2, DataLoader.getResumes().get(1).getStudentID());
    }

    @Test
    public void testWritingZeroJobListing() {
        jobs = DataLoader.getJobListings();
        assertEquals(0, jobs.size());
    }

    @Test
    public void testWritingOneJobListing() {
        UUID id = UUID.randomUUID();
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        ArrayList<UUID> stuIDs = new ArrayList<UUID>();
        stuIDs.add(UUID.randomUUID());
        JobListing job = new JobListing("Google", id, "California", 25, "3 months", "Intern", "Code", skills, null, stuIDs);
        jobs.add(job);
        DataWriter.saveJobListing(jobs);
        assertEquals("Google", DataLoader.getJobListings().get(0).getTitle());
    }

    @Test
    public void testWritingTwoJobListing() {
        UUID id = UUID.randomUUID();
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        ArrayList<UUID> stuIDs = new ArrayList<UUID>();
        stuIDs.add(UUID.randomUUID());
        JobListing job = new JobListing("Google", id, "California", 25, "3 months", "Intern", "Code", skills, null, stuIDs);
        JobListing job2 = new JobListing("Apple", id, "California", 25, "3 months", "Intern", "Code", skills, null, stuIDs);
        jobs.add(job);
        jobs.add(job2);
        DataWriter.saveJobListing(jobs);
        assertEquals("Apple", DataLoader.getJobListings().get(1).getTitle());
    }
}
