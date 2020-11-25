public class Dog {
    String name;
    int age;
    String animalClass;

    //  constructor
    public Dog(String name, String animalClass, int age) {
        this.name = name;
        this.animalClass = animalClass;
        this.age = age;

    }


    // setter
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
    public void setName(String n){
        name = n;
    }
    public void setAnimalClass(String ac) {
        animalClass = ac;
    }


    // getter
    public String getName(){
        return name;
    }
    public String getAnimalClass() {
        return animalClass;
    }
    public int getAge(){
        return age;
    }
}
