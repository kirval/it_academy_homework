package lecture.week4.interfaceLecture.example;

public class Room {

    public Workable workables[];

    public Room(Workable[] workables) {
        this.workables = workables;
    }

    public void turnOnAll() {
        for (int i = 0; i < workables.length; i++) {
            workables[i].turnOn();
        }
    }

    public void turnOffAll() {
        for (int i = 0; i < workables.length; i++) {
            workables[i].turnOff();
        }
    }

    public static void main(String[] args) {
        Workable workables[] = new Workable[7];
        workables[0] = new Screen();
        workables[1] = new AirConditioning();
        workables[2] = new Computer();
        workables[3] = new Computer();
        workables[4] = new Computer();
        workables[5] = new Computer();
        workables[6] = new Boiler();

        Room room312 = new Room(workables);
        room312.turnOnAll();
        room312.turnOffAll();
    }


}
