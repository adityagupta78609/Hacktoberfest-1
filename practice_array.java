public class practice_array {
    static int sum(int ...arr){            // takes variable arguments in function
        //available as integer array arr
        int result=0;

        // for each loop a takes the value of arr[i] for each element in array arr 
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,6,7));
        System.out.println(sum(5,8,45,6,7));
    }
}
