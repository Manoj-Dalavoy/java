import java.util.Scanner;
class prime{
    public void Allprime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Num: ");
        int Start=sc.nextInt();
        if(Start%2==0){
            System.out.println(Start+" is Even");
        }
        else{
            System.out.println(Start+" is Odd");
        }
        sc.close();
    }
}

public class evenodd {
         public static void main(String []args){
            prime r=new prime();
            r.Allprime();

    }
}

