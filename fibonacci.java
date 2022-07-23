
public class fibonacci {
    public static void main(String args[]){
        int n0=0,n1=1,count=30;
        System.out.print(n0+" "+n1);
        for(int i=2;i<count;i++){
            int n2=n0+n1;
            System.out.print(" "+n2);
            n0=n1;
            n1=n2;
        }
    }
}

// using recursion in java
public class fibonacci {
    static int n0=0,n1=1,n2=0;
    public static void printFibonacci(int count){
        if(count>0){
            n2=n0+n1;
            n0=n1;
            n1=n2;
            System.out.print(" "+n2);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        int count=10;
        System.out.print(n0+" "+n1); //printing 0 and 1
        printFibonacci(count-2);  //n-2 because 2 numbers are already printed   

    }
public class fibonacci {
    public static void main(String args[]){
        int n0=0,n1=1,count=30;
        System.out.print(n0+" "+n1);
        for(int i=2;i<count;i++){
            int n2=n0+n1;
            System.out.print(" "+n2);
            n0=n1;
            n1=n2;
        }
    }
}

// using recursion in java
public class fibonacci {
    static int n0=0,n1=1,n2=0;
    public static void printFibonacci(int count){
        if(count>0){
            n2=n0+n1;
            n0=n1;
            n1=n2;
            System.out.print(" "+n2);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        int count=10;
        System.out.print(n0+" "+n1); //printing 0 and 1
        printFibonacci(count-2);  //n-2 because 2 numbers are already printed   

    }

}