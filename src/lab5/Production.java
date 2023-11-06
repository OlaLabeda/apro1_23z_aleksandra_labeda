package lab5;

public class Production {
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
