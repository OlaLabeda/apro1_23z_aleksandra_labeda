package lab5;
/**
 * @author Aleksandra Łabęda,
 *Aleksandra Wasilewska
 */

public class Machine {
    private int speed;
    private int produced_items = 0;
    private int day_counter = 0;

    public Machine(int speed) {
        this.speed = speed;
    }

    /**
     * @return number of produced items by a particular machine
     * on particular day (days counted based on how many times the method was called
     */
    public int produce() {
        day_counter++;
        if (day_counter % speed == 0) {
            return 1;
        }
        return 0;
    }


    public int getSpeed() {
        return this.speed;
    }

    public int getDay_counter() {
        return this.day_counter;
    }

    public int getProduced_items() {
        return this.produced_items;
    }

}
