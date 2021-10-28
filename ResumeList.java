import java.util.ArrayList;
import java.util.UUID;
public class ResumeList extends DataLoader {
    private static ResumeList resumeList;
    private ArrayList<Resume> resumes;

    private ResumeList() {
        resumes = new ArrayList<Resume>(DataLoader.getResumes());
    }

    public static ResumeList getInstance() {
        if(resumeList == null) {
            resumeList = new ResumeList();
        }
        return resumeList;
    }

    public void addResume(Resume resume) {
        resumes.add(resume);
    }

    public ArrayList<Resume> getResumes() {
        return resumes;
    }
    public Resume getResume(UUID ID) {
        for(int i = 0; i < resumes.size(); i++) {
            if(ID.equals(resumes.get(i).getStudentID())) {
                return resumes.get(i);
            }
        }
        return null;
    }
}
