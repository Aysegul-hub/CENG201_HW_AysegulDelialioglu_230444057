

public class DischargeStack { // This class implement stack to keep discharge records.
    // push = add the top , O(1)
    //pop = remove from the pop , O(1)
    // peek = look at the top of the stack without removing it just looking , O(1)

    private class Node {
        DischargeRecord data ;
        Node next;

        Node (DischargeRecord data) {
            this.data = data;
            this.next = null; // When a new node is created next will be null. Because there is no next node yet just created.

        }


    }

    private Node top; // Keep top of the stack.

    public DischargeStack() {
        top = null; // Initialize top of null when stack is created. Will be null because stack is empty when first created.

    }
    // Adding data to the top of the stack.
    public void push(DischargeRecord dr) {
        Node nd = new Node(dr);
        nd.next = top;
        top = nd;

    }

    // Removing data from the top of the stack.
    public DischargeRecord pop() {
        if ( top == null) {
            System.out.println("Stack is empty , the popping operation can not be performed.");
            return null;
        }
        DischargeRecord removed = top.data; // Remove the top element's data permanently.
        top = top.next; // The top will be the next element in the stack.
        return removed; // Return the removed element's data.


    }
    //Show the top of the stack without removing it.
    public DischargeRecord peek() {
        if ( top == null) {
            System.out.println("The stack is empty, there is no element to peek.");
            return null;
        }
        return top.data; // If top is not null print the top element's data.

    }

    //Now we print all elements in the stack.
    public void printStack() {
        if (top == null) {
            System.out.println("Discharge stack is empty.");
            return;

        }
        Node curr = top;
        while (curr != null) { // Dusk till we reach the end of the stack.
            System.out.println(curr.data); // Print current element's data
            curr = curr.next; // Move to the next element in the stack.
        }
    }
    
}
