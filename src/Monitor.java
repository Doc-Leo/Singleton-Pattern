public class Monitor {
    private final QueueSystem queueSystem;

    public Monitor() {
        this.queueSystem = QueueSystem.getInstance();
    }

    public void displayCurrentQueue() {
        System.out.println("Current Queue Number: " + queueSystem.getCurrentQueueNumber());
    }
}
