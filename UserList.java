
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

  /**
   * Adds a user to the list of users
   * @param user being added
   * @return whether or not the user was successfully added
   */
  public boolean addUser(User user) {
    return UserList.getInstance().users.add(user);
  }

  /**
   * Gets the size of the user list
   * @return the size of the user list
   */
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
   * JUNIT TESTING PURPOSES ONLY
   * Checks for if there is a match for a specific user by username
   * 
   * @param keyword user to look for
   * @return if there is a match
   */
  public boolean getUserByUsernameBool(String userName) {
    users = DataLoader.getUsers();
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).getUsername().equals(userName)) {
        return true;
      }
    }
    return false;
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

  /**
   * TESTING PURPOSES ONLY
   * Checks for if the sent ID is the same as a specific user's UUID
   * 
   * @param ID user to look for
   * @return if it matches
   */
  public boolean getUserByIDBool(UUID ID) {
    users = DataLoader.getUsers();
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).getID().equals(ID)) {
        return true;
      }
    }
    return false;
  }
}