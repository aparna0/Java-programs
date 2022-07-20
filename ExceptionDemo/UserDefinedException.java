public class UserDefinedException extends Exception{
  public static void main(String args[]) {
       try {
            throw new Exception(" wrong password ");
       }
       catch( Exception e ) {
            System.out.println(e);
      } 
  }
}