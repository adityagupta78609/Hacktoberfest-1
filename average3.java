// import java.rmi.NoSuchObjectException;
import java.util.Scanner;

// import java.util.*;

class avg {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        System.out.println(avg3(num1,num2,num3));

        sc.close();
    }
    
    public static int avg3(int a ,int b,int c){
        return (a+b+c)/3;
    }
}