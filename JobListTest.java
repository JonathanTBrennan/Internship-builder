import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.UUID;

public class JobListTest {
    private JobList jobList = JobList.getInstance();
    private ArrayList<JobListing> jobs = jobList.getJobLists();

    @BeforeEach
    public void setup() {
        jobs.clear();
    }

    @AfterEach
    public void tearDown() {
        jobs.clear();
    }
    
    @Test
    public void testZeroJobListing() {
        assertEquals(0, jobs.size());
    }

    @Test
    public void testOneJobListing() {
        jobs.add(new JobListing("Google", UUID.randomUUID(), "California", 15, "3 months", "Intern", "Coding", null, null, null));
        assertEquals("Google", jobs.get(0).getTitle());
    }

    @Test
    public void testTwoJobListing() {
        jobs.add(new JobListing("Google", UUID.randomUUID(), "California", 15, "3 months", "Intern", "Coding", null, null, null));
        jobs.add(new JobListing("Apple", UUID.randomUUID(), "California", 15, "3 months", "Intern", "Coding", null, null, null));
        assertEquals("Apple", jobs.get(1).getTitle());
    }
}
