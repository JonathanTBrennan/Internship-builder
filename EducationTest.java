import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EducationTest {
    private Education edu;

    @BeforeEach
    public void setup() {
        edu = new Education();
    }

    @AfterEach
    public void tearDown() {
        edu = null;
    }

    @Test
    public void testEmptyEducation() {
        assertEquals(null, edu.getUniversity());
    }

    @Test
    public void testUniversityEducation() {
        edu.setUniversity("UofSC");
        assertEquals("UofSC", edu.getUniversity());
    }

    @Test
    public void testDegreeEducation() {
        edu.setDegree("Comp Sci");
        assertEquals("Comp Sci", edu.getDegree());
    }

    @Test
    public void testGradDateEducation() {
        edu.setGradDate("2024");
        assertEquals("2024", edu.getGradDate());
    }
}
