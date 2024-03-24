import java.util.Scanner;
class B{
    public void main(){
        System.out.println("Enter the number for which you need the factorial: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int Factorial=1;
        if(num<=1){
            System.out.println("The Factorial of the number is: 1");
        }
        else if(num>1){
            for(int i=1;i<=num;i++){
                Factorial*=i;
            }
            System.out.println("The Factorial of the number is: "+Factorial);
        }
      
        sc.close();
    }
}

public class factorial {
    public static void main(String[] args) {
    B r=new B();
    r.main();
}
}
