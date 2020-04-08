package lecture.week3.classes.example.example2;

public class Kvadrat extends Pryamougolnik {

    public Kvadrat(int a) {
        super(a, a);
    }

    @Override
    int perimetr() {
        int perimtr = 2 * (super.a + super.a);
        System.out.println("Периметр квадрата: " + perimtr);
        return perimtr;
    }

}
