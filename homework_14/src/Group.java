import java.time.LocalDate;
import java.time.LocalDateTime;

public class Group {
    Student[] students;
    Course[] courses;
    String dateStarted;
    int duration;


    //  Constructor
    public Group() {}
    public Group(Student[] students, Course[] courses, String dateStarted, int duration) {
        this.students = students;
        this.courses = courses;
        this.dateStarted = dateStarted;
        this.duration = duration;
    }

    //  Setter
    public void setStudents(Student[] students) {
        this.students = students;
    }
//    public void setCourses(Course[] courses) {
//        this.courses = courses;
//    }
    public void setDateStarted(String dateStarted) {
        this.dateStarted = dateStarted;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //  Getter
    public Student[] getStudents() {
        return students;
    }
    public Course[] getCourses() {
        return courses;
    }
    public String getDateStarted() {
        return dateStarted;
    }
    public int getDuration() {
        return duration;
    }
}
