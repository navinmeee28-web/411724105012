// import java.util.Scanner;
// public class count_the_numbers{  
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int count=0;
//         while(N>0){
//             int i=N%10;
//             if(i%2==0){
//                 count=count+1;
//             }
//             N=N/10;
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class count_the_numbers{  
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int count=0;
//         while(N>0){
//             int i=N%10;
//             count=count+1;
//             N=N/10;
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


import java.util.Scanner;
 public class count_the_numbers{  
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int rev=0;
         int temp=N;
         int i;
         while(N>0){
            i=N%10;
            rev=rev*10+i;
            N=N/10;
         }
         System.out.println(rev);
         if(rev==temp){
            System.out.println("palindrome");
         }
         else{
            System.out.println("Not palindrome");
         }
         sc.close();
    }
}
