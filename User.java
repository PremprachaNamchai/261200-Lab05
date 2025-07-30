import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }
    public User(String name, int year, int month, int date){
        this.name = name;
        this.dob = LocalDate.of(year, month, date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Date of birth: "+dob);
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getDayOfMonth() == dob.getDayOfMonth() && today.getMonth() == dob.getMonth();
    }

    public void displayHappyBirthday() {
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name);
        }
    }
}
