
// Test class for Task 3
public class Task3Test {
    public static void main(String[] args) {
        DischargeStack stack = new DischargeStack(); // create stack
        stack.push(new DischargeRecord(001)); // push record
        stack.push(new DischargeRecord(002)); // push record
        stack.push(new DischargeRecord(003)); // push record
        stack.push(new DischargeRecord(004)); // push record
        stack.push(new DischargeRecord(005)); // push record

        stack.pop(); // pop first
        stack.pop(); // pop second

        stack.printStack(); // print stack
    }
}