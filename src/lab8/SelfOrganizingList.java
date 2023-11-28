package lab8;
/**
 * @author Aleksandra Łabęda
 * Adrian Lis
 */

/**
 * Class implementing a self-organizing list that optimizes the search time of nodes.
 * In this class, each node stores information about the number of accesses (accessCount).
 * The getNode method moves the node to the beginning of the list according to the number of accesses on each access.
 */
public class SelfOrganizingList extends CustomList{

    /**
     * Constructor creating an empty self-organizing list.
     */
    public SelfOrganizingList() {
        super();
    }


    /**
     * Finds the node with a specified value and moves it to the beginning of the list according to the number of accesses.
     * Increments the access count for the found node.
     *
     * @param value The value of the node to find and move.
     * @return The found node or null if a node with the given value does not exist.
     */
    public Node getNode(int value) {
        Node current = root;
        Node previous = null;

        while (current != null) {
            if (current.getValue() == value) {
                // Increase the access count for the accessed node
                current.increaseAccessCount();

                // Move the accessed node to the front of the list
                if (previous != null) {
                    previous.setNext(current.getNext());
                    current.setNext(root);
                    root = current;
                }
                return current;
            }
            previous = current;
            current = current.getNext();
        }

        return null;
    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        Node node = root;
        while (node != null) {
            s.append(node.getValue()).append("[").append(node.getAccessCount()).append("]").append(" ");
            node = node.getNext();
        }
        return s.toString();
    }

}
