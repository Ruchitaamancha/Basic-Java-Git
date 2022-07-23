import java.util.*;
// to check if only the number is palindrome.
public class palindrome {
    public static void main(String args[]) {
        int sum=0,temp,r;
        int n =454;
        temp=n;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        if(temp == sum){
         System.out.println("Palindrome Number");
        }
        else{
        System.out.println(" a Palindrome");
        }
    }
}


// to check if the number/string is palindrome.
public class palindrome{
    public static void main(String args[]){
        String original,reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = sc.nextLine();
        int length = original.length();
        for(int i=length-1 ; i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("is palidrome "+reverse);
        }
        else{
            System.out.println("not a palindrome  "+reverse);
        }
    }

}