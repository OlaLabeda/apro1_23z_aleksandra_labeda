package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class PersonalData {
    /**
     * student's first name
     */
    private String firstName;
    /**
     * student's last
     */
    private String lastName;
    /**
     * student's pesel Number
     */
    private String peselNumber;

    /**
     *
     * @param firstName
     * @param lastName
     * @param peselNumber
     * constructor setting personal data of a person
     */
    public PersonalData(String firstName, String lastName, String peselNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
    }

    /**
     *
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * sets first name value
     *
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    /**
     *
     * @return
     * returns last name value
     */
    public String getLastName() {

        return lastName;
    }

    /**
     *
     * @param lastName
     * sets last name value
     */
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    /**
     *
     * @return
     * returns pesel number value
     */
    public String getPeselNumber() {

        return peselNumber;
    }

    /**
     *
     * @param peselNumber
     * sets pesel number
     */
    public void setPeselNumber(String peselNumber) {

        this.peselNumber = peselNumber;
    }
}