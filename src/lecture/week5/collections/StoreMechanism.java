package lecture.week5.collections;

import java.util.ArrayList;
import java.util.List;

//Пример механизма сохранения объектов в коллекции
public class StoreMechanism {

    String example;

    public StoreMechanism(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return example;
    }

    public static void main(String[] args) {
        List<StoreMechanism> list = new ArrayList<>();
        StoreMechanism storeMechanism1 = new StoreMechanism("example1");
        StoreMechanism storeMechanism2 = new StoreMechanism("example2");

        list.add(storeMechanism1);
        System.out.println(list);

        //Меняем значение поля
        storeMechanism1.example = "changed example1";
        System.out.println(list);

        //Меняем ссылку
        storeMechanism1 = storeMechanism2;
        System.out.println(list);

    }

}
