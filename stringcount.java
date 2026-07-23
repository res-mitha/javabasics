import java.util.Scanner;
class stringcount{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String ch = s.nextLine();
        int count = 0;
        for (int i=0;i<ch.length();i++){
            count++;
        }
      System.out.println(count);
    }
}