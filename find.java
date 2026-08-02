import java.util.*;

class find{
       void evenorodd(int num){
        if(num%2==0){
          System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


       }


       public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
       int num = sc.nextInt();
       find obj1 = new find();
       obj1.evenorodd(num);
    }
}