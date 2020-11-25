import java.time.LocalDate;

public class Student {
    String dateOfBirth;
    String lastStudentName;
    String studentName;
    String gender;
    int age;


    //  Constructor
    public Student() {}
    public Student(String dateOfBirth, String lastStudentName, String studentName, String gender, int age) {
        this.dateOfBirth = dateOfBirth;
        this.lastStudentName = lastStudentName;
        this.studentName = studentName;
        this.gender = gender;
        setAge(age);
    }

    //  Setter
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setLastStudentName(String lastStudentName) {
        this.lastStudentName = lastStudentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }

    }

    //  Getter
    public  String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getLastStudentName() {
        return lastStudentName;
    }
    public  String getStudentName() {
        return studentName;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
}
