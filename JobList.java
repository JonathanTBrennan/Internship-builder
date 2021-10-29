
/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;

/**
 * Getting class for the list of all jobs
 */
public class JobList extends DataLoader {

    private static JobList jobList;
    private ArrayList<JobListing> jobListings;

    /**
     * Constructor for the list of jobs
     */
    private JobList() {
        jobListings = new ArrayList<JobListing>(DataLoader.getJobListings());
    }

    /**
     * Getter for a refreshed list of jobs
     * 
     * @return refreshed list of jobs
     */
    public static JobList getInstance() {
        if(jobList == null) {
            jobList = new JobList();
        }
        return jobList = new JobList();
    }

    /**
     * Gets the list of jobs that were specifically searched for
     * @return List of the filtered jobs
     */
    public ArrayList<JobListing> getJobLists(boolean code, int codeFilt, boolean location, String locationSearch, boolean rate, Rating rateSearch) {
        ArrayList<JobListing> filteredList = new ArrayList<JobListing>();
        CodingFilters codingFilter = CodingFilters.JAVA;
        if (code) {
            switch (codeFilt) {
                case 1:
                    codingFilter = CodingFilters.JAVA;
                    break;
                case 2:
                    codingFilter = CodingFilters.C;
                    break;
                case 3:
                    codingFilter = CodingFilters.PYTHON;
                    break;
                case 4:
                    codingFilter = CodingFilters.RUBY;
                    break;
                case 5:
                    codingFilter = CodingFilters.JAVASCRIPT;
                    break;
                case 6:
                    codingFilter = CodingFilters.HTML;
                    break;
                case 7:
                    codingFilter = CodingFilters.JAVA;
                    break;
                default:
                    codingFilter = CodingFilters.JAVA;
                    break;
            }
        }
        
        if (code && location && rate) {
            for (int i = 0; i < jobListings.size(); i++) {
                if (jobListings.get(i).getCodeFilter() == codingFilter && jobListings.get(i).getLocation().equalsIgnoreCase(locationSearch) && RatingList.getInstance().getUsersRating(jobListings.get(i).getEmployerID()) >= rateSearch.getNumRating()) {
                    filteredList.add(jobListings.get(i));
                }
            }
        }
        else if (code && location) {
            for (int i = 0; i < jobListings.size(); i++) {
                if (jobListings.get(i).getCodeFilter() == codingFilter && jobListings.get(i).getLocation().equalsIgnoreCase(locationSearch)) {
                    filteredList.add(jobListings.get(i));
                }
            }
        }
        else if (code && rate) {
            for (int i = 0; i < jobListings.size(); i++) {
                if (jobListings.get(i).getCodeFilter() == codingFilter && RatingList.getInstance().getUsersRating(jobListings.get(i).getEmployerID()) >= rateSearch.getNumRating()) {
                    filteredList.add(jobListings.get(i));
                }
            }
        }
        else if (location && rate) {
            for (int i = 0; i < jobListings.size(); i++) {
                if (jobListings.get(i).getLocation().equalsIgnoreCase(locationSearch) && RatingList.getInstance().getUsersRating(jobListings.get(i).getEmployerID()) >= rateSearch.getNumRating()) {
                    filteredList.add(jobListings.get(i));
                }
            }
        }
        else if (code) {
            for (int i = 0; i < jobListings.size(); i++) {
                if (jobListings.get(i).getCodeFilter() == codingFilter) {
                    filteredList.add(jobListings.get(i));
                }
            }
        }
        else if (location) {
            for (int i = 0; i < jobListings.size(); i++) {
                if (jobListings.get(i).getLocation().equalsIgnoreCase(locationSearch)) {
                    filteredList.add(jobListings.get(i));
                }
            }
        }
        else if (rate) {
            for (int i = 0; i < jobListings.size(); i++) {
                if (RatingList.getInstance().getUsersRating(jobListings.get(i).getEmployerID()) >= rateSearch.getNumRating()) {
                    filteredList.add(jobListings.get(i));
                }
            }
        }
        else {
            for (int i = 0; i < jobListings.size(); i++) {
                filteredList.add(jobListings.get(i));
            }
        }
        return filteredList;
    }

    /**
   * Deletes a job listing from the list
   */
  public JobList deleteJob(int ID) {
    JobList.getInstance();
    jobListings.remove(ID);
    return JobList.getInstance();
  }

  /**
   * Getter for the size of the list of jobs
   * @return size of list
   */
  public void fixIDs(int idFrom) {
    for (int i = idFrom+1; i < jobListings.size(); i++) {
      jobListings.get(i).setID(i-1);
    }
  }
}