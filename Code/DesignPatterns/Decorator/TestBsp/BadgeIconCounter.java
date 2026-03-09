public class BadgeIconCounter extends NotifyerDecorator {

    public BadgeIconCounter(Notifier notifier) {
        super(notifier);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Adding badge icon to " + message);
    }
    
}
