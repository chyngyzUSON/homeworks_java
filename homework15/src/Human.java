import java.time.LocalDate;

public class Human {
    String name;
    String lastName;
    String patronymic;
    int yearOfBirth;
    String hobby;
    String gender;

    // Constructor
    public Human() {

    }
    public Human(String name, String lastName, String patronymic, int yearOfBirth, String hobby, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.hobby = hobby;
        this.gender = gender;
    }
    public Human(String name, String lastName, String patronymic, int yearOfBirth, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    //  Setters and Getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public  String getLastName() {
        return lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getHobby() {
        return hobby;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    //  Function
    public void info() {
        int yearOfBirth = 1992;
        int currentyear = LocalDate.now().getYear();
        if(hobby != null || patronymic != null) {
            System.out.println("My name is " + name + " " + lastName + "" + patronymic + ", I am " + (currentyear - yearOfBirth) + " years old, my hobby is " + hobby + " and I am a " + gender + ".");
        } else {
            System.out.println("My name is " + name + " " + lastName + ", I am " + (currentyear - yearOfBirth) + " years old, and I am a " + gender + ".");
        }
    }

}