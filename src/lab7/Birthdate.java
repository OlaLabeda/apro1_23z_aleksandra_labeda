package lab7;

/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Birthdate {
    /**
     * day of birth
     */
    private int day;
    /**
     * month of birth
     */
    private int month;
    /**
     * year of birth
     */
    private int year;

    /**
     *
     * @param day
     * @param month
     * @param year
     * constructor sets data of birthday
     */

    public Birthdate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     *
     * @return
     * returns day of birth
     */
    public int getDay() {
        return day;
    }

    /**
     *
     * @return
     * returns month of birth
     */
    public int getMonth(){
        return month;
    }

    /**
     *
     * @return
     * returns year of birth
     */
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        String date = day + "." + month + "." + year;
        return date;

    }
}
