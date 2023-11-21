package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Furniture {
    /**
     * description of a furniture
     */
    private String description = null;
    /**
     * @param description
     * constructor setting description of a furniture
     */
    public Furniture(String description) {
        this.description = description;
    }
    /**
     * @return
     * returns description of a furniture
     */
    public String getDesccription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDesccription(String description) {
        this.description = description;
    }
}
