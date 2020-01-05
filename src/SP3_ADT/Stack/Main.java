package SP3_ADT.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // A stack operates after the principle of first in first out.
        // A logic way of looking at it would be observing the stack as a stack of items: you remove from the top first
        // We take a look at some of the stacks methods

        // We initiate a stack
        Stack<Integer> stack1 = new Stack<>();

        // We check if the stack is empty
        System.out.println("The stack is empty: " + stack1.empty() + "\n");

        // We use push to populate our stack
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);

        // We check again if the stack is empty
        System.out.println("The stack is empty: " + stack1.empty() + "\n");

        // We use search to find where a object is starting from the top
        System.out.println("Object with value 40 is at " + stack1.search(40) + ". position \n");

        // We use peek to see the value on the top of the stack
        System.out.println("Object at the top of the stack has the value of: " + stack1.peek() + "\n");

        // We use pop to remove the top object
        System.out.println("We remove the top object wth the value of: " + stack1.pop()+ "\n");

        // We peek again to confirm the top object is gone
        System.out.println("Object at the top of the stack has the value of: " + stack1.peek() + "\n");

        // We use search again to see if "40" has moved
        System.out.println("Object with value 40 is at " + stack1.search(40) + ". position" + "\n");

        // Finally we print the stack
        System.out.println("The stack contains: " + stack1 );
    }
}
