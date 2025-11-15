import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int temp=num;
        int digit, rem=0;
        while (temp>0) {
            digit=temp%10;
            rem = rem * 10 + digit;
            temp = temp / 10;
        }
        if (num == rem) {
            System.out.println("Given number is Palindrome");
        } else {
            System.out.println("Given number is Not Palindrome");
        }
    }
}
