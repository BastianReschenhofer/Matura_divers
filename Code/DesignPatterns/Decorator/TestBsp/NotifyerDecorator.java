public abstract class NotifyerDecorator implements Notifier {

    protected Notifier notifier;

    public NotifyerDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }

    //oder send abstrakt lassen und in den konkreten Decorators erweitern

}
