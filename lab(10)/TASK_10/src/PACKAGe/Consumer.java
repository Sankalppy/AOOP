package PACKAGe;

public class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                buffer.consume();
                Thread.sleep(150); // Simulate time taken to consume a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
