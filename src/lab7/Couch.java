package lab7;

public class Couch extends Furniture{
    private int numberOfPeople;
    public Couch (int numberOfPeople, String description) {
        super(description);
        this.numberOfPeople = numberOfPeople;
    }

    public String getDescription() {
        return super.getDesccription();
    }
    public void setDescription(String description) {
        super.setDesccription(description);
    }
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setLegNumber(int legNumber) {
        this.numberOfPeople = legNumber;
    }

    @Override
    public String toString() {
        return "Kanapa dla " + numberOfPeople +
                "osob";
    }
}
