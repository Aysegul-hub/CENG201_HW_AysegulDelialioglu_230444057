public class PatientList {

    // We create a linked list to store the patients. (Node keeps patient data and pointer to next node)

    class Node {
        Patient data;
        Node next;

        Node(Patient data) { // Constructor
            this.data = data;
            

        }
    }

    

    Node head;
    // We add patient to the end of the list.
    public void addPatient(Patient p) {
        Node n = new Node(p); // Create a new node with the patient data.
        n.next = head;
        head = n;
    }
    // We remove patient by ID.
    public void removePatientById( int id) {
        if(head == null) {
            return; // That is mean the list is empty.
        }

        if(head.data.id == id) {
            head = head.next; // Remove the head node. The head will be next node.
            return;
        }

        Node cur = head;
        while ( cur.next != null ) {
            if ( cur.next.data.id == id) {
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }
    public void removePatient(int id) {
        removePatientById(id);
    }

    //We find patient using ID.
    public Patient findPatientList(int id) {
        Node cur = head; // Start from the head node.

        while ( cur != null) {
            if ( cur.data.id == id) {
                return cur.data; // Return the patient if found.
            }
            cur = cur.next; // Move the next node.
        }
        return null; // Return null if the patient is not found in the list.
    }

    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    
    public Patient[] toArray() { // Convert the linked list to an array .
        int count = 0;
        Node cur = head;

        while ( cur != null) {
            count++;
            cur = cur.next;
        }

        Patient[] arr = new Patient[count];
        cur = head;
        int i = 0;

        while (cur != null) {
            arr[i++] = cur.data;
            cur = cur.next;
        }
        return arr;
    }
}
