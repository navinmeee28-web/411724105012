import java.util.Scanner;

public class Count1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='x'){
                count++;
            }
        }
        System.out.println("COUNT:"+count);
        sc.close();
    }
}