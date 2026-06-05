import java.util.Scanner;
public class area_of_rectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area=l*b;
        System.out.println(area);
        sc.close();
    }
}