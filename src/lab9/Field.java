package lab9;

/**
 * @author Aleksandra Łabęda
 */
public class Field {
    /**
     * field containing particular type of terrain from enum
     */
    private TerrainType terrainType;

    /**
     * @param terrainType constructor setting terrain type
     */
    public Field(TerrainType terrainType) {
        this.terrainType = terrainType;
    }

    /**
     * getter returning terrain type
     *
     * @return
     */
    public TerrainType getTerrainType() {
        return terrainType;
    }

}