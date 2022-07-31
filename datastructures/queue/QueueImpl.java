/*
In a FIFO data structure, the first element added to the queue will be processed first.

As shown in the picture above, the queue is a typical FIFO data stucture.
The insert operation is also called enqueue and the new element is always added at the end of the queue.
The delete operation is called dequeue. You are only allowed to remove the first element
 */
package queue;

import java.util.ArrayList;
import java.util.List;

public class QueueImpl {
    private List<Integer> data;
    public QueueImpl() {
        data = new ArrayList<Integer>();

    }
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        data.remove(0);
        return true;
    }

    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    ;

    public int Front() {
        return data.get(0);
    }

    public boolean isEmpty() {
        if (data.size() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }
}