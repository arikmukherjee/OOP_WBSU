class Stack {
    int top;
    int maxSize;
    int arr[];

    // Constructor
    Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    // Method 1: Push
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Method 2: Pop
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top] + " popped from stack");
            top--;
        }
    }

    // Method 3: Peek
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + arr[top]);
        }
    }

    // Method 4: Display
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

// Main Class
public class StackImplementation {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();
        s.display();
    }
}