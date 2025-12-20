package HW1_Task3;

public class Task3Test {  // We should access fastly the last discharge patient so we use stack.
    public static void main(String[] args) {

        DischargeStack stack = new DischargeStack();
        stack.push(new DischargeRecord(001));
        stack.push(new DischargeRecord(002));
        stack.push(new DischargeRecord(003));
        stack.push(new DischargeRecord(004));
        stack.push(new DischargeRecord(005));

        stack.pop(); // remove last (LIFO) so 005 will be removed first.
        stack.pop(); // remove 004

        stack.printStack();

        // If we use the queue structure here we will access slowly the last discharge patient because queue structure support FIFO structure so if the element attached first it will be removed first.

}
}