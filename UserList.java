
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
  private UserList() {
    users = new ArrayList<User>(DataLoader.getUsers());
  }

  /**
   * Getter for a refreshed list of users
   * 
   * @return refreshed list of users
   */
  public static UserList getInstance() {
    if(userList == null) {
      userList = new UserList();
    }
    return userList = new UserList();
  }

  /**
   * Getter for a specific user
   * 
   * @param keyword user to look for
   * @return matching user
   */
  public User getUser(String userName) {
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).getUsername() == userName) {
        return users.get(i);
      }
    }

    return null;
  }
}