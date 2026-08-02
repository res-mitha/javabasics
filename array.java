import java.util.Scanner;
class array{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] res = new int[size];
        for(int i=0;i<size;i++){
           res[i] = s.nextInt(); 
        }
        if (res.length %2 == 0){
            System.out.println("The middle element of the array:");
            System.out.println(res[res.length/2-1] + "and" + res[res.length/2]);
        }
        else{
            System.out.println(res[res.length/2]);
        }
        
    }
}