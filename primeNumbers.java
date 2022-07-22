import java.util.*;


// This finds prime numbers of a single number
public class primeNumbers {
    public static void checkPrimeNo(int n){
        int m=0,flag=0;
        m=n/2;
        if(n==0 || n==1){
            System.out.println(n+ " is not prime number");
        }
        else{
            for(int i=2;i<=m;i++){
                if((n%i)== 0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println(n+" is prime number");
        }
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       int n=sc.nextInt();
       checkPrimeNo(n);
    }
}



// Find prime numbers between two numbers eg: From 1 to 100
public class primeNumbers{
        public static boolean isPrimeNo(int x) {
            if(x<=1){
                return false;
            }
            for(int i=2;i<=Math.sqrt(x);i++){
                if((x%i)==0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter starting number:");
            int start = sc.nextInt();
            System.out.println("enter last number:");
            int last = sc.nextInt();
            System.out.println("List of prime numbers from "+start+" and "+last+" is:");
            for(int i=start;i<=last;i++){
                if(isPrimeNo(i)){ // if(isPrimeNo(i) == false)
                    System.out.println(i);
                }
            }
        }
}
