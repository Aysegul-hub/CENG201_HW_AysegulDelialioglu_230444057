
public class TreatmentQueue {
    private class Node {
        TreatmentRequest data; // data
        Node next; // next

        Node(TreatmentRequest data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // front
    private Node rear; // rear
    private int size; // size

    public TreatmentQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(TreatmentRequest request) {
        Node newNode = new Node(request); // new node
        if(rear == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public TreatmentRequest dequeue() {
        if ( front == null) {
            return null;
        }
        TreatmentRequest removedRequest = front.data;
        front = front.next;
        if ( front == null) {
            rear = null;
        }
        size--;
        return removedRequest;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }
}