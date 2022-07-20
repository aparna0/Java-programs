// reading character from one file and calculating characters , wors , lines and writing answer to another file
import java.io.*;

public class FileInputStreamDemo {
   public static void main(String args[]) throws FileNotFoundException, IOException{
       FileInputStream in = new FileInputStream("inputFile.txt");                              // throws FileNotFoundException
       FileOutputStream out = new FileOutputStream("outputFile.txt");
       char ch ;
       int i, c = 0, w  = 0, l = 0;
        
       i = in.read();    // or in.readLine()
       while( i != -1 ) {
                ch = (char)i;
                out.write(ch);
	if( ch == '\n' ) {
                    l++;
                    w++;
	}
	else if( ch == ' ')       w++;
                else                        c++;
                i = in.read();
      }
     
       System.out.println("no of characters : "+ (--c));  
       System.out.println("no of words : "+ (++w));  
       System.out.println("no of lines : "+ (++l));  

// writing to file
       String str = "\nno of characters : "+ c;
       byte[] b = str.getBytes();
       out.write(b);
       str = "\nno of words :  " + w;
       b = str.getBytes();
       out.write(b);
       str = "\nno of lines :  " + l;
       b = str.getBytes();
       out.write(b);

       in.close();                                                                                                     // throws IOException
       out.close();
  }
}