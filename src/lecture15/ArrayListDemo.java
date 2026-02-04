package lecture15;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("p");
        list.add("A");
        list.add("ad");

        for (String str:list) {
            System.out.println(str+" ");
        }

    }
}
