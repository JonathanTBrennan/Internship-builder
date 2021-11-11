import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.UUID;

class UserTest {
    private UserList users = UserList.getInstance();
    private ArrayList<User> userList = users.getUsers();

    
    public void setup() {
        userList.clear();
        userList.add(new Student("Patbu13", "SoccerGod1", "kingCrowner47@hotmail.com", "Patrick", "Burroughs", 1, "8033690596", UUID.randomUUID()));
        userList.add(new Employer("AppleCEONumber1", "StevenJobben", "microsoft@hotmail.com", "Tim", "Cook", 2, "9158675309", UUID.randomUUID()));
        DataWriter.saveUsers();
    }

    public void tearDown() {
        UserList.getInstance().getUsers().clear();
        DataWriter.saveUsers();
    }

    void testHaveUserValidItem() {
        boolean hasPat = users.getUserByUsernameBool("Patbu13");
        
    }
}
