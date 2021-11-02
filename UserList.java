
/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;
import java.util.UUID;
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
    users = new ArrayList<User>();
    users = DataLoader.getUsers();
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
    return userList;
  }

  public boolean addUser(User user) {
    return UserList.getInstance().users.add(user);
  }

  public int listSize() {
    return users.size();
  }

  /**
   * Getter for a specific user by username
   * 
   * @param keyword user to look for
   * @return matching user
   */
  public User getUserByUsername(String userName) {
    users = DataLoader.getUsers();
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).getUsername().equals(userName)) {
        return users.get(i);
      }
    }
    return null;
  }

  /**
   * Getter for a specific user by UUID
   * 
   * @param ID user to look for
   * @return matching user
   */
  public User getUserByID(UUID ID) {
    users = DataLoader.getUsers();
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).getID().equals(ID)) {
        return users.get(i);
      }
    }
    return null;
  }
}