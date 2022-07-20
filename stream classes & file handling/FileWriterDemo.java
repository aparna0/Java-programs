// reading character from one file and calculating characters , wors , lines and writing answer to another file
import java.io.*;
public class FileWriterDemo {
  public static void main(String args[]) throws IOException{
        FileReader in = new FileReader("inputFile.txt");
        FileWriter out = new FileWriter("outputFile.txt");
        int c = 0, w = 0, l = 0;
        char ch;
        int i = in.read();
        while( i != -1 ) {
             out.write(i);
             ch = (char)i;
             if( ch == '\n' ) {
                 l++;
                 w++;
             }
             else if(ch == ' ')         w++;
             else                         c++;
             i = in.read();
        }
        System.out.println("w  : " + (++w) + " l : "+ (++l) + " c : "+ (--c) );
        String str = "\nNumber of characters : " + c;
        out.write(str);
        str = "\n Number of words : " + w;
        out.write(str); 
        str = "\n Number of lines : " + l;
        out.write(str); 
        in.close();
        out.close(); 

  }
}