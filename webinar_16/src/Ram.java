public class Ram {
    int size;
    String model;

    //  Constructors
    public Ram(){}
    public Ram(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public void printInfo(){
        System.out.println("Ram: size - " + size + ", model - " + model);
    }

    //  Getters and Setters
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}