import java.util.Scanner;
class palindromestring{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String ch = s.nextLine();
        int left = 0;
        int right = ch.length() - 1;
        while(left<=right){
            if(ch.charAt(left) == ch.charAt(right)){
                left++;
                right--;
                System.out.println("palindrome");
                
            }
            else{
                 System.out.println("not palindrome");
            }
        }
        
    }
}