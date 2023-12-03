package lab9;

/**
 * @author Aleksandra Łabęda
 */
public class Map {
    /**
     * map contatining list of points-fields
     */
    private Field[][] map;

    /**
     * @param height
     * @param width  initializing a map of a given size
     */
    public Map(int height, int width) {
        map = new Field[height][width];
    }

    /**
     * @param row
     * @param col
     * @param field a function setting a value to a particular field in a map
     */
    public void setField(int row, int col, Field field) {
        map[row][col] = field;
    }

    /**
     * @param row
     * @param col
     * @return returns value of a field of given coordinates
     */
    public Field getField(int row, int col) {
        return map[row][col];
    }

    /**
     * @return returns the height of the map
     */
    public int getHeight() {
        return map.length;
    }

    /**
     * @return return the width of the map
     */
    public int getWidth() {
        return map[0].length;
    }
}