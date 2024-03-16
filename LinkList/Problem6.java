import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int firstElement=6;
        int lastElement=8;

        list.addFirst(firstElement);//on position first
        list.addLast(lastElement);//on position last
       
        System.out.println(list);
}
}


