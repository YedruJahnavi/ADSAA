public class Stack {

    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = arr[top];
        top--;
        return x;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped element is " + stack.pop());
        System.out.println("Top element is " + stack.peek());

        stack.push(4);
        stack.push(5);

        System.out.println("Popped element is " + stack.pop());

        System.out.println("Top element is " + stack.peek());
    }
}



    
