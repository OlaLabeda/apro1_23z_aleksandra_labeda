package lab8;

/**
 * @author Aleksandra Łabęda
 * Adrian Lis
 */
public class TestCustomList {
    /**
     * Main method containing tests for the CustomList class.
     */
    public static void main(String[] args) {
        CustomList customList = new CustomList();
        customList.add(5);
        customList.add(7);
        customList.add(9);
        customList.add(5);
        customList.add(1);
        customList.add(3);
        customList.add(9);
        System.out.println("List: " + customList);
        System.out.println("Size: " + customList.length());
        Node node = customList.getNode(7);
        System.out.println("Found node: " + node);

        // Test 1: Removing a single element
        int removedCount = customList.remove(7);
        System.out.println("Test 1 - Removed " + removedCount + " elements with value 7");
        System.out.println("List after removal: " + customList);

        // Test 2: Removing multiple elements
        removedCount = customList.remove(5);
        System.out.println("Test 2 - Removed " + removedCount + " elements with value 5");
        System.out.println("List after removal: " + customList);

        // Test 3: Removing the first node
        customList.pop();
        System.out.println("Test 3 - Removed the first node");
        System.out.println("List after pop: " + customList);

        // Test 4: Adding after removal
        customList.add(10);
        System.out.println("Test 4 - Added element with value 10 after removal");
        System.out.println("List after addition: " + customList);

        // Test 5: Removing a non-existing element
        removedCount = customList.remove(99);
        System.out.println("Test 5 - Removed " + removedCount + " elements with value 99 (non-existing)");
        System.out.println("List after removal: " + customList);

        // Test 6: Removing the last node
        customList.remove(10);
        System.out.println("Test 6 - Removed the last node");
        System.out.println("List after removal: " + customList);


        // Test 7: Removing from an empty list
        CustomList emptyList = new CustomList();
        emptyList.remove(5);
        System.out.println("Test 8 - Removed from an empty list (no effect)");
        System.out.println("Empty list after removal: " + emptyList);

    }
}
