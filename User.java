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

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getDayOfMonth() == dob.getDayOfMonth() && today.getMonthValue() == dob.getMonthValue();
    }

    public String getBirthdayGreeting() {
        if (isBirthday()) {
            return "Happy birthday " + this.name + "!";
        }
        return "It is not " + this.name + "'s birthday today.";
    }
}
