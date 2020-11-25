import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
    //  TASK A

    //  Fish
        Fish fish1 = new Fish("Amfi", "fish", -1);
        String fish1Name = fish1.getName();
        String fish1AnimalClass = fish1.getAnimalClass();
        int fish1Age = fish1.getAge();
//        fish1.name = "Bob";
//        fish1.age = 3;
        System.out.println("Fish name: " + fish1Name + ", " + fish1AnimalClass + ", and age: " + fish1Age);

        Fish fish2 = new Fish("Bob", "fish", 6);
        String fish2Name = fish2.getName();
        String fish2AnimalClass = fish1.getAnimalClass();
        int fish2Age = fish2.getAge();
//        fish2.name = "Anfi";
//        fish2.age = 3;
        System.out.println("Fish name: " + fish2Name + ", " + fish2AnimalClass + ", and age: " + fish2Age + "\n");

    //  Dog
        Dog dog1 = new Dog("Balto", "mammal", 2);
        String dog1Name = dog1.getName();
        String dog1AnimalClass = dog1.getAnimalClass();
        int dog1Age = dog1.getAge();
//        dog1.name = "Laika";
//        dog1.age = 3;
        System.out.println("Dog name: " + dog1Name + ", " + dog1AnimalClass + ", and age: " + dog1Age);

        Dog dog2 = new Dog("Kireshe", "mammal", 5);
        String dog2Name = dog2.getName();
        String dog2AnimalClass = dog2.getAnimalClass();
        int dog2Age = dog2.getAge();
//        dog2.name = "Balto";
//        dog2.age = 2;
        System.out.println("Dog name: " + dog2Name + ", " + dog2AnimalClass + ", and age: " + dog2Age + "\n");

    //  Parrot
        Parrot parr = new Parrot("Bulbul", "bird", 2);
        String parrName = parr.getName();
        String parrAnimalClass = parr.getAnimalClass();
        int parrAge = parr.getAge();
//        parr.name = "Bulbul";
//        parr.age = 5;
        System.out.println("Parrot name: " + parrName + ", " + parrAnimalClass + ", and age: " + parrAge);

        Parrot parr2 = new Parrot("Sairagul", "bird", 4);
        String parr2Name = parr2.getName();
        String parr2AnimalClass = parr2.getAnimalClass();
        int parr2Age = parr2.getAge();
//        parr2.name = "Saira";
//        parr2.age = 4;
        System.out.println("Parrot name: " + parr2Name + ", " + parr2AnimalClass + ", and age: " + parr2Age + "\n");

	//  Cat
        Cat barsik = new Cat("barsik", "mammal", 3);
        String barsikName = barsik.getName();
        String barsikAnimalClass = barsik.getAnimalClass();
        int barsikAge = barsik.getAge();
//        barsik.age = 3;
        System.out.println("Cat name: " + barsikName + ", " + barsikAnimalClass + ", and age: " + barsikAge);

        Cat mashka = new Cat("mashka", "mammal", 2);
        String mashkaName = mashka.getName();
        String mashkaAnimalClass = mashka.getAnimalClass();
        int mashkaAge = mashka.getAge();
        System.out.println("Cat name: " + mashkaName + ", " + mashkaAnimalClass + ", and age: " + mashkaAge + "\n");

    //  TASK B

        Course java = new Course("Java",01.01.2020, "JV-F20", "Askhat Serikov");
            String javaNameIsCourse = java.getNameIsCourse();
            LocalDate javaDate = java.getDate();
            String javaID = java.getID();
            String javaFullNameTeacher = java.getFullNameTeacher();
            System.out.println("Course titles: " + javaNameIsCourse + ";\n" +
                                "Date of course creation: " + javaDate + ";\n" +
                                "Course ID: " + javaID + ";\n" +
                                "Name of the teacher: " + javaFullNameTeacher + ";\n");

        Course frontEnd = new Course("FrontEnd",01.01.2020, "FE-F20", "Polina");
            String frontEndNameIsCourse = frontEnd.getNameIsCourse();
            LocalDate frontEndDate = frontEnd.getDate();
            String frontEndID = frontEnd.getID();
            String frontEndFullNameTeacher = frontEnd.getFullNameTeacher();
            System.out.println("Course titles: " + frontEndNameIsCourse + ";\n" +
                    "Date of course creation: " + frontEndDate + ";\n" +
                    "Course ID: " + frontEndID + ";\n" +
                    "Name of the teacher: " + frontEndFullNameTeacher + ";\n");

        Student first = new Student();
            LocalDate firstDateOfBirth = first
    }
}
