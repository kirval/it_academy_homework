package lecture.week3.classes.example.example2;

public abstract class Figure {

    int a;
    int b;

    static void test() {
        System.out.println("test");
    }

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int perimetr();

}
