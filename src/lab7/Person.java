package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Person {
    /**
     * person's first name
     */
    private String firstName;
    /**
     * person's last name
     */
    private String lastName;
    /**
     * persons's birthdate
     */
    private Birthdate birthdate;
    /**
     * persons's place of birth
     */
    private String placeOfBirth;

    /**
     *
     * @param firstName
     * @param lastName
     * @param birthdate
     * @param placeOfBirth
     * constuctor setting personal data
     *
     */

    public Person(String firstName, String lastName, Birthdate birthdate, String placeOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.placeOfBirth = placeOfBirth;
    }

    /**
     *
     * @return
     * returns first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * sets first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     * returns
     */
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
