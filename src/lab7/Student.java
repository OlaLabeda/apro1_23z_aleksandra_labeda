package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Student extends Person {
    /**
     * major of a student
     */
    private String major;
    /**
     * faculty of a student
     */
    private String faculty;
    /**
     * index number of a student
     */
    private String indexNumber;

    /**
     *
     * @param firstName
     * @param lastName
     * @param indexNumber
     * @param birthdate
     * @param placeOfBirth
     * @param faculty
     * @param major
     *
     * constructor setting data of a student
     */
    public Student(String firstName, String lastName, String indexNumber,
                   Birthdate birthdate, String placeOfBirth, String faculty, String major) {
        super(firstName, lastName, birthdate, placeOfBirth);
        this.indexNumber = indexNumber;
        this.faculty = faculty;
        this.major = major;
    }

    /**
     *
     * @return
     * returns major of a student
     */
    public String getMajor() {
        return major;
    }

    /**
     *
     * @return
     * returns faculty of a student
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     *
     * @return
     * returns index number of a student
     */
    public String getIndexNumber() {
        return indexNumber;
    }

    /**
     *
     * @param indexNumber
     * sets index number of a student
     */
    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    /**
     *
     * @param faculty
     * sets faculty of a student
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     *
     * @param major
     * sets major of a student
     */

    public void setMajor(String major) {
        this.major = major;
    }

}
