import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int Element=6;
        

        list.offerFirst(Element);//on position first
        
       
        System.out.println(list);
}
}


