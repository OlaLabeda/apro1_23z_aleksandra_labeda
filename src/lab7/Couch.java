package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Couch extends Furniture{
    /**
     * liczba osob dla kanapy
     */
    private int numberOfPeople;

    /**
     *
     * @param numberOfPeople
     * @param description
     * constructor for the couch
     * sets amount of people who can sit on a couch
     */
    public Couch (int numberOfPeople, String description) {
        super(description);
        this.numberOfPeople = numberOfPeople;
    }
    /**
     *
     * @return
     * returns given number of people
     */
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     *
     * @param legNumber
     * returns number of legs
     */
    public void setLegNumber(int legNumber) {
        this.numberOfPeople = legNumber;
    }
    @Override
    public String toString() {
        return "Kanapa " + super.getDesccription() + " dla" + numberOfPeople +
                "osob";
    }
}
