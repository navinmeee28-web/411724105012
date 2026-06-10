public class Palindrome_pattern1{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            for(int k=i+1;k<=2*i-1;k++){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}