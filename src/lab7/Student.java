package lab7;

public class Student extends Person {

    private String major;
    private String faculty;
    private String indexNumber;

    public Student(String firstName, String lastName, String indexNumber,
                   Birthdate birthdate, String placeOfBirth, String faculty, String major) {
        super(firstName, lastName, birthdate, placeOfBirth);
        this.indexNumber = indexNumber;
        this.faculty = faculty;
        this.major = major;
    }


    public String getMajor() {
        return major;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
