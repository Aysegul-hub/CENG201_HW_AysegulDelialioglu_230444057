
// DischargeStack class
public class DischargeStack {
    private class Node {
        DischargeRecord data; // record data
        Node next; // next node

        Node (DischargeRecord data) {
            this.data = data; // set data
            this.next = null; // init next
        }
    }

    private Node top; // top of stack

    public DischargeStack() {
        top = null; // init top
    }

    public void push(DischargeRecord dr) {
        Node nd = new Node(dr); // create node
        nd.next = top; // link to top
        top = nd; // update top
    }

    public DischargeRecord pop() {
        if ( top == null) {
            System.out.println("Stack is empty , the popping operation can not be performed."); // error message
            return null; // return null
        }
        DischargeRecord removed = top.data; // get data
        top = top.next; // move top
        return removed; // return
    }

    public DischargeRecord peek() {
        if ( top == null) {
            System.out.println("The stack is empty, there is no element to peek."); // error
            return null; // return null
        }
        return top.data; // return top
    }

    public void printStack() {
        if (top == null) {
            System.out.println("Discharge stack is empty."); // empty message
            return; // return
        }
        Node curr = top; // start from top
        while (curr != null) {
            System.out.println(curr.data); // print
            curr = curr.next; // next node
        }
    }
}
