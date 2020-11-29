public class Main {

    public static void main(String[] args) {
	// write your code here
        Hdd hdd1 = new Hdd(500, 300);
        Ram ram1 = new Ram(12, "model");
        Os os1 = new Os("Windows", "10 Pro");
        Cpu cpu1 = new Cpu("i5", 4, 2.4);

        Cpu cpu2 = new Cpu("i9", 8, 3.0);

        Notebook note = new Notebook(5, ram1, os1, cpu1, 3);
        note.addHdd(new Hdd(1000, 700));
        note.printInfo();

        note.setCpu(cpu2);
        note.setOs(new Os("Ubuntu", "16.04"));
        note.addHdd(new Hdd(1500, 600));    //Добавили еще один диск.

        System.out.println();
        note.printInfo();

        System.out.println();   //И потом удалили старый диск.
        if (note.deleteHdd(0)){
            System.out.println("HDD was deleted");
        } else {
            System.out.println("Index out of bound");
        }

        note.addSticker("ru");
        System.out.println();
        note.printInfo();
    }
}
