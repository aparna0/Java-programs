// Read a string(lines of texts) from console using a BuferredReader readLine() method .
// Program reads the lines of text and display text until user enter "stop";

import java.io.*;
public class BRreadLineDemo {
   public static void main(String args[]) throws IOException{
      PrintWriter pw = new PrintWriter(System.out, true);
      pw.println(" Enter lines of text and enter stop to stop");
      BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
      String str;
      do{
            str = (String)br.readLine();
            pw.println(str);
      }while( !str.equalsIgnoreCase("stop") );
  }
}