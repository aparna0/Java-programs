import java.io.*;
public class FileDemo {
public static void main(String args[ ]) throws IOException{
File inputFile = new File("F:\\java_programs\\inputFile.txt");
File outputFile = new File("F:\\java_programs\\outputFile.txt");
FileInputStream in =new FileInputStream(inputFile);
FileOutputStream out =new FileOutputStream(outputFile);
int i , c = 0, s = 0 , l =0 ;
char ch;
while( ( i = in.read() ) != -1 ) {
      out.write(i);
      ch = (char)i;
      System.out.print(ch);
      if( ch == ' ')    s++;
      if( ch == '\n')  l++;
      else                  c++;
     

}
System.out.println("characters  : "+ c+"\t lines  : "+ (l+1) +"\t spaces : "+s);
}
}