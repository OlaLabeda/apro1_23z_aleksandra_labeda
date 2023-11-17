package lab7;

public class Person {
    private String firstName;
    private String lastName;
    private Birthdate birthdate;
    private String placeOfBirth;

    public Person(String firstName, String lastName, Birthdate birthdate, String placeOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.placeOfBirth = placeOfBirth;
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
