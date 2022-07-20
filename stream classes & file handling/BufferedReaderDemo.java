// taking input from user continuously util user enter q 

import java.io.*;
public class BufferedReaderDemo {
  public static void main(String args[]) throws IOException{
           char ch ;
    BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
    System.out.println(" Enter charcters and to stop input enter 'q'");
     do{
          ch = (char)br.read();
           System.out.println(ch);
     }while( ch != 'q');
  }
}
/* when whole input entered in one line
F:\java_programs\stream_classes>java BufferedReaderDemo
1234avcq
1
2
3
4
a
v
c
q

when entered line by line
F:\java_programs\stream_classes>java BufferedReaderDemo
1
1



a
a



q
q
*/