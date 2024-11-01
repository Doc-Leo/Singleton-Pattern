public class QueueSystem {
    private static QueueSystem instance;
    private int currentQueueNumber = 0;
    private QueueSystem() {}
    public static QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public int getNextNumber() {
        return ++currentQueueNumber;
    }
    public void resetQueueNumber(int newNumber) {
        if (newNumber > currentQueueNumber) {
            currentQueueNumber = newNumber;
        } else {
            throw new IllegalArgumentException("New number must be greater than the current queue number.");
        }
    }
    public int getCurrentQueueNumber() {
        return currentQueueNumber;
    }
}
