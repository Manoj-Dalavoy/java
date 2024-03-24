 import java.util.Scanner;
class prime{
    public void Allprime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first letter: ");
        int Start=sc.nextInt();
        System.out.println("Enter the last number letter: ");
        int end=sc.nextInt();
        int count=0;
        for(int i=Start;i<=end;i++){
            if(i%2==0){
                System.err.println(i+" is a prime number");
                count++;
            }
        }
        System.out.println("Total prime numbers are: "+count);
        sc.close();
    }
}

public class allprime {
         public static void main(String []args){
            prime r=new prime();
            r.Allprime();

    }
}
