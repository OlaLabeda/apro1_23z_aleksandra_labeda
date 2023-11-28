package lab8;
/**
 * @author Aleksandra Łabęda
 * Adrian Lis
 */

public class TestSelfOrganizingList {
    /**
     * Main method containing tests for the SelfOrganizingList class
     */
    public static void main(String[] args) {
        SelfOrganizingList selfOrganizingList = new SelfOrganizingList();
        selfOrganizingList.add(5);
        selfOrganizingList.add(7);
        selfOrganizingList.add(5);
        selfOrganizingList.add(1);
        selfOrganizingList.add(3);
        selfOrganizingList.add(9);

        System.out.println("List: " + selfOrganizingList);
        System.out.println("Size: " + selfOrganizingList.length());

        Node node = selfOrganizingList.getNode(7);
        System.out.println("Found node: " + node);

        // Additional tests
        Node accessedNode = selfOrganizingList.getNode(5);
        System.out.println("Accessed node: " + accessedNode);
        System.out.println("List after access: " + selfOrganizingList);


        Node newNode = new Node(10);
        selfOrganizingList.add(10);
        System.out.println("Added new node with value 10: " + newNode);
        System.out.println("List after addition: " + selfOrganizingList);

        Node nonExistingNode = selfOrganizingList.getNode(99);
        System.out.println("Accessing non-existing node: " + nonExistingNode);
        System.out.println("List after access: " + selfOrganizingList);

        Node accessedNode1 = selfOrganizingList.getNode(9);
        System.out.println("Accessed node: " + accessedNode1);
        System.out.println("List after access: " + selfOrganizingList);

        selfOrganizingList.getNode(9);
        System.out.println("Accessed node: " + 9);
        System.out.println("List after access: " + selfOrganizingList);
    }
}
