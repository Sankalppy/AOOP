package PACKAGe;

public class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                String message = "Message " + i;
                buffer.produce(message);
                Thread.sleep(100); // Simulate time taken to produce a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
