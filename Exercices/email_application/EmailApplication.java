import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EmailApplication {
    private static final ArrayList<String> DEPARTMENTS = new ArrayList<>(
            Arrays.asList("Sales", "Development", "Accounting"));
    private final String firstName;
    private final String lastName;
    private final String department;
    private final String email;
    private String password;
    private String alternateEmail;
    private int mailboxCapacity;
    private final int defaultPasswordLength = 12;
    private final String companySuffix = ".company.com";

    public EmailApplication(String firstName, String lastName, String department) {
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName.toLowerCase();

        if (isValidDepartment(department)) {
            this.department = department.toLowerCase();
            this.email = this.firstName + "." + this.lastName + "@" + this.department + this.companySuffix;
        } else {
            this.department = "";
            this.email = this.firstName + "." + this.lastName + "@company.com";
        }
        this.password = randomPassword(defaultPasswordLength);
    }

    private boolean isValidDepartment(String department) {
        return DEPARTMENTS.contains(department);
    }

    private static char selectAChar(String s) {
        Random random = new Random();
        int index = random.nextInt(s.length());
        return s.charAt(index);
    }

    private String randomPassword(int length) {
        String chars = "AZERTYUIOPQSDFGHJKLMWXCVBNaqwzsxedcrfvtgbyhnujikolpm123456789+-*/&^?;.,";
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            passwordBuilder.append(selectAChar(chars));
        }

        return passwordBuilder.toString();
    }

    @Override
    public String toString() {
        return String.format(
                "Email created for user: %s %s%nYour email is: %s%nYour temporary password is: %s",
                getFirstName(), getLastName(), this.email, this.password);
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
