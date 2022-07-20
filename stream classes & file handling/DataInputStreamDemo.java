import java.io.*;
public class DataInputStreamDemo {
public static void main(String args[] ) throws IOException{
     DataInputStream in = new DataInputStream( new FileInputStream( "F:\\java_programs\\inputFile.txt"));
     char i;
     i = in.readChar();
     System.out.println((int)i);
}
}