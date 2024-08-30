package statement;
import java.util.Scanner;
 public class IF_ELSE_stm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=13;
       
        if (a%2==0) {
            System.out.println("It is Even number");
        }
        else{
            System.err.println("IT is Odd number");
        }


        sc.close();
    }
     
}
