package lecture.week3.classes.example.example2;

public  class Pryamougolnik extends Figure {

    public Pryamougolnik(int a, int b) {
        super(a, b);
    }

    @Override
    int perimetr() {
        int perimtr = 2 * (super.a + super.b);
        System.out.println("Периметр прямоугольника: " + perimtr);
        return perimtr;
    }
}
