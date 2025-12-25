// TreatmentQueue class
public class TreatmentQueue {
    private class Node {
        TreatmentRequest data; // request data
        Node next; // next node

        Node(TreatmentRequest data) {
            this.data = data; // set data
            this.next = null; // init next
        }
    }

    private Node front; // front node
    private Node rear; // rear node
    private int size; // size

    public TreatmentQueue() {
        front = null; // init
        rear = null; // init
        size = 0; // init
    }

    public void enqueue(TreatmentRequest request) {
        Node newNode = new Node(request); // create node
        if(rear == null) {
            front = newNode; // first
            rear = newNode; // first
        }
        else {
            rear.next = newNode; // link
            rear = newNode; // update
        }
        size++; // increment
    }

    public TreatmentRequest dequeue() {
        if ( front == null) {
            return null; // empty
        }
        TreatmentRequest removedRequest = front.data; // get data
        front = front.next; // move
        if ( front == null) {
            rear = null; // empty
        }
        size--; // decrement
        return removedRequest; // return
    }

    public int size() {
        return size; // return size
    }

    public void printQueue() {
        Node current = front; // start
        while (current != null) {
            System.out.println(current.data); // print
            current = current.next; // next
        }
    }

    public boolean isEmpty() {
        return front == null; // check
    }
}