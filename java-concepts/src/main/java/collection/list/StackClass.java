package collection.list;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.push(40);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.search(40));    // It returns the object location from the top of the stack.
                                                    // The topmost object of the stack is considered at distance 1.
                                                    // If it returns -1, it means that the object is not on the stack.
    }
}
