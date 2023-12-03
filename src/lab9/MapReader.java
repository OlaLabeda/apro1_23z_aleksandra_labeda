package lab9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aleksandra Łabęda
 */

public class MapReader {
    /**
     *
     * @param filePath
     * @return
     * a function reading map from a given file
     */
    public static Map readMapFromFile(String filePath) {
        //reading from given file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            //reading first line and getting size of a map from it
            String[] dimensions = br.readLine().split(" ");
            int height = Integer.parseInt(dimensions[0]);
            int width = Integer.parseInt(dimensions[1]);

            //creating a new map
            Map map = new Map(height, width);

            //iterating over rows and columns and setting values of all fields
            for (int i = 0; i < height; i++) {
                //reading map coordinates
                String[] rowValues = br.readLine().split(" ");
                for (int j = 0; j < width; j++) {
                    //enum value picked based on a number value in a string and set to the variable terrainType
                    TerrainType terrainType = TerrainType.values()[Integer.parseInt(rowValues[j])];
                    //cretaing new Field object representing one field on a map and setting its value to the one read from the file
                    Field field = new Field(terrainType);
                    //setting a field value on a map to the created field value
                    map.setField(i, j, field);
                }
            }
            return map;
        }
        catch(IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *
     * @param map
     * @return
     * a function finding Islands ona  given map
     */
    public static ArrayList<Island> findIslands(Map map) {
        ArrayList<Island> islands = new ArrayList<>();
        boolean[][] visited = new boolean[map.getHeight()][map.getWidth()];

        for (int i = 0; i < map.getHeight(); i++) {
            for(int j = 0; j < map.getWidth(); j++) {
                if (!visited[i][j] && map.getField(i, j).getTerrainType() == TerrainType.LAND) {
                    Island island = exploreIsland(map, visited, i, j);
                    islands.add(island);
                }
            }
        }
        return islands;
    }

    /**
     *
     * @param map
     * @param visited
     * @param row
     * @param col
     */
    public static Island exploreIsland(Map map, boolean[][] visited, int row, int col) {
        Island island = new Island();
        Queue<int[]> queue = new LinkedList<>();
        //adds a new integer list to the end of the queue contatining respecitvely row and column values
        queue.add(new int[]{row, col});
        visited[row][col] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentCol = current[1];
            //adding a field to an island
            island.addField(map.getField(currentRow, currentCol));

            //adding neighbouring unvisited fields to the island
            for (int[] neighbor : getNeighbors(map, currentRow, currentCol)) {
                int neighborRow = neighbor[0];
                int neighborCol = neighbor[1];
                if (!visited[neighborRow][neighborCol] && map.getField(neighborRow, neighborCol).getTerrainType() == TerrainType.LAND) {
                    queue.add(new int[]{neighborRow, neighborCol});
                    visited[neighborRow][neighborCol] = true;
                }
            }
        }
        return island;
    }

    private static ArrayList<int[]> getNeighbors (Map map, int row, int col){
        ArrayList<int[]> neighbors = new ArrayList<>();
        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (isValid(map, newRow, newCol)) {
                neighbors.add(new int[]{newRow, newCol});
            }
        }
        return neighbors;
    }
    private static boolean isValid(Map map, int row, int col) {
        return row >= 0 && row <  map.getHeight() && col >= 0 && col <  map.getWidth();
    }

}