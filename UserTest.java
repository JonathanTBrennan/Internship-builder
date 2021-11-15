import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
    private UserList users = UserList.getInstance();
    private ArrayList<User> userList = users.getUsers();
    private UUID patID = UUID.randomUUID();
    private UUID timID = UUID.randomUUID();

    @BeforeEach
    public void setup() {
        userList.clear();
        DataWriter.saveUsers(userList);
    }

    @AfterEach
    public void tearDown() {
        UserList.getInstance().getUsers().clear();
        DataWriter.saveUsers(userList);
    }

    @Test
    void testHaveUserValidFirstItems() {
        userList.add(new Student("Patbu13", "SoccerGod1", "kingCrowner47@hotmail.com", "Patrick", "Burroughs", 1, "8033690596", patID));
        userList.add(new Employer("AppleCEONumber1", "StevenJobben", "microsoft@hotmail.com", "Tim", "Cook", 2, "9158675309", timID));
        DataWriter.saveUsers(userList);
        
        assertEquals("Patbu13", userList.get(0).getUsername());
        assertEquals("AppleCEONumber1", userList.get(1).getUsername());
    }

    @Test
    void testHaveUserValidLastItems() {
        userList.add(new Student("Patbu13", "SoccerGod1", "kingCrowner47@hotmail.com", "Patrick", "Burroughs", 1, "8033690596", patID));
        userList.add(new Employer("AppleCEONumber1", "StevenJobben", "microsoft@hotmail.com", "Tim", "Cook", 2, "9158675309", timID));
        DataWriter.saveUsers(userList);
        
        assertEquals(patID, userList.get(0).getID());
        assertEquals(timID, userList.get(1).getID());
    }

    @Test
    void testHaveUserInvalid() {
        boolean hasTyler = users.getUserByUsernameBool("tMadden01");
        assertFalse(hasTyler);
    }

    @Test
    void testHaveUserEmpty() {
        boolean hasEmpty = users.getUserByUsernameBool("");
        assertFalse(hasEmpty);
    }

    @Test
    void testHaveUserNull() {
        boolean hasNull = users.getUserByUsernameBool(null);
        assertFalse(hasNull);
    }
}
