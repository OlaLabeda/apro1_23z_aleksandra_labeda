package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Teacher extends Person{
    /**
     * academic degree of a teacher
     */
    private String academicDegree;
    /**
     * subject that a teacher teaches
     */
    private String subject;
    /**
     * faculty of a teacher
     */
    private String faculty;
    /**
     * a room where a teacher is present
     */
    private int room;

    /**
     *
     * @param firstName
     * @param lastName
     * @param academicDegree
     * @param birthdate
     * @param placeOfBirth
     * @param subject
     * @param faculty
     * @param room
     * constructor of a class sets data of a teacher
     */

    public Teacher(String firstName, String lastName, String academicDegree,
                   Birthdate birthdate, String placeOfBirth, String subject,
                   String faculty, int room) {
        super(firstName, lastName, birthdate, placeOfBirth);
        this.academicDegree = academicDegree;
        this.subject = subject;
        this.faculty = faculty;
        this.room = room;
    }

    /**
     *
     * @return
     * returns academic degree of a teacher
     */
    public String getAcademicDegree() {
        return academicDegree;
    }

    /**
     *
     * @param academicDegree
     * sets academic degree
     */
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /**
     *
     * @return
     * returns subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     *
     * @return
     * returns number of a room
     */
    public int getRoom() {
        return room;
    }

    /**
     *
     * @param room
     * lets changing the room number
     */
    public void setRoom(int room) {
        this.room = room;
    }

    /**
     *
     * @param subject
     * sets subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     *
     * @return
     * returns faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     *
     * @param faculty
     * sets faculty
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
