import java.util.HashMap;

public class Problem4 {
    public static void main(String[] args) {
         HashMap<Integer,String>map=new HashMap<>();
         map.put(1, "Adam");
         map.put(2, "Bob");
         map.put(3, "chris");
         map.put(4, "daniel");
        map.put(5,"rock");
         System.out.println(" Map before "+map);

         map.clear();
         System.out.println("Map after clearing :"+map);


    }
}
