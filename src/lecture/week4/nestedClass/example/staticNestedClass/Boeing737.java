package lecture.week4.nestedClass.example.staticNestedClass;

public class Boeing737 {

    private int manufactureYear;
    public static int maxPassengersCount = 300;

    public Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Drawing {

        public static int getMaxPassengersCount() {
            return maxPassengersCount;
        }

    }
}