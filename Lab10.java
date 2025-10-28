
package Lab10.pkg10;
import java.util.LinkedList;
import java.util.Queue;
public class Lab10 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        enqueue(queue, 10);
        enqueue(queue, 20);
        enqueue(queue, 30);
        enqueue(queue, 40);
        enqueue(queue, 50);
        enqueue(queue, 60);

        display(queue);

        System.out.println("Front element: " + peek(queue));

        System.out.println("Dequeued: " + dequeue(queue));
        System.out.println("Dequeued: " + dequeue(queue));

        display(queue);

        System.out.println("Is queue empty? " + isEmpty(queue));
        System.out.println("Current size of the queue: " + size(queue));
        dequeue(queue);
        dequeue(queue);
        System.out.println("Dequeued: " + dequeue(queue)); 
    }
    public static void enqueue(Queue<Integer> queue, int value) {
        queue.offer(value);
        System.out.println("Enqueued " + value);
    }
    public static Integer dequeue(Queue<Integer> queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        } else {
            return queue.poll(); 
        }
    }
    public static Integer peek(Queue<Integer> queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is empty. Cannot peek.");
            return null; 
        } else {
            return queue.peek(); 
        }
    }
    public static boolean isEmpty(Queue<Integer> queue) {
        return queue.isEmpty();
    }
    public static int size(Queue<Integer> queue) {
        return queue.size();
    }
    public static void display(Queue<Integer> queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: " + queue);
            System.out.println();
        }
    }
}
