
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
     * Getter for a specific group of jobs
     * 
     * @param keyword type of job to look for
     * @return list of matching jobs
     */

    public JobListing getJob(int i) {
        // NEED TO TALK ABOUT
        // gonna be a little complex bc need to see what filters are active

        // for (int i = 0; i < jobListings.size(); i++) {
        // if (jobListings.get(i).get() == keyword) {
        // return users.get(i);
        // }
        // }
        if(i <= jobListings.size()) {
            return jobListings.get(i);
        }
        return null;
    }

    public ArrayList<JobListing> getJobLists() {
        return jobListings;
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