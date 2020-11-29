    public class Hdd {
        int size;
        int speed;

        public Hdd(){}
        public Hdd(int size, int speed){
            this.size = size;
            this.speed = speed;
        }

        public void printInfo(){
            System.out.println("HDD: size - " + size + ", speed - " + speed);
        }

        //  Getters and Setters

        public int getSize() {
            return size;
        }
        public void setSize(int size) {
            this.size = size;
        }

        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }

