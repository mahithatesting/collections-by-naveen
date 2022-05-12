package naveenautomation.com;

import java.util.*;

import java.util.concurrent.CopyOnWriteArrayList;
import  java.util.stream.Collectors;

public class ArrayLIst {


    public static void main(String[] args) {
        List<String> nameList= Collections.synchronizedList(new ArrayList<String>());

        nameList.add("java");
        nameList.add("one");
        nameList.add("one1");
        nameList.add("one2");
        nameList.add("one3");
        // add,remove we dont need explicit synchronization
        // fetch the value from this list we have to use explicit synchronization

        synchronized (nameList){
            Iterator<String> ita=nameList.iterator();
            while (ita.hasNext()){
                System.out.println(ita.next());
            }

        }
 // 2 way thread safe variant copyOnWriteArraylist--- its a class
        CopyOnWriteArrayList<String> Emplist=new CopyOnWriteArrayList<String>();
        Emplist.add("Two1");
        Emplist.add("Two12");
        Emplist.add("Two13");
        Emplist.add("Two1");
        Emplist.add("Two1");


        // we dont need explicit synchronization for any operationnadd/remove /traverse
        Iterator<String> it=Emplist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // how to delete duplicates from arraylist
        ArrayList<Integer> numbers=new ArrayList<Integer> (Arrays.asList(1,2,3,4,5,6,1,2,369));
        //1.linkedHashset--->set --> cannot have duplicate elements
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(numbers);
        ArrayList<Integer> numbersListWithoutDuplicates=new ArrayList<Integer> (linkedHashSet);
        System.out.println(numbersListWithoutDuplicates);


        //2 jdk streams
        ArrayList<Integer>  marksList=new ArrayList<Integer> (Arrays.asList(1,2,3,4,5,6,1,2,369));
        List<Integer> markListUnique=marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(markListUnique);


        // how to compare to ArrayList in collections
        //1.sort and equals

        ArrayList<String> arrayListforsort=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        ArrayList<String> arrayListforsort1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

        ArrayList<String> arrayListforsort3=new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
        Collections.sort(arrayListforsort);
        Collections.sort(arrayListforsort1);
        Collections.sort(arrayListforsort3);
        System.out.println(arrayListforsort.equals(arrayListforsort1)); //false
        System.out.println(arrayListforsort.equals(arrayListforsort3)); // true

   // 2.compare two list -find out the additional elements

        ArrayList<String>   finoutadd =new ArrayList<String> (Arrays.asList("A","B","C","D","F"));
        ArrayList<String>   finoutadd1 =new ArrayList<String> (Arrays.asList("A","B","C","D","E"));
//
//        //finoutadd.removeAll(finoutadd1);
//        System.out.println(finoutadd);//f
//
//        find out missing element
//        finoutadd1.removeAll(finoutadd);
//        System.out.println(finoutadd1); //E

     // find out common elements

        ArrayList<String>   commonElements0 =new ArrayList<String> (Arrays.asList("java","javascript","react","html","css"));
        ArrayList<String>   commonElements1 =new ArrayList<String> (Arrays.asList("java","javascript","bootstrap","maven","doclker"));

        commonElements1.retainAll(commonElements0);
        System.out.println(commonElements1);

    }





}
