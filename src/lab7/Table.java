package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Table extends Furniture {
    private int legNumber;
    public Table (int legNumber, String description) {
        super(description);
        this.legNumber = legNumber;
    }

    public String getDescription() {
      return super.getDesccription();
    }
    public void setDescription(String description) {
        super.setDesccription(description);
    }
    public int getLegNumber() {
        return legNumber;
    }

    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    @Override
    public String toString() {
        return "Stol z nastepujaca iloscia nog: " +
                 legNumber;
    }
}
