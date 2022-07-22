import java.util.Scanner;
class factorial{
	public static int factorials(int n){
		int fact=1;
		for(int i=n;i>0;i--){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int fact=factorials(n);
		System.out.println("Factorial is "+fact );
	}
}