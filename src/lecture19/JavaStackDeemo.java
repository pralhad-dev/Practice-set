package lecture19;

import java.util.Stack;

public class JavaStackDeemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        stack.pop();

        System.out.println(stack);
        stack.peek();
        System.out.println(stack);

        //create one function insert at bottom
        //1 exrtra space insert 60 at bottom
    }
}
