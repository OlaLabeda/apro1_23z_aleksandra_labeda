package lab7;

/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Chair extends Furniture{
    /**
     *
     * @param description
     * constructor calling super class to get a description for a chair
     */

    public Chair(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "Krzeslo " + super.getDesccription() + " " + getDesccription();
    }
}
