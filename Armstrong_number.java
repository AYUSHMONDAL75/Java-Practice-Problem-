import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter number of terms: ");
    //     int n=sc.nextInt();
    //     System.out.println("Enter number for checking Armstrong: ");
    //     int num=sc.nextInt();
    //     int sum=0;
    //     int temp=num;
    //     while(num!=0){
    //         int rem=num%10;
    //         sum=sum+(rem*rem*rem);
    //         num=num/10;
    //     }
    //     if(temp==sum){
    //         System.out.println(temp+" is Armstrong number");
    //     }else{
    //         System.out.println(temp+" is not Armstrong number");
    //     }

    
    // For checking Amstrong number
        System.out.println("Enter number of terms for checking Amstrong number: ");
        int n=sc.nextInt();
        System.out.println("Pallindrome numbers are from 1 to "+n);
        for(int i=1;i<=n;i++){
            int num=i;
            int sum=0;
            while(num!=0){
                int rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }
            if(sum==i){
                System.out.println(i+" ");
            }
        }
    }
}