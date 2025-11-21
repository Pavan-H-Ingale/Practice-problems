import java.util.Arrays;
import java.util.Scanner;

public class AddArr {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int sum=0;
       int Arr[]=new int[5];
       System.out.println("Enter the Array:");
       for(int i=0;i<Arr.length;i++){
        Arr[i]=sc.nextInt();
       }
       System.out.println("Given Array  are :"+Arrays.toString(Arr));

       for(int i=0;i<Arr.length;i++){
        sum=sum+Arr[i];
       }
       System.out.println("Sum of Givem Arr is "+sum);
    }
}
