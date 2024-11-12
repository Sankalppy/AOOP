package PACKAGe;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private Queue<String> buffer;
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }

    public synchronized void produce(String message) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait until there's space in the buffer
        }
        buffer.add(message);
        System.out.println("Produced: " + message);
        notifyAll(); // Notify consumers that there's a new message
    }

    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait until there's a message to consume
        }
        String message = buffer.poll();
        System.out.println("Consumed: " + message);
        notifyAll(); // Notify producers that there's space in the buffer
        return message;
    }
}
