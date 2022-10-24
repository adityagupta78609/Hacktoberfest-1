// import java.util.*;
// time complexity = O((2^n) - 1)  =  O(2^n)

public class Tower_of_hanoi { 
    public static void tower(int n ,String src ,String helper , String dest){
        if(n==1){
            System.out.println(" transfer disk " + n+ " from "+src+ " to "+ dest);
            return ;            
        }
        tower(n-1,src,dest,helper);
        System.out.println(" transfer disk " + n+ " from "+src+ " to "+ dest);
        tower(n-1,helper,src,dest);
    }   
    public static void main(String[] args) {
            int n = 3;
        tower(n,"S","H","D");
    }
}


// 3 step process
/*
 * pehle n-1 disks ko helper mein layenge
 * fir last "n" disk ko source se destination le jayenge
 * fir n-1 disks ke liye helper = source , src = helper ,desination = destination
 * 
 * jisme firse upar ke 3 steps lagenge  
 */