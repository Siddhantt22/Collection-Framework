import java.util.HashMap;

public class Problem8 {
    public static void main(String[] args) {
         HashMap<Integer,String>map=new HashMap<>();
         map.put(1, "Adam");
         map.put(2, "Bob");
         map.put(3, "chris");
         map.put(4, "daniel");
        map.put(5,"rock"); 
       String  value="daniel";
        if(map.containsValue(value))
        {
            System.out.println("Yes it contains "+value);
        }
        else{
            System.out.println("No it doesnt contain value");
        }

        String key2="siddhhant";
        if(map.containsKey(key2))
        {
            System.out.println("Yes it contains : "+ (key2));
        }
        else{
            System.out.println("No it doesnt contain value " + key2);
        }
    }
}
