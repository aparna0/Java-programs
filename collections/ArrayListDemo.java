import java.util.*;
public class ArrayListDemo {
   public static void main(String args[]) {
        ArrayList<Integer>  list = new ArrayList<Integer>();
        for(int i = 1; i <= 5; i++ ) {
            list.add(i);
        }
       Iterator itr = list.iterator();
       while( itr.hasNext()) {
           System.out.println(itr.next());
      }
   }
}
 