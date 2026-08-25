import java.util.*;
class school{
    void passorfail(int mark){
        if (mark<35) {
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        school obj1 = new school();
        obj1.passorfail(mark);

    }
}