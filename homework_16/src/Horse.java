public class Horse {
    int weight;
    int age;
    String color;
    String gender;
    String nick;

    public Horse(){}
    public Horse(int weight, int age, String color, String gender, String nick) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.nick = nick;
    }

    public void printInfo(){
        System.out.println("Hourse: ");
        System.out.println("weight - " + weight + ", age - " + age + ", color - " + color + ", gender - " + gender + ", nickname - " + nick);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
