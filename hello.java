import java.util.Scanner;

class hello{
    public static void main(String [] args){
       Scanner s = new Scanner(System.in);
        int Tamil= s.nextInt();
        int english =  s.nextInt();
        int maths = s.nextInt();
        int science =s.nextInt();
        int social = s.nextInt();
        int avg = Tamil+english+maths+science+social/5;

        

        if(avg>35){
            System.out.println("You need to improve");
        }
        
        else{
            System.out.println("good to go");
        }

        
    }
}