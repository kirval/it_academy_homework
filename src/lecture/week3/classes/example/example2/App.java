package lecture.week3.classes.example.example2;

public class App {

    public static void main(String[] args) {
        Figure pr = new Pryamougolnik(7, 15);
        Figure kv = new Kvadrat(5);

        pr.perimetr();
        pr.test();
        kv.perimetr();
        kv.test();

    }
}
