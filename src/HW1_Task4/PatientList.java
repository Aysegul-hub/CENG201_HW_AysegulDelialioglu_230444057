// PatientList class
public class PatientList {
    class Node {
        Patient data; // patient data
        Node next; // next node

        Node(Patient data) {
            this.data = data; // set data
        }
    }

    Node head; // head node

    public void addPatient(Patient p) {
        Node n = new Node(p); // create node
        n.next = head; // link
        head = n; // update head
    }

    public void removePatientById( int id) {
        if(head == null) {
            return; // empty
        }

        if(head.data.id == id) {
            head = head.next; // remove head
            return;
        }

        Node cur = head; // current
        while ( cur.next != null ) {
            if ( cur.next.data.id == id) {
                cur.next = cur.next.next; // remove
                return;
            }
            cur = cur.next; // next
        }
    }

    public void removePatient(int id) {
        removePatientById(id); // call remove
    }

    public Patient findPatientList(int id) {
        Node cur = head; // start
        while ( cur != null) {
            if ( cur.data.id == id) {
                return cur.data; // found
            }
            cur = cur.next; // next
        }
        return null; // not found
    }

    public void printList() {
        Node cur = head; // current
        while (cur != null) {
            System.out.println(cur.data); // print
            cur = cur.next; // next
        }
    }

    public Patient[] toArray() {
        int count = 0; // counter
        Node cur = head;
        while ( cur != null) {
            count++; // increment
            cur = cur.next;
        }
        Patient[] arr = new Patient[count]; // create array
        cur = head;
        int i = 0;
        while (cur != null) {
            arr[i++] = cur.data; // fill
            cur = cur.next;
        }
        return arr; // return
    }
}
