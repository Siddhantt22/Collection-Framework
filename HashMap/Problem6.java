import java.util.HashMap;

public class Problem6 {
    public static void main(String[] args) {
         HashMap<Integer,String>map=new HashMap<>();
         map.put(1, "Adam");
         map.put(2, "Bob");
         map.put(3, "chris");
         map.put(4, "daniel");
        map.put(5,"rock"); 

        HashMap<Integer,String>map2=new HashMap<>();
        map2=(HashMap)map.clone();
        System.out.println("First map is : "+map);
        System.out.println("Cloned map is : "+map2);
    }
}
