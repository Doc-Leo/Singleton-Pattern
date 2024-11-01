public class Main {
    public static void main(String[] args) {

        HelpDeskStation station1 = new HelpDeskStation();
        HelpDeskStation station2 = new HelpDeskStation();
        HelpDeskStation station3 = new HelpDeskStation();


        Monitor monitor = new Monitor();


        System.out.println("Serving customers...");
        System.out.println("Station 1 served customer number: " + station1.serveNextCustomer());
        System.out.println("Station 2 served customer number: " + station2.serveNextCustomer());
        System.out.println("Station 3 served customer number: " + station3.serveNextCustomer());

        monitor.displayCurrentQueue();
        System.out.println("Resetting queue number...");
        station1.resetQueue(5);
        monitor.displayCurrentQueue();


        System.out.println("Station 1 served customer number: " + station1.serveNextCustomer());
        monitor.displayCurrentQueue();
    }
}
