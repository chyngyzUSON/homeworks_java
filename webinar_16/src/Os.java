public class Os {
    String name;
    String version;

    //  Constructors
    public Os(){}
    public Os(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void printInfo(){
        System.out.println("OS: name - " + name + ", version - " + version);
    }

    //  getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
}
