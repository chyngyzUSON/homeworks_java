import java.time.LocalDate;

public class Group {
    String[] students;
    String[] courses;
    LocalDate dateStarted;
    int duration;


    //  Constructor
    public Group(String[] students, String[] courses, LocalDate dateStarted, int duration) {
        this.students = students;
        this.courses = courses;
        this.dateStarted = dateStarted;
        this.duration = duration;
    }


    //  Setter
    public void setStudents(String[] students) {
        this.students = students;
    }
    public void  setCourses(String[] courses) {
        this.courses = courses;
    }
    public void setDateStarted(LocalDate dateStarted) {
        this.dateStarted = dateStarted;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }


    //  Getter
    public String[] getStudents() {
        return students;
    }
    public String[] getCourses() {
        return courses;
    }
    public LocalDate getDateStarted() {
        return dateStarted;
    }
    public int getDuration() {
        return duration;
    }
}
