import java.util.ArrayList;

public class Rating {
    private int numRating;
    private String comment;
<<<<<<< HEAD
    private User user;
    private ArrayList<Rating> ratings;
=======
    private User member;
    private ArrayList<Rating> rating;

    public Rating(int numRating, String comment, User member) {
>>>>>>> 1255c95f006c8401997389fad7c3c114d8e9353f

    public Rating(int numRating, String comment, User user) {
        this.numRating = numRating;
        this.comment = comment;
        this.user = user;
        this.ratings = new ArrayList<Rating>();
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }

    public Rating editRating(Rating rating, int numRating, String comment) {
        return null;
    }

    public int getNumRating() {
        return 0;
    }

<<<<<<< HEAD
    public User getUser() {
=======
    public User getMember() {
>>>>>>> 1255c95f006c8401997389fad7c3c114d8e9353f
        return null;
    }
}