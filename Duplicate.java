import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int Arr[]=new int[5];
       System.out.println("Enter the Array:");
       for(int i=0;i<Arr.length;i++){
        Arr[i]=sc.nextInt();
       }
       System.out.println("Given Array  are :"+Arrays.toString(Arr));

       for(int i=0;i<Arr.length;i++){
        for(int j=i+1;j<Arr.length;j++){
            if(Arr[i]==Arr[j]){
            System.out.println("Dublicate element in Arr :"+Arr[i]);
            }
        }

       }
    }
}
