public class HelpDeskStation {
    private final QueueSystem queueSystem;
    public HelpDeskStation() {
        this.queueSystem = QueueSystem.getInstance();
    }
    public int serveNextCustomer() {
        return queueSystem.getNextNumber();
    }
    public void resetQueue(int newNumber) {
        queueSystem.resetQueueNumber(newNumber);
    }
}
