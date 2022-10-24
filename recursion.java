// import java.util.*;
public class recursion {
    public static int tiles(int n,int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
    // vertical 
    int verplacement=0;
     verplacement += tiles(n-m,m);
    //horintal
    int horplacement=0;
    horplacement += tiles(n-1,m);
    return verplacement+horplacement;
    }
    public static void main(String[] args) {      
        System.out.println("no.of placements is : " + tiles(6,2)
        );
    }
}
// place 1 X M tiles in N X M tiles