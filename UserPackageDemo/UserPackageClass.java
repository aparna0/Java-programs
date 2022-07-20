package UserPackageDemo;
public class UserPackageClass {
 public int min(int...a){
         int small = 999999;
         for( int x : a )
              if( small > x )  small = x;
         return small;
    }
}

