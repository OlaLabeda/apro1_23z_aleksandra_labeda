package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Table extends Furniture {
    /**
     * number of legs of a table
     */
    private int legNumber;

    /**
     *
     * @param legNumber
     * @param description
     * constructor of a class table
     */
    public Table (int legNumber, String description) {
        super(description);
        this.legNumber = legNumber;
    }

    /**
     *
     * @return
     * returns number of legs
     */
    public int getLegNumber() {
        return legNumber;
    }

    /**
     *
     * @param legNumber
     * sets number of legs
     */
    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    @Override
    public String toString() {
        return "Stol " + super.getDesccription() + " z nastepujaca iloscia nog: " +
                 legNumber;
    }
}
