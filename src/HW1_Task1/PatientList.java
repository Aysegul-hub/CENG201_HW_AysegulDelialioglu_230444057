public class PatientList {

    // We create a linked list to store the patients. (Node keeps patient data and pointer to next node)

    private class Node {
        Patient data;
        Node next;

        Node(Patient data) {
            this.data = data;
            this.next = null;

        }
    }

    //This shows the head is null at the beginning.

    private Node head;
    public PatientList() {
        head = null;

    }
    // We add patient to the end of the list.
    public void addPatient(Patient pat) {
        Node newNode = new Node(pat); // Create a new node with the patient data.

        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next; // Traverse to the end of the list. 

        }
        current.next = newNode; // We link the new node at the end of the list.

    }
    // We remove patient by ID.
    public void removePatientById( int id) {
        if(head == null) {
            return; // That is mean the list is empty.
        }

        if(head.data.getId() == id) {
            head = head.next; // Remove the head node. The head will be next node.
            return;
        }

        Node current = head;
        while ( current.next != null && current.next.data.getId() != id) {
            current = current.next; // Traverse the list to find the node to remove.
        }

        if ( current.next != null) {
            current.next = current.next.next; 
        }
    }
    //We find patient using ID.
    public Patient findPatientList(int id) {
        Node current = head; // Start from the head node.

        while ( current != null) {
            if ( current.data.getId() == id) {
                return current.data; // Return the patient if found.
            }
            current = current.next; // Move the next node.
        }
        return null; // Return null if the patient is not found in the list.
    }
    public void printList() {
        Node current = head; 
        while( current != null) { // Traverse the list.
            System.out.println(current.data); // Print the patient data.
            current = current.next ; // Move the next patient.


        }
    }
}
