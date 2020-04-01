package lecture.week3.stringBuffer.example;

public class StringBufferExample {

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();

        //Получение и установка символов
        example.charAtExample();
        example.getCharsExample();

        //Добавление в строку
        example.appendExample();
        example.insertExample();

        //Удаление символов
        example.deleteExample();

        //Обрезка строки
        example.substringExample();

        //Изменение длины
        example.setLengthExample();

        //Замена в строке
        example.replaceExample();

        //Обратный порядок в строке
        example.reverseExample();
    }

    /**
     * Метод charAt() получает, а метод setCharAt() устанавливает символ по определенному индексу
     */
    void charAtExample() {
        StringBuffer strBuffer = new StringBuffer("Java");
        char c = strBuffer.charAt(0); // J
        System.out.println(c);
        strBuffer.setCharAt(0, 'c');
        System.out.println(strBuffer.toString()); // cava
    }

    /**
     * Метод getChars() получает набор символов между определенными индексами
     */
    void getCharsExample() {
        StringBuffer strBuffer = new StringBuffer("world");
        int startIndex = 1;
        int endIndex = 4;
        char[] buffer = new char[endIndex - startIndex];
        strBuffer.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(buffer); // orl
    }

    /**
     * Метод append() добавляет подстроку в конец StringBuffer
     */
    void appendExample() {
        StringBuffer strBuffer = new StringBuffer("hello");
        strBuffer.append(" world");
        System.out.println(strBuffer.toString()); // hello world
    }

    /**
     * Метод insert() добавляет строку или символ по определенному индексу в StringBuffer
     */
    void insertExample() {
        StringBuffer strBuffer = new StringBuffer("word");

        strBuffer.insert(3, 'l');
        System.out.println(strBuffer.toString()); //world

        strBuffer.insert(0, "s");
        System.out.println(strBuffer.toString()); //sworld
    }

    /**
     * Метод delete() удаляет все символы с определенного индекса о определенной позиции,
     * а метод deleteCharAt() удаляет один символ по определенному индексу
     */
    void deleteExample() {
        StringBuffer strBuffer = new StringBuffer("assembler");
        strBuffer.delete(0, 2);
        System.out.println(strBuffer.toString()); //sembler

        strBuffer.deleteCharAt(6);
        System.out.println(strBuffer.toString()); //semble
    }

    /**
     * Метод substring() обрезает строку с определенного индекса до конца, либо до определенного индекса
     */
    void substringExample() {
        StringBuffer strBuffer = new StringBuffer("hello java!");
        String str1 = strBuffer.substring(6); // обрезка строки с 6 символа до конца
        System.out.println(str1); //java!

        String str2 = strBuffer.substring(3, 9); // обрезка строки с 3 по 9 символ
        System.out.println(str2); //lo jav
    }

    /**
     * Для изменения длины StringBuffer (не емкости буфера символов) применяется метод setLength().
     * Если StringBuffer увеличивается, то его строка просто дополняется в конце пустыми символами,
     * если уменьшается - то строка по сути обрезается
     */
    void setLengthExample() {
        StringBuffer strBuffer = new StringBuffer("hello");
        strBuffer.setLength(10);
        System.out.println(strBuffer.toString()); //"hello     "

        strBuffer.setLength(4);
        System.out.println(strBuffer.toString()); //"hell"
    }

    /**
     * Для замены подстроки между определенными позициями в StringBuffer на другую подстроку применяется метод replace()
     */
    void replaceExample() {
        StringBuffer strBuffer = new StringBuffer("hello world!");
        strBuffer.replace(6, 11, "java");
        System.out.println(strBuffer.toString()); //hello java!
    }

    /**
     * Метод reverse() меняет порядок в StringBuffer на обратный
     */
    void reverseExample() {
        StringBuffer strBuffer = new StringBuffer("assembler");
        strBuffer.reverse();
        System.out.println(strBuffer.toString()); //relbmessa
    }


}
