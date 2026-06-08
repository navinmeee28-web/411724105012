import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[10];
        int count1=0;
        int count2=0;
        int sum=0;
        int avg;
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+marks[i];
            if(marks[i]%2==0){
                count1=count1+1;
            }
            else{
                count2=count2+1;
            }
        }
        avg=sum/n;
        System.out.println("Even Number Count:"+count1);
        System.out.println("Odd Number Count:"+count2);
        System.out.println("Sum of this Array is "+sum);
        System.out.println("Average of this Array is "+avg);
        System.out.println("The Reverse order of this Array is");
        for(int i=n-1;i>=0;i--){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        int max=marks[0];
        int min=marks[0];
        int max1=marks[0];
        for(int i=0;i<n;i++){
            if(max<marks[i]){
                max1=max;
                max=marks[i];
            }
            if(min>marks[i]){
                min=marks[i];
            }
        }
        System.out.println("Greatest Number of the Array:"+max);
        System.out.println("Second Greatest Number of the Array:"+max1);
        System.out.println("Smallest Number of the Array:"+min);
        System.out.println("Enter the searching element:");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(marks[i]==x){
                count++;
            }
        }
        System.out.println("count of "+x+" is "+count);
        sc.close();
    }
}