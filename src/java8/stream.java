package java8;

import java.util.ArrayList;
import java.util.List;

public class stream {
    public static void main(String[] args) {
        List list = new ArrayList<String>();

        list.add("public");
        list.add("static");
        list.add("void");

        list.stream().forEach(str -> System.out.println(str));

    }
}
