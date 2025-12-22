

public class TreatmentQueue {

    private class Node { //This is a private inner class representing a node in the linked list.
        TreatmentRequest data;
        Node next;

        Node(TreatmentRequest data) { //Parameterized constructor.
            this.data = data ;
            this.next = null; // Always be null in first
        }
    }

    private Node front; // Points to the front of the queue.
    private Node rear; //Points to the rear of the queue.
    private int size; 

    public TreatmentQueue() { //Initialize an empty queue.
        front = null; 
        rear = null;
        size = 0;

    }

    //Enqueue (adding the last)
    public void enqueue(TreatmentRequest request) {
        Node newNode = new Node(request);

        if(rear == null) { //If the queue is empty
            front = newNode;
            rear = newNode;

        }
        else { // Queue is not empty
            rear.next = newNode;
            rear = newNode;

        }
        size++; // The size will be increased by 1 after adding a new request.
    }

    //Dequeue ( removing the first)

    public TreatmentRequest dequeue() {
        if ( front == null) { //Empty
            return null;

        }
        TreatmentRequest removedRequest = front.data; //Store the data of the front node to return when removed.
        front = front.next;

        if ( front == null) {
            rear = null;
        }
        size--;
        return removedRequest;

    }

    public int size() { // Return the size of the queue.
        return size;
    }

    public void printQueue() {
        Node current = front;

        while (current != null ) { // Traverse through the queue.
            System.out.println(current.data);
            current = current.next;

        }
    }

    public boolean isEmpty() {
        return front == null;
    }

}
