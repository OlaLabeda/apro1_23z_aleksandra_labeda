package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Teacher extends Person{
    private String academicDegree;
    private String subject;
    private String faculty;
    private int room;

    public Teacher(String firstName, String lastName, String academicDegree,
                   Birthdate birthdate, String placeOfBirth, String subject,
                   String faculty, int room) {
        super(firstName, lastName, birthdate, placeOfBirth);
        this.academicDegree = academicDegree;
        this.subject = subject;
        this.faculty = faculty;
        this.room = room;
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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
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
