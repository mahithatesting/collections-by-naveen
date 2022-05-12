package naveenautomation.com;

import java.util.*;

public class ConvertHashMaptiArrayList {
    public static void main(String[] args) {
        HashMap<String, Integer> compMap= new HashMap<String, Integer>();
        compMap.put("Google",6000);
        compMap.put("Walmart",7000);
        compMap.put("Amazon",8000);
        compMap.put("FaceBook",10000);
        compMap.put("Cisco",9000);
        System.out.println("comp map size:" +compMap.size());

        Iterator it=compMap.entrySet().iterator();
        while(it.hasNext()){
          Map.Entry pairs= (Map.Entry)it.next();

            System.out.println(pairs.getKey() +"=" +pairs.getValue());
            System.out.println("_______");
            compMap.forEach((k,v)-> System.out.println(
   "key =" +k+ "value=" +v
            ));
            // convert hashmap to array List
            List<String> compNameList =new ArrayList<String>(compMap.keySet());
            for (String t : compNameList){
                System.out.println(t);
            }
// convert hashmap values into arraylist
   List<Integer> EmpValList=new ArrayList<Integer>(compMap.values());
            System.out.println("Total emp values count ="+EmpValList.size());
            for (Integer e:EmpValList){
                System.out.println(e);
            }

        }


    }
}
//    comp map size:5
//        Google=6000
//        Google
//        Walmart
//        Cisco
//        FaceBook
//        Amazon
//        6000
//        7000
//        9000
//        10000
//        8000
//        Walmart=7000
//        Google
//        Walmart
//        Cisco
//        FaceBook
//        Amazon
//        6000
//        7000
//        9000
//        10000
//        8000
//        Cisco=9000
//        Google
//        Walmart
//        Cisco
//        FaceBook
//        Amazon
//        6000
//        7000
//        9000
//        10000
//        8000
//        FaceBook=10000
//        Google
//        Walmart
//        Cisco
//        FaceBook
//        Amazon
//        6000
//        7000
//        9000
//        10000
//        8000
//        Amazon=8000
//        Google
//        Walmart
//        Cisco
//        FaceBook
//        Amazon
//        6000
//        7000
//        9000
//        10000
//        8000
