package lecture.week3.classes.example.example1;

public class Box {

    private String test = "stroka";

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        if (test.length() < 6){
            this.test = test;
        }
    }

}
