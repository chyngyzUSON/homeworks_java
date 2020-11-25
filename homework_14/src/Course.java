import java.time.LocalDate;

public class Course {
    String nameIsCourse;
    LocalDate date;
    String ID;
    String fullNameTeacher;

    //  Constructor
    public Course(String nameIsCourse, LocalDate date, String ID, String fullNameTeacher) {
        this.nameIsCourse = nameIsCourse;
        this.date = date;
        this.ID = ID;
        this.fullNameTeacher = fullNameTeacher;
    }


    //  Setter
    public void setNameIsCourse(String nameIsCourse) {
        this.nameIsCourse = nameIsCourse;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setFullNameTeacher(String fullNameTeacher) {
        this.fullNameTeacher = fullNameTeacher;
    }


    //  Getter
    public String getNameIsCourse() {
        return nameIsCourse;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getID() {
        return ID;
    }
    public String getFullNameTeacher() {
        return fullNameTeacher;
    }
}
