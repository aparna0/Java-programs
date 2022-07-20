import java.util.*;
public class ElectricBill {
public static void main(String args[]) {
System.out.println("Enter light units");
Scanner sc = new Scanner(System.in);
int units = sc.nextInt();
double bill = 0.0;
if( units > 0 ) {
    if( units <= 100) {
          bill = units * 0.6;
    }
    else {
           bill = bill + ( 100 * 0.6 );
           units = units - 100;
           int ch = 1;
           while( units > 0 ) {
                 switch(ch) {
                       case 1: // System.out.println("case 1"+"\n bill : "+bill+"\nunits :"+units);
        
                                  if( units <= 200 )           bill = bill + ( 0.7 * units);    
                                  else                                
bill = bill + (0.7 * 200);
                                  units = units - 200;
                                  ch = 2;
                                  break;
            
                       case 2: System.out.println("case 2");
                                   if( units <= 500 )           bill = bill + ( 0.8 * units);    
                                   else                                bill = bill + (0.8 * 500);
                                   units = units - 500;
                                   break;       
                      default : System.out.println("default");
                                    bill = bill + (0.9 * units);
                                    units = 0;
                                    break;           
               }//end of switch
          
         }//end of while
   }//end of else
   System.out.println("bill : "+ bill);
}//emd of outer if 
else    System.out.println("invalid units");
}
}