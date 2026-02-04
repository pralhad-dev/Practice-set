package lecture19;

public class stack {
    private int arr[];
    int top =-1;

    public stack(int size) {
        this.arr = new int[size];
    }

    public stack() {
       this.arr = new int[5];
    }
    //o(1)
    public boolean isEmpty() {
        return top==-1;
    }
    //o(1)
    public boolean isFull() {
        return  top == arr.length-1;
    }
    public void push(int item) throws Exception {
        if (isFull()){
            throw new Exception("Stack is full");
        }
        top++;
        arr[top] = item;

    }

    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack is aready empty");
        }
        int temp = arr[top];
        arr[top]=0;
        top--;
        return temp;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr[top];
    }

    public void display(){
        for (int i = top; i>=0;i--){
            System.out.println(arr[i] + " ");
        }
    }
}
