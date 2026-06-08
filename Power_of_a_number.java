import java.util.Scanner;
 public class Power_of_a_number{  
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int x=1<<N;
         System.out.println(x);
         sc.close();
     }
    }