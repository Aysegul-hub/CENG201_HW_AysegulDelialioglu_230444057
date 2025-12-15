package HW1_Task2;

public class Task2Test {

    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue(); //Created a treatment queue.

        //8 treatment requests
        for ( int i = 1 ; i <= 8 ; i++) { // Patient IDs from 1 to 8
            queue.enqueue(new TreatmentRequest(i));

        }

        System.out.println("Initial queue: ");
        queue.printQueue();


        //Process 3 requests
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        

        System.out.println("\nQueue after processing 3 requests: ");
        queue.printQueue();
    }
    
}
