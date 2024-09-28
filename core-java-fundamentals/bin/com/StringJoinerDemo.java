import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String args[]){
        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("black");
        sj1.add("white");
        sj1.add("red");
        System.out.println(sj1);

        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj2.add("black");
        sj2.add("white");
        sj2.add("red");
        System.out.println(sj2);
    }

//    output:
//    black,white,red
//    [black,white,red]

}
