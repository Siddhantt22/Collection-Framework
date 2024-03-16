import java.util.HashMap;

public class Problem7 {
    public static void main(String[] args) {
         HashMap<Integer,String>map=new HashMap<>();
         map.put(1, "Adam");
         map.put(2, "Bob");
         map.put(3, "chris");
         map.put(4, "daniel");
        map.put(5,"rock"); 
       int key=3;
        if(map.containsKey(key))
        {
            System.out.println("Yes it contains : "+ map.get(key));
        }
        else{
            System.out.println("No it doesnt contain it");
        }

        int key2=11;
        if(map.containsKey(key2))
        {
            System.out.println("Yes it contains : "+ map.get(key2));
        }
        else{
            System.out.println("No it doesnt contain key " + key2);
        }
    }
}
