public class main {
    public static void main(String[] args) {
        
        Notifier emailNotifyer = new EmailNotifyer();
        Notifier smsDecorator = new SMSDecorator(emailNotifyer);
        Notifier badgeIconCounter = new BadgeIconCounter(smsDecorator);
        badgeIconCounter.send("John Doe");
        
        
    }
}
