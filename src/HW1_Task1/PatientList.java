public class PatientList {
    class Node {
        Patient data; // patient data
        Node next; // next node

        Node(Patient data) {
            this.data = data; // set data
        }
    }

    Node head; // head of list
   
    public void addPatient(Patient p) {
        Node n = new Node(p); // create node
        n.next = head; // link to head
        head = n; // update head
    }

    public void removePatientById( int id) {
        if(head == null) {
            return; // empty list
        }

        if(head.data.id == id) {
            head = head.next; // remove head
            return;
        }

        Node cur = head; // current node
        while ( cur.next != null) {
            if ( cur.next.data.id == id) {
                cur.next = cur.next.next; // remove node
                return;
            }
            cur = cur.next; // move next
        }
    }
    public void removePatient(int id) {
        removePatientById(id); // call remove
    }
    
    public Patient findPatientList(int id) {
        Node cur = head; // start from head
        while ( cur != null) {
            if ( cur.data.id == id){
                return cur.data; // found
            }
            cur = cur.next; // next node
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
        while (cur != null) {
            count++; // increment
            cur = cur.next;
        }
        Patient[] arr = new Patient[count]; // create array
        cur = head;
        int i = 0;
        while ( cur != null) {
            arr[i++] = cur.data; // fill array
            cur = cur.next;
        }
        return arr; // return
    }
}

