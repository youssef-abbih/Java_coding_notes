public class Main {

    public static void main(String[] args) {
        EmailApplication emailApp = new EmailApplication("John", "Doe", "Sales");
        emailApp.setAlternateEmail("john.doe@example.com");
        emailApp.setMailboxCapacity(500);

        System.out.println(emailApp);
        System.out.println("Alternate Email: " + emailApp.getAlternateEmail());
        System.out.println("Mailbox Capacity: " + emailApp.getMailboxCapacity() + " MB");

        //emailApp.setPassword(emailApp.randomPassword(10));
        System.out.println("New Password: " + emailApp.getPassword());
    }
}
