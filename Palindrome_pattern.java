import java.util.Scanner;
public class Palindrome_pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int k=1;k<=i;k++){
                System.out.print(ch);
                ch++;
            }
            for(int k=i+1;i<2*i-1;k++){
                ch--;
                System.out.print(ch);
            }
        }
        System.out.println();
        sc.close();
    }
}