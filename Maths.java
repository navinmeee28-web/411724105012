import java.util.*;
public class Maths{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
      
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("Maximum:"+Math.max(a,b));
        System.out.println("Minimum:"+Math.min(a,b));
        System.out.println("Absolute value:"+Math.abs(a));
        System.out.println("power value:"+Math.pow(a,b));
        System.out.println("round off:"+Math.round(a));
        System.out.println("ceil value:"+Math.ceil(a));
        System.out.println("floor value:"+Math.floor(a));
        System.out.println("Square root:"+Math.sqrt(a));
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }
        n=temp;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        n=temp;
        int sum1=0;
        while(n>0){
            int digit=n%10;
            sum1=sum1+(int)Math.pow(digit,count);
            n=n/10;
        }
        if(sum1==temp){
            System.out.println(temp+" is a armstrong number");
        }
        else{
            System.out.println(temp+" is not a armstrong number");
        }
        n=temp;
        // int count1=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count1++;
        //     }
        // }
        // if(count1==2){
        //     System.out.println(n+" is a prime number");
        // }
        // else{
        //     System.out.println(n+" is not a prime number");
        // }
        boolean check=true;
        if(n<=1){
            System.out.println(n+" is not a prime number");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                check=false;
                break;
            }
        }
        if(check){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        sc.close();
    }
}