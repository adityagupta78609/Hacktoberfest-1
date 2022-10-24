// import java.util.*;

//loop is for changing the character at a position

class backtracking {
    public static void arrangement(String str,String per){

        // condition to print when the substring i.e permutation is formed with size same as original string

        if(str.length() == 0){ 
        System.out.println(per);
        return;
        }

        // for the first call i=0 will go for first element in originsl array ;
        // then i=1 will go for 2nd element in original array 
        

        for(int i=0; i<str.length();i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            arrangement(newstr,per+currchar );

            // we have done per+currchar in function because if the per strring is updated before calling then the string will be formed and then function will be called due to which when we return the string will have the previous values stored in it 

        }
    }

    public static void main(String[] args) {
           String str ="abc";
        arrangement(str, "");
    }
}