import java.util.LinkedList;

class RemoveAllElementsFromLinkedList {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Display the linked list before removal
        System.out.println("Linked List before removal: " + linkedList);

        // Remove all elements from the linked list
        linkedList.clear();

        // Display the linked list after removal
        System.out.println("Linked List after removal: " + linkedList);
    }
}

