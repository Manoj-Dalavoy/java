import java.util.Scanner;
class A{
    public void main(){
        System.out.println("Enter the any key: ");
        Scanner c=new Scanner(System.in);
        char r=c.next().charAt(0);
        if((r>='a' && r<='z')||(r>='A' && r<='Z')){
            System.out.println(r+" is an Alphabet");
        }
        else{
            System.out.println(r+"is not an Alphabet");
        }
        c.close();
    }
}

public class Alphabet {
    public static void main(String []args){
        A r=new A();
        r.main();
    }
    
}
