public class EmailNotifyer implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending email to " + message);
    }
}
