package lab8;
/**
 * @author Aleksandra Łabęda
 * Adrian Lis
 */

public class CustomList {
    protected Node root;
    protected int size;

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
    public int remove(int value) {
        Node current = root;
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

}
