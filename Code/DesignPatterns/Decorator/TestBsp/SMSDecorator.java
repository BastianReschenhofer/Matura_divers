public class SMSDecorator extends NotifyerDecorator {

    public SMSDecorator(Notifier notifier) {
        super(notifier);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS to " + message);
    }
    
}
