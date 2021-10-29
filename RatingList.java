/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;
import java.util.UUID;
/**
 * Getting class for the list of all ratings
 */
public class RatingList extends DataLoader {

  private static RatingList ratingList;
  private ArrayList<Rating> ratings;
  
  /**
   * Constructor for the list of ratings
   */
  private RatingList() {
    ratings = new ArrayList<Rating>(DataLoader.getRatings());
  }

  /**
   * Getter for the size of the list of ratings
   * @return size of list
   */
  public void fixIDs(int idFrom) {
    for (int i = idFrom+1; i < ratings.size(); i++) {
      ratings.get(i).setID(i-1);
    }
  }

  /**
   * Getter for a refreshed list of ratings
   * 
   * @return refreshed list of ratings
   */
  public static RatingList getInstance() {
    if (ratingList == null) {
      ratingList = new RatingList();
    }
    return ratingList = new RatingList();
  }

  /**
   * Getter for a specific rating
   * 
   * @param keyword rating to look for
   * @return matching rating
   */
  public Rating getRating(int ID) {
    RatingList.getInstance();
    return ratings.get(ID);
  }

  /**
   * Gets the average user rating
   * @param user User whose average rating is being found
   * @return average rating of said user
   */
  public double getUsersRating(UUID userID) {
    double userRating = 0.0;
    int totalRate = 0;
    int numRates = 0;
    for (int i = 0; i < ratings.size(); i++) {
      if (ratings.get(i).getUser().getID() == userID) {
        totalRate += ratings.get(i).getNumRating();
        numRates++;
      }
    }
    userRating = totalRate / numRates;
    return userRating;
  }

  /**
   * Deletes a rating from the list
   */
  public RatingList deleteRating(int ID) {
    RatingList.getInstance();
    ratings.remove(ID);
    return RatingList.getInstance();
  }

  /**
   * Adds a rating to the list
   */
  public RatingList addRating(int numRating, String comment, User user) {
    Rating newRating = new Rating(numRating, comment, user);
    RatingList.getInstance();
    ratings.add(newRating);
    return RatingList.getInstance();
  }
}