public class Cpu {
    String model;
    int numberOfCores;
    double frequency;

    //  Constructors
    public Cpu(){}
    public Cpu(String model, int numberOfCores, double frequency) {
        this.model = model;
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
    }

    public void printInfo(){
        System.out.println("CPU: model - " + model + ", number of cores - " + numberOfCores + ", frequency - " + frequency);
    }

    //  getters and setters
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }
    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
