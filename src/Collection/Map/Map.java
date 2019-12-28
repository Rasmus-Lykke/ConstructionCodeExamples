package Collection.Map;

import java.util.*;

//A Map cannot contain duplicate keys and each key can map to at most one value.
//Some implementations allow null key and null value like the HashMap and LinkedHashMap.
//But some do not like the TreeMap.

//The order of a map depends on specific implementations, e.g TreeMap and LinkedHashMap
//have predictable order, while HashMap does not.

//There are two interfaces for implementing Map in java: Map and SortedMap,
//and three classes: HashMap, TreeMap and LinkedHashMap.

public class Map {

    //--------------HashMap----------------//
    /*
    public static void main(String[] args) {

    HashMap<String,Integer> hashMap = new HashMap< String,Integer>();

        print(hashMap);
        hashMap.put("Adam", 100);
        hashMap.put("Bob", 200);
        hashMap.put("Charley", 300);
        hashMap.put("David", 400);

        print(hashMap);
        if(hashMap.containsKey("Bob")){
            Integer a = hashMap.get("Bob");
            System.out.println("Bob's Key = " + a);
        }

        hashMap.clear();
        print(hashMap);

}
    public static void print(HashMap<String, Integer> map){

        if(map.isEmpty()){
            System.out.println("Map er tomt");
        }
        else{
            System.out.println(map);
        }
    }

     */

    //--------------TreeMap----------------//
    //Sorted by the natural order of the keys
    //Extends AbstractMap, Implements NavigableMap and SortedMap
    static void Map(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        //tilføjer elementer med put skal angive key og value.
        treeMap.put(5, "Jonas");
        treeMap.put(20, "Tobias");
        treeMap.put(25, "Mathias");
        treeMap.put(10, "Thomas");
        treeMap.put(15, "Frank");
        treeMap.put(30, "Oliver");

        System.out.println("treemap:" + treeMap);

        //fjerner element med key
        treeMap.remove(25);
        System.out.println(treeMap);
        //finder element ud fra key
        System.out.println(treeMap.get(10));


    }

    public static void main(String[] args) {
        //constructor
        Map();
    }
}
