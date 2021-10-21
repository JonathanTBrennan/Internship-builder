
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
    private void JobList() {
        jobListings = new ArrayList<JobListing>(DataLoader.getJobListings());
    }

    /**
     * Getter for a refreshed list of jobs
     * 
     * @return refreshed list of jobs
     */
    public static JobList getInstance() {
        return jobList = new JobList();
    }

    /**
     * Getter for a specific group of jobs
     * 
     * @param keyword type of job to look for
     * @return list of matching jobs
     */
    public ArrayList<JobListing> getJob(String keyword) {
        // NEED TO TALK ABOUT
        // gonna be a little complex bc need to see what filters are active

        // for (int i = 0; i < jobListings.size(); i++) {
        // if (jobListings.get(i).get() == keyword) {
        // return users.get(i);
        // }
        // }

        return null;
    }
}