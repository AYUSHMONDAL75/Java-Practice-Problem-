
import java.util.Scanner;

public class pallindrome_numbr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for checking palindrome: ");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(temp==sum){
            System.out.println(temp+" is a pallindrome number");
        }else{
            System.out.println(temp+" is a not pallindrome number");
        }
    }
}