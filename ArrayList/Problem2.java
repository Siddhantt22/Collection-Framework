import java.util.ArrayList;

public class Problem2 {

public static void main(String[] args) {
    ArrayList<String>Color=new ArrayList<>();
    Color.add("red");
    Color.add("blue");
    Color.add("purple");
    Color.add("black");

    for(int i=0;i<Color.size();i++)
        {
            System.out.println(Color.get(i));
        }
}
}
