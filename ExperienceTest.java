import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExperienceTest {
    private Experience exp;

    @BeforeEach
    public void setup() {
        exp = new Experience();
    }

    @AfterEach
    public void tearDown() {
        exp = null;
    }

    @Test
    public void testEmptyExperience() {
        assertEquals(null, exp.getCompany());
    }

    @Test
    public void testExperienceCompany() {
        exp.setCompany("Google");
        assertEquals("Google", exp.getCompany());
    }

    @Test
    public void testExperienceDescription() {
        exp.setDescription("Coding");
        assertEquals("Coding", exp.getDesciption());
    }

    @Test
    public void testExperienceDuration() {
        exp.setDuration("3 months");
        assertEquals("3 months", exp.getDuration());
    }

    @Test
    public void testExperiencePosition() {
        exp.setPosition("Intern");
        assertEquals("Intern", exp.getPosition());
    }
}
