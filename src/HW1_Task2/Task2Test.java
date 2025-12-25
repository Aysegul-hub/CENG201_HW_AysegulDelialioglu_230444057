
// Test class
public class Task2Test {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue();

        for ( int i = 1 ; i <= 8 ; i++) {
            boolean priority = (i % 3 == 0 ); // every third patient gets priority
            queue.enqueue(new TreatmentRequest(i,priority));
        }

        System.out.println("Initial queue: ");
        queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("\nQueue after processing 3 requests: ");
        queue.printQueue();
    }
}
