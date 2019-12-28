package ADT;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(2);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
