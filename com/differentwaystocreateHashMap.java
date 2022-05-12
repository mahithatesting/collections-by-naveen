package naveenautomation.com;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class differentwaystocreateHashMap {

    public static  class HashMapInitilization{
        public static Map<String,Integer>marksMap;
        static {
            marksMap=new HashMap<>();
            marksMap.put("a",10);
            marksMap.put("b",100);
            marksMap.put("c",101);
            marksMap.put("d",102);


        }
    }


    public static void main(String[] args) {
        // different ways of creating hashmap
        //1.using hashmap class
        HashMap<String,String> MMap1=new HashMap<>();
        Map<String,String> MMap2=new HashMap<>();
        //2.static way:static hashmap:
        HashMapInitilization.marksMap.get("A");  // create a class and intitiaze with class name;

        //if we use static it creates inner class and memory management problems
        //3.immutable map with only one single entry
         Map<String,Integer> map2=Collections.singletonMap("test",100);
        System.out.println(map2.get("test")); // 100
       // map2.put("abc",200);
       // System.out.println(map2.get("abc")); when we add more than one we get error and exception UnsupportedOperationException
//        Exception in thread "main" java.lang.UnsupportedOperationException
//        at java.base/java.util.AbstractMap.put(AbstractMap.java:209)
//        at naveenautomation.com.differentwaystocreateHashMap.main

        // jdk 8
        // creating 2d array of string using stream and collecting in the form of map
        Map<String,String> map3= Stream.of(new String[] []{
            {"Tom","AGrade"},
                {"Tommy","ABrade"},
        }).collect(Collectors.toMap(data -> data[0], data ->data[1]));
        // toMap method for streams and collector
        System.out.println(map3.get("Tom"));
        System.out.println(map3.get("Lisa"));
   // using simple entry
      Map<String,String>  map4=Stream.of(
                new AbstractMap.SimpleEntry<>("mahitha","java"),
                new AbstractMap.SimpleEntry<>("mahi","java1"),
                new AbstractMap.SimpleEntry<>("mah","java2")

        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map4.get("mahitha"));

        // jdk 1.9 to create empty map
       Map<String, String> emptymap=Map.of();
       emptymap.put("RRR","waste");
        System.out.println(emptymap.get("RRR")); //UnsupportedOperationException //ImmutableCollections.java:71
        // to create we have another method for singleton map
        Map<String, String> singleton=Map.of("dd","vv");
        System.out.println(singleton.get("dd"));
        //singleton.put("k2","V2); // unsupportedOperationException

    }
}
