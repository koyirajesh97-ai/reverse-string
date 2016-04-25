import java.util.Scanner;

public class ReverseString {
// reviewed
// todo: optimize
    public static void main(String[] args){
    // moved code around
        Scanner sc = new Scanner(System.in);
        // todo: add unit test
        System.out.println("enter string");
        // testing
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println("reversed string: " + rev);
        // note: only positive numbers
        sc.close();
    }
}
