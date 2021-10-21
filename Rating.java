import java.util.ArrayList;

public class Rating {
    private int numRating;
    private String comment;
    private User user;
    private ArrayList<Rating> ratings;

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

    public User getUser() {
        return null;
    }
}