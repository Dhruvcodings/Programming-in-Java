import java.util.*;
public class decimal_binary {
    public static void dectobin(int decnum){
        int pow=0;
        int binnum=0;
        int mynum=decnum;
        while (decnum>0){
            int rem=decnum%2;
            binnum=binnum+(rem* (int)Math.pow(10,pow));
            pow++;
            decnum=decnum/2;
        }

            System.out.println("binary of "+mynum+" = "+binnum);
        }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        dectobin(number);
        
    }
}











