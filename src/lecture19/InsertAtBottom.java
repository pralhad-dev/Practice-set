package lecture19;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Before Insertion: " + stack);
        insertAtBottom(stack,60);
        System.out.println("After Insertion: "+stack);
    }

    private static void insertAtBottom(Stack<Integer> stack, int value) {
        Stack<Integer> extra = new Stack<>();

        while (!stack.isEmpty()){
            extra.push(stack.pop()); //[10,20,30,40] - [40,30,20,10]
        }

        stack.push(value); //[60]

        while (!extra.isEmpty()){
            stack.push(extra.pop()); //[60,10,20,30,40]
        }

    }
}
