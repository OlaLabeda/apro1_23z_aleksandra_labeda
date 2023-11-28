package lab8;
/**
 * @author Aleksandra Łabęda
 * Adrian Lis
 */

public class CustomList {
    private Node root;
    private int size;

    public CustomList() {
        root = null;
        size = 0;
    }

    /**
     * Adds the new node to the list
     * @param value added to the list
     */
    public void add(int value) {
        Node node = root;
        Node newNode = new Node(value);
        // we have the empty list, so add the new node as the root
        if (root == null) {
            root = newNode;
        }
        else {
            // traverse through the list to find the last node
            while (node.getNext() != null) {
                node = node.getNext();
            }
            // add the new node after the last one
            node.setNext(new Node(value));
        }
        // increase the size of the list
        ++size;
    }

    /**
     * Removes all items from the list with a given value
     * @param value - value present in nodes
     * @return number of removed elements
     */
    public int remove(int value) {    Node current = root;
        Node previous = null;
        int removedCount = 0;

        while (current != null) {
            if (current.getValue() == value) {
                if (previous == null) {
                    // Removing the root
                    root = current.getNext();
                    // Move to the next node without incrementing removedCount
                    current = current.getNext();
                } else {
                    // Removing a node in the middle or at the end
                    previous.setNext(current.getNext());
                    // Move to the next node without incrementing removedCount
                    current = current.getNext();
                }
                // Decrease the size of the list
                --size;
                ++removedCount;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        return removedCount;
    }

    /**
     * Removes the head from the list.
     * @return true if the operations was done correctly, false otherwise
     */
    public boolean pop() {
        if (root != null) {
            // Removing the root
            root = root.getNext();
            // Decrease the size of the list
            --size;
            return true;
        }
        return false;
    }

    /**
     * Returns the size of the list
     * @return the integer saying, how many elements the list contains
     */
    public int length(){
        return size;
    }

    /**
     * Finds a node in the list with the given value
     * @param value what value should be found
     * @return first node with a given value or null if none is present in the list
     */
    public Node getNode(int value) {
        Node result = root;
        while (result != null) {
            if (result.getValue() == value) {
                return result;
            }
            result = result.getNext();
        }
        return null;
    }

    public Node getRoot() {
        return root;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node node = root;
        while (node != null) {
            s.append(node.getValue());
            s.append(" ");
            node = node.getNext();
        }
        return s.toString();
    }

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

        // Test 7: Adding after all removals
        customList.add(15);
        customList.add(20);
        System.out.println("Test 7 - Added elements with values 15 and 20 after all removals");
        System.out.println("List after addition: " + customList);

        // Test 8: Removing from an empty list
        CustomList emptyList = new CustomList();
        emptyList.remove(5);
        System.out.println("Test 8 - Removed from an empty list (no effect)");
        System.out.println("Empty list after removal: " + emptyList);

    }
}
