import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        User user = new User("John", today.getYear() - 1, today.getMonthValue(), today.getDayOfMonth());
        Admin admin = new Admin("Nicolas", today.getYear() - 1, today.getMonthValue(), today.getDayOfMonth());

        System.out.println(user.getBirthdayGreeting());
        System.out.println(admin.getBirthdayGreeting());
    }
}
