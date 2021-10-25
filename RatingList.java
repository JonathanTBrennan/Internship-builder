
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
  public RatingList getInstance() {
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
    return ratings.get(ID);
  }
}