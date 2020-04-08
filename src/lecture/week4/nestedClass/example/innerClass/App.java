package lecture.week4.nestedClass.example.innerClass;

public class App {

    public static void main(String[] args) {
        /*
        У нас есть какой-то непонятный велосипедный руль (зачем он нужен?).
        И этот руль поворачивает вправо...сам по себе, без велосипеда...зачем-то.
        */
//        SteeringWheel steeringWheel = new SteeringWheel();
//        steeringWheel.right();

        /*
        С использованием внутреннего класса код смотрится совсем иначе:
         */
//        Bicycle peugeot = new Bicycle("Peugeot", 120, 40);
//        Bicycle.SteeringWheel wheel = peugeot.new SteeringWheel();
//        Bicycle.Seat seat = peugeot.new Seat();
//
//        seat.getSeatParam();
//        seat.up();
//        peugeot.start();
//        wheel.left();
//        wheel.right();
        /*
        В данном примере выделение руля и сидения усиливает инкапсуляцию
        (мы скрываем данные о частях велосипеда внутри соответствующего класса),
        и позволяет создать более подробную абстракцию.
         */
    }

}
