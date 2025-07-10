package StacksAndQueues.Learning;

public class QueueUsingArray {
    int[] queue;
    int start;
    int end;
    int size;
    int count;

    public QueueUsingArray(int size) {
        queue = new int[size];
        this.size = size;
        this.start = 0;
        this.end = 0;
    }

    private boolean isEmpty() {
        return start == end;
    }

    private boolean isFull() {
        return end == size;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            queue[end] = element;
            end++;
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int dequeued = queue[start];
            queue[start] = -1;
            start++;
            return dequeued;
        } else {
            return -1;
        }
    }

    public int top() {
        if (!isEmpty()) {
            return queue[start];
        } else {
            return -1;
        }
    }

    public int size() {
        return end - start;
    }
    
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);

        System.out.println("Enqueuing 1, 2, 3");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Top element: " + queue.top()); // Should be 1
        System.out.println("Current size: " + queue.size()); // Should be 3
        System.out.println("Dequeued: " + queue.dequeue()); // Should be 1
        System.out.println("Top element: " + queue.top()); // Should be 2
        System.out.println("Current size: " + queue.size()); // Should be 2

        System.out.println("Enqueuing 4, 5, 6");
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6); // This won't be added since size is 5 (fixed array)

        // Dequeue all remaining
        System.out.println("Dequeuing all:");
        while (queue.size() > 0) {
            System.out.println(queue.dequeue());
        }

        // Try to dequeue from empty queue
        System.out.println("Dequeuing from empty queue: " + queue.dequeue()); // Should be -1
    }
}
