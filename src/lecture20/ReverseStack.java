package lecture20;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        reverseStack(stack);
        System.out.println(stack);
    }

    private static void reverseStack(Stack<Integer> stack) {

        if (stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom1(stack,top);
    }

    private static void insertAtBottom1(Stack<Integer> stack, int value) {

        if (stack.isEmpty()){
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertAtBottom1(stack,value);
        stack.push(top);
    }

}
