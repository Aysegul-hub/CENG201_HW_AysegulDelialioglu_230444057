// DischargeStack class
public class DischargeStack {
    private class Node {
        DischargeRecord data; // record
        Node next; // next

        Node (DischargeRecord data) {
            this.data = data; // set
            this.next = null; // init
        }
    }

    private Node top; // top

    public DischargeStack() {
        top = null; // init
    }

    public void push(DischargeRecord dr) {
        Node nd = new Node(dr); // create
        nd.next = top; // link
        top = nd; // update
    }

    public DischargeRecord pop() {
        if ( top == null) {
            System.out.println("Stack is empty , the popping operation can not be performed."); // error
            return null; // return
        }
        DischargeRecord removed = top.data; // get
        top = top.next; // move
        return removed; // return
    }

    public DischargeRecord peek() {
        if ( top == null) {
            System.out.println("The stack is empty, there is no element to peek."); // error
            return null; // return
        }
        return top.data; // return
    }

    public void printStack() {
        if (top == null) {
            System.out.println("Discharge stack is empty."); // message
            return; // return
        }
        Node curr = top; // start
        while (curr != null) {
            System.out.println(curr.data); // print
            curr = curr.next; // next
        }
    }
}
