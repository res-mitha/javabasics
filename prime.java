import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%1==0 && n%n==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}