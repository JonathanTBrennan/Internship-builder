/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;

 /**
  * Deals with being able to search through job listings
  */
public class ListingSearch {

    private ArrayList<ListingFilter> filters;

    /**
     * Deals with the search of job listings
     * @param applicant student requesting a search of job listings
     * @param listingFilters filters applicant requests to limit job listings to
     * @return list of applicable job listings
     */
<<<<<<< HEAD
    public ArrayList<JobListing> search(User applicant, ArrayList<ListingFilter> listingFilters) {
=======
    public ArrayList<JobListing> search(Student applicant, ArrayList<ListingFilter> listingFilters) {
>>>>>>> 5c442cabce65b570e4bca4d90f97d4dea1322508
        return null;
    }

    /**
     * Gets the requested filter for search
     * @return requested filter for search
     */
    public ListingFilter getFilter() {
        return null;
    }

    /**
     * Sets the requested filter for search as active
     * @param lFilter requested filter for search
     */
    public void setFilter (ListingFilter lFilter) {

    }
}