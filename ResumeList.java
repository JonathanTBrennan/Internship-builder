/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

import java.util.ArrayList;
import java.util.UUID;

/**
 * List of all the resumes
 */
public class ResumeList extends DataLoader {
    private static ResumeList resumeList;
    private ArrayList<Resume> resumes;

    /**
     * Loads the resumes from the json files, constructs and fills the array
     */
    private ResumeList() {
        resumes = new ArrayList<Resume>(DataLoader.getResumes());
    }

    /**
     * Gets the updated list of the resumes
     * @return updated list of resumes
     */
    public static ResumeList getInstance() {
        if(resumeList == null) {
            resumeList = new ResumeList();
        }
        return resumeList;
    }

    /**
     * Adds a resume to the list
     * @param resume being added
     */
    public void addResume(Resume resume) {
        resumes.add(resume);
    }

    /**
     * Gets the list of all resumes
     * @return list of all resumes
     */
    public ArrayList<Resume> getAllResumes() {
        return resumes;
    }

    /**
     * Gets a specific resume from the list
     * @param ID of student whose resume is being retrieved
     * @return resume associated with the ID
     */
    public Resume getResume(UUID ID) {
        for(int i = 0; i < resumes.size(); i++) {
            if(ID.equals(resumes.get(i).getStudentID())) {
                return resumes.get(i);
            }
        }
        return null;
    }
}
