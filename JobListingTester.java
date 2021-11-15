import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.UUID;

class JobListingTester {
    private JobList jobs = JobList.getInstance();
	private ArrayList<JobListing> jobLists = jobs.getJobListings();
	public ArrayList<UUID> studentIDS;
	public ArrayList<String> skills;
	@BeforeEach
	public void setup() {
		jobLists.clear();	
		DataWriter.saveJobListing();
	}
	
	@AfterEach
	public void tearDown() {
		jobs.getInstance().getJobLists().clear();
		DataWriter.saveJobListing();
	}
	@Test
    public void testJobListing() {
		jobLists.add(new JobListing("Software Developer", UUID.randomUUID(), "Columbia, SC", 20, "May 2022 - August 2022", "Software Developer", "Responsible for creating gaming software", skills, CodingFilters.JAVA, studentIDS));
		jobLists.add(new JobListing("Software Engineer", UUID.randomUUID(), "Columbia, SC", 20, "May 2022 - August 2022", "Software Developer", "Responsible for creating gaming software", skills, CodingFilters.JAVA, studentIDS));
		assertEquals("Software Developer", jobLists.get(0).getTitle());
		
    }
	@Test
	public void testAddApplicant() {
		jobLists.add(new JobListing("Software Developer", UUID.randomUUID(), "Columbia, SC", 20, "May 2022 - August 2022", "Software Developer", "Responsible for creating gaming software", skills, CodingFilters.JAVA, studentIDS));
		jobLists.get(0).addApplicant(UUID.fromString("046b6c7f-0b8a-43b9-b35d-6489e6daee91"));
		assertEquals("046b6c7f-0b8a-43b9-b35d-6489e6daee91", jobLists.get(0).getApplicants());
	}
	@Test
	public void testEditJobListing() {
		jobLists.add(new JobListing("Software Developer", UUID.randomUUID(), "Columbia, SC", 20, "May 2022 - August 2022", "Software Developer", "Responsible for creating gaming software", skills, CodingFilters.JAVA, studentIDS));
		jobLists.set(0, new JobListing("Google", UUID.randomUUID(), "California", 15, "3 months", "Intern", "Coding", null, null, null));
		assertNotEquals( new JobListing("Software Developer", UUID.randomUUID(), "Columbia, SC", 20, "May 2022 - August 2022", "Software Developer", "Responsible for creating gaming software", skills, CodingFilters.JAVA, studentIDS), jobLists.get(0));
	}
}
