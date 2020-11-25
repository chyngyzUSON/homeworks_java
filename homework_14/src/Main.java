import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
    //  TASK A

    //  Fish
        Fish fish1 = new Fish("Amfi", "fish", -1);
            String fish1Name = fish1.getName();
            String fish1AnimalClass = fish1.getAnimalClass();
            int fish1Age = fish1.getAge();
        System.out.println("Fish name: " + fish1Name + ", " + fish1AnimalClass + ", and age: " + fish1Age);

        Fish fish2 = new Fish("Bob", "fish", 6);
            String fish2Name = fish2.getName();
            String fish2AnimalClass = fish1.getAnimalClass();
            int fish2Age = fish2.getAge();
        System.out.println("Fish name: " + fish2Name + ", " + fish2AnimalClass + ", and age: " + fish2Age + "\n");

    //  Dog
        Dog dog1 = new Dog("Balto", "mammal", 2);
            String dog1Name = dog1.getName();
            String dog1AnimalClass = dog1.getAnimalClass();
            int dog1Age = dog1.getAge();
        System.out.println("Dog name: " + dog1Name + ", " + dog1AnimalClass + ", and age: " + dog1Age);

        Dog dog2 = new Dog("Kireshe", "mammal", 5);
            String dog2Name = dog2.getName();
            String dog2AnimalClass = dog2.getAnimalClass();
            int dog2Age = dog2.getAge();
        System.out.println("Dog name: " + dog2Name + ", " + dog2AnimalClass + ", and age: " + dog2Age + "\n");

    //  Parrot
        Parrot parr = new Parrot("Bulbul", "bird", 2);
            String parrName = parr.getName();
            String parrAnimalClass = parr.getAnimalClass();
            int parrAge = parr.getAge();
        System.out.println("Parrot name: " + parrName + ", " + parrAnimalClass + ", and age: " + parrAge);

        Parrot parr2 = new Parrot("Sairagul", "bird", 4);
            String parr2Name = parr2.getName();
            String parr2AnimalClass = parr2.getAnimalClass();
            int parr2Age = parr2.getAge();
        System.out.println("Parrot name: " + parr2Name + ", " + parr2AnimalClass + ", and age: " + parr2Age + "\n");

	//  Cat
        Cat barsik = new Cat("barsik", "mammal", 3);
            String barsikName = barsik.getName();
            String barsikAnimalClass = barsik.getAnimalClass();
            int barsikAge = barsik.getAge();
        System.out.println("Cat name: " + barsikName + ", " + barsikAnimalClass + ", and age: " + barsikAge);

        Cat mashka = new Cat("mashka", "mammal", 2);
            String mashkaName = mashka.getName();
            String mashkaAnimalClass = mashka.getAnimalClass();
            int mashkaAge = mashka.getAge();
        System.out.println("Cat name: " + mashkaName + ", " + mashkaAnimalClass + ", and age: " + mashkaAge + "\n");

    //  TASK B

        //LocalDate date = LocalDate.of(2015, 1, 13);

        Course java = new Course("Java", "2020,09,01","JV-F20", "Askhat Serikov");
            String javaNameIsCourse = java.getNameIsCourse();
            String javaDate = java.getDate();//LocalDate salam = LocalDate.of(2017, 1, 13);
            String javaID = java.getID();
            String javaFullNameTeacher = java.getFullNameTeacher();
        System.out.println("Course titles: " + javaNameIsCourse + ";\n" +
                    "Date of course creation: " + javaDate + ";\n" +
                    "Course ID: " + javaID + ";\n" +
                    "Name of the teacher: " + javaFullNameTeacher + ";\n");

        Course frontEnd = new Course("FrontEnd","2020,09,01", "FE-F20", "Polina");
            String frontEndNameIsCourse = frontEnd.getNameIsCourse();
            String frontEndDate = frontEnd.getDate();
            String frontEndID = frontEnd.getID();
            String frontEndFullNameTeacher = frontEnd.getFullNameTeacher();
        System.out.println("Course titles: " + frontEndNameIsCourse + ";\n" +
                    "Date of course creation: " + frontEndDate + ";\n" +
                    "Course ID: " + frontEndID + ";\n" +
                    "Name of the teacher: " + frontEndFullNameTeacher + ";\n");

        Student first = new Student("1992,02,28", "Usonuulu", "Chyngyz", "man", 28);
        Student second = new Student("1994,04,02", "Usonuulu", "Elgiz", "man", 26);

        Student[] students = new Student[2];
//        Student[] students1 = {first, second};
        students[0] = first;
        students[1] = second;

        Group jv = new Group(students, courses, "2020,09,01", 1);
        Group fe = new Group(students, courses, "2020,09,01", 1);

        Course[] courses = new Course[2];
        courses[0] = jv;
        courses[1] = fe;

        Group group = new Group(students, courses, "2020,09,01", 1);

            //String firstDateOfBirth = first.getDateOfBirth();
            String firstLastStudentName = first.getLastStudentName();
            String firstStudentName = first.getStudentName();
            String firstGender = first.getGender();
            int firstAge = first.getAge();
        for (int i = 0; i < group.getStudents().length; i++) {
            System.out.println(group.getStudents()[i].getStudentName());
        }
        for (int i = 0; i < group.getCourses().length; i++) {
            System.out.println(group.getCourses()[i].getNameIsCourse());
        }
        System.out.println(/*"DateOfBirth: " + first.getDateOfBirth() + ";\n" +
                    "LastStudentName: " + first.getLastStudentName() + ";\n" +*/
                    "StudentName: " + first.getStudentName() + ";\n" +
                    "Gender: " + first.getGender() + ";\n" +
                    "Age: " + first.getAge() + ";\n");


//            String secondDateOfBirth = second.getDateOfBirth();
//            String secondLastStudentName = second.getLastStudentName();
//            String secondStudentName = second.getStudentName();
//            String secondGender = second.getGender();
//            int secondAge = second.getAge();
//        System.out.println("DateOfBirth: " + secondDateOfBirth + ";\n" +
//                    "LastStudentName: " + secondLastStudentName + ";\n" +
//                    "StudentName: " + secondStudentName + ";\n" +
//                    "Gender: " + secondGender + ";\n" +
//                    "Age: " + secondAge + ";\n");

//        Group jv = new Group(students, group.courses, "2020,09,01", 1);
//        Group fe = new Group(students, group.courses, "2020,09,01", 1);
//
//        Course[] courses = new Course[2];
//        courses[0] = jv;
//        courses[1] = fe;
//            Student[] jvStudents = jv.getStudents();
//            Course[] jvCourses = jv.getCourses();
//            String jvDateStarted = jv.getDateStarted();
//            int jvDuration = jv.getDuration();
//        System.out.println("Students: " + jvStudents + ";\n" +
//                    "Courses: " + jvCourses + ";\n" +
//                    "DateStarted: " + jvDateStarted + ";\n" +
//                    "Duration: " + jvDuration + ";\n");


//        Student[] feStudents = fe.getStudents();
//        Course[] feCourses = fe.getCourses();
//        String feDateStarted = fe.getDateStarted();
//        int feDuration = fe.getDuration();
//        System.out.println("Students: " + feStudents + ";\n" +
//                "Courses: " + feCourses + ";\n" +
//                "DateStarted: " + feDateStarted + ";\n" +
//                "Duration: " + feDuration + ";\n");
    }
}
