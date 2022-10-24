public class string_reverse {
    public static void reverse(String str,int n){
  if (n==0){
    return ;
}
System.out.print(str.charAt(n-1));
reverse(str,n-1);
    }
    public static void main (String[] args){
reverse("aditya", 6);
    }
}
