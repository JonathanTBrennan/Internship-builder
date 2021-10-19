/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;

 /**
  * Getting class for the list of all users
  */
public class UserList extends DataLoader {

    private static UserList userList;
    private ArrayList<User> users;

    /**
     * Constructor for the list of users
     */
    private static void UserList() {
      
    }

    /**
     * Getter for a refreshed list of users
     * @return refreshed list of users
     */
    public UserList getInstance() {
      return this.userList;
    }

    /**
     * Getter for a specific user
     * @param keyword user to look for
     * @return matching user
     */
    public User getUser(String userName) {
      return null;
    }
  }