import java.time.LocalDate;

public class Admin extends User {

    public Admin(){
        super();
    }
    public Admin(String name, int year, int month, int date){
        super(name, year, month, date);
    }

    @Override
    public String getBirthdayGreeting() {
        String greeting = super.getBirthdayGreeting();
        if (isBirthday()) {
            return greeting + " You are " + getAge() + " years old!";
        }
        return greeting;
    }

    public int getAge() {
        return LocalDate.now().getYear() - dob.getYear();
    }
}
