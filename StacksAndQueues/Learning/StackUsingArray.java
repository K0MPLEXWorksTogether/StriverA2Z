package StacksAndQueues.Learning;

public class StackUsingArray {
    int[] stack;
    int top;
    int size;

    public StackUsingArray(int size) {
        stack = new int[size];
        this.size = size;
        top = 0;
    }

    private boolean isEmpty() {
        return top == 0;
    }

    private boolean isFull() {
        return top == size;
    }

    public void push(int element) throws Exception {
        try {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            } else {
                stack[top] = element;
                top++;
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }
    
    public void pop() throws Exception{
        try {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return;
            }

            stack[top] = 0;
            top--;
        } catch (Exception err) {
            System.out.println(err);
        }
    }
    
    public int top() throws Exception {
        try {
            if (isEmpty()) {
                System.out.println("Stack Is Empty");
                return -1;
            }

            return stack[top];
        } catch (Exception err) {
            System.out.println(err);
            return -1;
        }
    }
    
    public int size() throws Exception {
        try {
            return size - top + 1;
        } catch (Exception e) {
            System.err.println(e);
            return -1;
        }
    }
}
