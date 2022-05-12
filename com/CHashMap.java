package naveenautomation.com;
import java.util.*;
import java.util.Map.Entry;
import java.util.Map;


public class CHashMap {
    public static void main(String[] args) {
        //it doesnot maintain insertion order it works on hashtable
        //stores the value based on key and value
        // key should be unique always
        // we can store only one null key
        // hashmap  is not thread safe-unsynchronized
        // hashmap is associative array data structre stores data in the form of key-value pair
        HashMap<String,String> Map1=new HashMap<String,String>();
        Map1.put("india","paksistan");
        Map1.put("bangalore","ajerbaijan");
        Map1.put("america","africa");
        Map1.put("russia","afghanista");
        Map1.put("null","syria");
        Map1.put("null","cuba");  // it wont through error but take latest value of null value

        // fetch the value be but hashmap dont have order or indexf
         // iterator
       Iterator<String> itHmap= Map1.keySet().iterator();
        System.out.println("*****keyset()****");
        while (itHmap.hasNext()) {
            String key= itHmap.next();
           String value= Map1.get(key);
            System.out.println("key="+key+"value=" +value);

        }
        // iterator :over the set (pair): by using entryset
        Iterator<Entry<String,String >> itHmap1=Map1.entrySet().iterator();
        System.out.println("*********using entry by using entryset()**********");
while (itHmap1.hasNext()){
    Entry<String,String> entry1=itHmap1.next();
    System.out.println(entry1);
    System.out.println("entryKey="+entry1.getKey()+"entryValue=" + entry1.getValue());
}

// iterate hashmap using java8 foreach and lambda;
        Map1.forEach((key,value)->System.out.println("forEachkey="+key+"and value="+value));
  // how to compare twohashma
        //1.on the basis of key-value use equals method:
        HashMap<Integer,String> map2=new HashMap<Integer,String>();
        map2.put(1,"A");
        map2.put(2,"B");
        map2.put(3,"C");

        HashMap<Integer,String> map3=new HashMap<Integer,String>();
        map3.put(3,"C");
        map3.put(1,"A");
        map3.put(2,"B");

        HashMap<Integer,String> map4=new HashMap<Integer,String>();

        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(3,"D");
        //1.on the basis of the key-value :use equals method:
        System.out.println( "on the basis of key value ");
        System.out.println(map2.equals(map3));// true
        System.out.println(map2.equals(map4)); //false

        // how to compare hashmaps for the same keys:Keyset()
        System.out.println(map2.keySet().equals(map2.keySet()));//true
        System.out.println(map2.keySet().equals(map3.keySet())); // true because we have 1233 key but it ignore lastone automatically
        // find out the extra keys:
        HashMap<Integer,String> map5=new HashMap<Integer,String>();
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");
        map5.put(4,"D");


        // combine/union  both the keys from the both the maps: using HashSet

        HashSet<Integer> combineKey=new HashSet<Integer>(map2.keySet());
        // add the keyset from map4
        combineKey.addAll(map5.keySet());
        combineKey.removeAll(map2.keySet());
        System.out.println(combineKey);
  //4 compare by values

        HashMap<Integer,String> map6=new HashMap<Integer,String>();
        map2.put(1,"A");
        map2.put(2,"B");
        map2.put(3,"C");

        HashMap<Integer,String> map7=new HashMap<Integer,String>();
        map7.put(4,"A");
        map7.put(5,"B");
        map7.put(6,"C");

        HashMap<Integer,String> map8=new HashMap<Integer,String>()
                ;

        map8.put(1,"A");
        map8.put(2,"B");
        map8.put(3,"C");
        map8.put(4,"C");
        //1.duplicates or not allowed:using ArrayList
        System.out.println(new ArrayList<>(map6.values()).equals(new ArrayList<>(map7.values()))); //true
        System.out.println(new ArrayList<>(map6.values()).equals(new ArrayList<>(map8.values()))); //false

        //2.if duplicates are allowed: using Hashset
        System.out.println(new HashSet<>(map6.values()).equals(new HashSet<>(map7.values())));
        System.out.println(new HashSet<>(map6.values()).equals(new HashSet<>(map8.values())));

  // how exactly hashmap works internally updates after java8
        Map<String,Integer> marks=new HashMap<String, Integer>();
        marks.put("Nav",100);
        marks.put("Tom",200);
        marks.put("Lisa",300);
        marks.put("Nav",300);
        marks.put("peter",400);
        marks.put("Robby",500);
     marks.put(null,500);
        System.out.println("marks");
        System.out.println(marks);

    }
}
