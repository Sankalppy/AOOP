package PACKAGe;

public class MessagingApp {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(10); // Bounded buffer of capacity 10

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Messaging application finished.");
    }
}
