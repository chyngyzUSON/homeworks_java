public class Cow {
    int weight;
    int age;
    String gender;
    String nick;

    public Cow(){}
    public Cow(int weight, int age, String gender, String nick) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nick = nick;
    }

    public void printInfo(){
        System.out.println("Cow: ");
        System.out.println("weight - " + weight + ", age - " + age + ", gender - " + gender + ", nickname - " + nick);
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
