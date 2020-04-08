package lecture.week4.nestedClass.example.staticNestedClass;

public class App {

    public static void main(String[] args) {

        Boeing737.Drawing drawing1 = new Boeing737.Drawing();
        Boeing737.Drawing drawing2 = new Boeing737.Drawing();

        Boeing737 boeing = new Boeing737(2020);

        System.out.println(boeing.maxPassengersCount);
        System.out.println(Boeing737.Drawing.getMaxPassengersCount());
    }

}
