public class Notebook {
    Hdd[] hdd;
    Ram ram;
    Os os;
    Cpu cpu;
    String[] stickers;

    //  Constructors
    public Notebook(){}
    public Notebook(int numberOfHdd, Ram ram, Os os, Cpu cpu, int stickerSize){
        this.hdd = new Hdd[numberOfHdd];
        this.ram = ram;
        this.os = os;
        this.cpu = cpu;
        this.stickers = new String[stickerSize];
    }

    public void printInfo(){
        System.out.println("Notebook: ");
        for (int i = 0; i < hdd.length; i++) {
            if (hdd[i] != null)
                hdd[i].printInfo();
        }
        ram.printInfo();
        os.printInfo();
        cpu.printInfo();
        System.out.println("Stickers: ");
        for (int i = 0; i < stickers.length; i++) {
            if(stickers[i] != null){
                System.out.print(stickers[i] + " ");
            }
        }
    }

    public String[] getStickers(){
        return stickers;
    }

    //  getters and setters
    public Hdd[] getHdd() {
        return hdd;
    }
//    public void setHdd(Hdd[] hdd) {
//        this.hdd = hdd;
//    }
    public boolean addSticker(String sticker) {
        for (int i = 0; i < this.stickers.length; i++) {
            if (this.stickers[i] == null){
                this.stickers[i] = sticker;
                return true;
            }
        }
        return false;
    }

    public boolean deleteHdd(int indexofHdd) {
        if (indexofHdd >= 0 && indexofHdd < hdd.length){
            hdd[indexofHdd] = null;
            return true;
        }
        return false;
    }

    public Ram getRam() {
        return ram;
    }
    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Os getOs() {
        return os;
    }
    public void setOs(Os os) {
        this.os = os;
    }

    public Cpu getCpu() {
        return cpu;
    }
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
