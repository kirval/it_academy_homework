package lecture.week4.generic.example.classExample;

public class Computer {

    <T extends Drive> void read(T file) {
        file.read();

    }

    <V extends Drive> void write(V file) {
        file.write();

    }


}
