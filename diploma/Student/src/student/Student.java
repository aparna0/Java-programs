
package student;

public class Student {
    // data abstraction
    private int rollNo;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    // setdata method to set values
    public void setData(int no, String name, int m1, int m2, int m3){
        rollNo = no;
        name = name;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    //validate roolno
    public boolean validate(int no){
        if(no == rollNo)  return true;
        else return false;
    }
    //business logic
    public float average(int no){
        float avg = 0.0f ;
        if(validate(no)){
            avg = ((mark1+mark2+mark3) / 3);
        }
        else {
            System.out.println("invalid roll number");
            avg = 0.0f;
        }
        return avg;
    }
    public String grade(int no, float avg){
        String grd;
        if(validate(no)){
            if(avg > 60) grd = "A";
            else if( avg >= 40 && avg <= 60) grd = "B";
            else grd = "FAIL";
        }
        else {
            System.out.println("invalid roll number");
            grd = "";
        }
        return grd;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Student std = new Student();
        std.setData(1, "aparna", 90, 80, 70);
        float avg = std.average(1);
        String grd = std.grade(1,avg);
        System.out.println("Drade is : "+grd);
    }
    
}
