package lab5;

/**
 * @author Aleksandra Łabęda,
 */

//===============================
public class Factory {
    private Machine[] machines; // Tablica maszyn
    private final int maxMachines; // Maksymalna ilość maszyn w fabryce
    private static int number_of_machines = 0;

    public Factory(int maxMachines) {
        this.maxMachines = maxMachines;
        machines = new Machine[maxMachines];
    }

    public void addMachine(Machine machine) {
        if (number_of_machines < maxMachines) {
            machines[number_of_machines] = machine;
        }
        number_of_machines++;
    }


    public int simulateProduction(int targetAmount) {
        // Symuluj produkcję i zwróć minimalną liczbę dni potrzebną na wyprodukowanie targetAmount produktów.
        int produced = 0; // Liczba już wyprodukowanych produktów
        int days = 0; // Licznik dni
        while (produced < targetAmount) {
            int i = 0;
            days++;
            while (i < maxMachines && machines[i] != null) {
                produced += machines[i].produce();
                i++;
            }

        }
        return days;
    }

    public static void main(String[] args) {
        Machine m1 = new Machine(1);
        Machine m2 = new Machine(2);
        Factory fabryka = new Factory(5);
        fabryka.addMachine(m1);
        fabryka.addMachine(m2);
        int max_days = fabryka.simulateProduction(7);
        System.out.println(max_days);

    }
}