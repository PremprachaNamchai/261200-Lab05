//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User john = new User("John", 1954, 2, 18);
        john.displayInfo();

        Admin nicolas = new Admin("Nicolas", 1964, 7, 30);
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        nicolas.displayHappyBirthday();
    }
}