package lab7;

public class PersonalData {
    private String firstName;
    private String lastName;
    private String peselNumber;
    public PersonalData(String firstName, String lastName, String peselNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
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

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getPeselNumber() {

        return peselNumber;
    }

    public void setPeselNumber(String peselNumber) {

        this.peselNumber = peselNumber;
    }
}