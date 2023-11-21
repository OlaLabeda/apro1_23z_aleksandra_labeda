package lab7;

/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Chair extends Furniture{

    public Chair(String description) {
        super(description);
    }

    @Override
    public String getDesccription() {
        return super.getDesccription();
    }

    @Override
    public void setDesccription(String desccription) {
        super.setDesccription(desccription);
    }

    @Override
    public String toString() {
        return "Krzeslo " + getDesccription();
    }
}
