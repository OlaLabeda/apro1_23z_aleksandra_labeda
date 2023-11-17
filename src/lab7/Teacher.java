package lab7;

public class Teacher extends Person{
    private String academicDegree;
    private String subject;
    private String faculty;
    private int experience;

    public Teacher(String firstName, String lastName, String academicDegree,
                   Birthdate birthdate, String placeOfBirth, String subject,
                   String faculty, int experience) {
        super(firstName, lastName, birthdate, placeOfBirth);
        this.academicDegree = academicDegree;
        this.subject = subject;
        this.faculty = faculty;
        this.experience = experience;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
