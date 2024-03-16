import java.util.*;
public class Problem6{
    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>();

        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(2 );
        set1.add(3 );
        set1.add(4); 
        set1.add(4); 
        int element=5;
        set1.add(element);
   
      System.out.println("Set 1 : "+set1);

      HashSet<Integer>set2=new HashSet<>();
      set2=(HashSet)set1.clone();
      System.out.println("New Set 2 : "+set2);




}
}
