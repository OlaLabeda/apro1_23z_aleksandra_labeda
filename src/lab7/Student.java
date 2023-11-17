package lab7;

public class Student {
    private String firstName;
    private String lastName;
    private Birthdate birthdate;
    private String placeOfBirth;
    private String major;
    private String faculty;
    private String indexNumber;

    public Student(String firstName, String lastName, String indexNumber,
                   Birthdate birthdate, String placeOfBirth, String faculty, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.indexNumber = indexNumber;
        this.placeOfBirth = placeOfBirth;
        this.faculty = faculty;
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Birthdate getBirthdate() {
        return birthdate;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
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

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setBirthdate(Birthdate birthdate) {
        this.birthdate = birthdate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
