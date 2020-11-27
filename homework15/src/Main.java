import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
    //  TASK A
        Human human = new Human("Chyngyz", "Usonuulu", "", 1992, "triathlon", "man");
        Human human1 = new Human("Elgiz", "Usonuulu", "", 1994, "Pubg", "man");
        Human human2 = new Human("Ernazar", "Usonuulu", "", 2002, "Pubg", "man");
        Human human3 = new Human("Gulnur", "Usonkyzy", "", 2004, "BTS", "woman");
        Human human4 = new Human("Uson", "Altybaev", "Jumabekovich", 1964, "dzudo", "man");
        Human human5 = new Human("Aigul", "Arykbaeva", "Kudashovna", 1971, "kurak", "woman");
        Human human6 = new Human("Altynbek", "Maratuulu", "", 1990, "football", "man");
        Human human7 = new Human("Jeenkul", "Altybaeva", "Asanbaevna", 1988, "kurak", "woman");
        Human human8 = new Human("Nazgul", "Asanbaikyzy", "", 1996, "kurak", "woman");
        Human human9 = new Human("Nursultan", "Asanbaiuulu", "", 1998, "volleyball", "man");

        Human[] humans = {human, human1, human2, human3, human4, human5, human6, human7, human8, human9,};

        for (Human individ : humans) {
            individ.info();
        }

    //  TASK C

    }
}
