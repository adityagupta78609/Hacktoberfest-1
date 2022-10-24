import java.util.*;

class swapNum {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");   
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("numbers before swapping : "+ num1 +" "+ num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("numbers after swapping : "+ num1 +" "+ num2);
        sc.close();
    }
}