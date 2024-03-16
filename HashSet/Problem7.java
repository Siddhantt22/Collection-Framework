import java.util.*;
public class Problem7{
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2 );
        set.add(3 );
        set.add(4); 
        set.add(4); 
        int element=5;
        set.add(element);
        Integer[] arr = new Integer[set.size()];
        set.toArray(arr);
        
       
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
}
}
