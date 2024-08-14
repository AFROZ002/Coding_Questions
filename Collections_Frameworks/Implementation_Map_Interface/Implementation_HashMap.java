package Collections_Frameworks.Implementation_Map_Interface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Implementation_HashMap {
    public static void main(String[] args) {
        Map<String,Integer> m5=new HashMap<>();


        m5.put("Afroz",69);
        m5.put("Mahesh",87);
        m5.put("Rdx Sir",72);
        m5.put("Majnu Bhaiya",78);
        m5.put("Kazi Shahab",79);

//        for(Map.Entry<String,Integer>E:m5.entrySet()){
//            System.out.println(E.getKey()+E.getValue());
//        }

//        System.out.println(m5);

//        int count=m5.get("Afroz");
//        System.out.println(count) //        its  give the key value


//
//        if(m5.containsKey("Rdx Sir")){
//            System.out.println("Yes it is Available");
//        }


//        for (Integer Ele : m5.values()) {
//            System.out.println(Ele);
//        }
//        Basically its return the key  of the map element






        for(String k:m5.keySet()){
            System.out.println(k+m5.get(k));
        }



//        m5.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));


//        m5.entrySet().stream()
//                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));





    }
}
