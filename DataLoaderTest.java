import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataLoaderTest {
    private UserList users = UserList.getInstance();
    private ArrayList<User> userList = users.getUsers();

    @BeforeEach
    public void setup(){
        userList.clear();
        userList.add(new Student("TylerM", "password", "email@email.com", "Tyler", "Madden", 1, "5714991257", UUID.randomUUID()));
        userList.add(new Employer("Employer777", "password", "email@bidness.com", "Joe", "Shmoe", 2, "911", UUID.randomUUID()));
        DataWriter.saveUsers();        
    }

    @AfterEach
    public void tearDown(){
        UserList.getInstance().getUsers().clear();
        DataWriter.saveUsers();
    }

    @Test
    void testGetUsersSize(){
        userList = DataLoader.getUsers();
        assertEquals(2, userList.size());
    }

    @Test
    void testGetUsersSizeZero(){
        UserList.getInstance().getUsers().clear();
        DataWriter.saveUsers();
        assertEquals(0, userList.size());
    }

    @Test
    void testGetUserFirstUserName(){
        userList = DataLoader.getUsers();
        assertEquals("TylerM", userList.get(0).getUsername());
    }
}
