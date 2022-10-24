import java.util.*;

public class guess_number {
    static int num ;  
    static int attempt=0 ;  
    public static void guessed(){
        attempt++;
        Scanner sc = new Scanner(System.in);
        int guessed1 = sc.nextInt();
        if(guessed1 == num ){
            System.out.println(" found number in "+attempt+" attempts");
            sc.close();
            return ;
        }else if(guessed1 > num){
            System.out.println("please guess smaller number ");
            guessed();
        }else if(guessed1 < num){
            System.out.println("please guess bigger number ");
            guessed();
        }else{
            guessed();
        }
        sc.close();
    }
    public static void main(String[] args) {
        num = (int)(Math.random() * 100);
        System.out.println("we have a number for you to guess between 1 to 100");
        System.out.println("guess it below ");
        guessed();
    }
}
