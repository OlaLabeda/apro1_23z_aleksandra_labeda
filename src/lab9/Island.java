package lab9;

import java.util.ArrayList;

/**
 * @author Aleksandra Łabęda
 */

public class Island {
    /**
     * array list containting fields on the island
     */
    private ArrayList<Field> fields;

    /**
     * constructor of and Island class initializing new arrayList
     */
    public Island() {
        //initialize new arrayList
        fields = new ArrayList<>();
    }

    /**
     * @param field method adding field to an existing array of fields
     */
    public void addField(Field field) {
        fields.add(field);
    }

    /**
     * @return method returning array of fields of a particular island
     */
    public ArrayList<Field> getFields() {
        return fields;
    }

    /**
     * @return method returning size of an Island
     */
    public int getSize() {
        return fields.size();
    }
}