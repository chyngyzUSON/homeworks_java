public class Farm {
    String farmAddress;
    Cow[] cows;
    Sheep[] sheeps;
    Horse[] horses;
    String owner;

    public Farm(){}

    public Farm(String farmAddress, Cow[] cows, Sheep[] sheeps, Horse[] horses, String owner) {
        this.farmAddress = farmAddress;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.owner = owner;
    }

    public void printInfo(){
        System.out.println("Farm: ");
        for (int i = 0; i < cows.length; i++) {
            if (cows[i].age != 0)
                cows[i].printInfo();
        }
        for (int i = 0; i < sheeps.length; i++) {
            if (sheeps[i].age != 0)
                sheeps[i].printInfo();
        }
        for (int i = 0; i < horses.length; i++) {
            if (horses[i].age != 0)
                sheeps[i].printInfo();
        }
    }

    public String getFarmAddress() {
        return farmAddress;
    }

    public void setFarmAddress(String farmAddress) {
        this.farmAddress = farmAddress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
