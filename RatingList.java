/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;

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