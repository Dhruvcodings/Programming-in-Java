import java.util.*;
public class prime_number {
    public static void bintodec(int binnum){
        int pow=0;
        int decnum=0;
        int mynum=binnum;
        while (binnum>0){
            int lastdigit=binnum%10;
            decnum=decnum+(lastdigit* (int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }

            System.out.println("decimal of "+mynum+" = "+decnum);
        }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        bintodec(number);
        
    }
}











