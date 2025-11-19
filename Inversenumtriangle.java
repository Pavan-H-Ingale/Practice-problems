import java.util.Scanner;
public class Inversenumtriangle {
    public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the num");
      int num=sc.nextInt();

       for(int i=1;i<=num;i++){

        for(int j=0;j<=num-i;j++){
            System.out.print(i);
        }
        System.out.println(" ");
       }

    }
}

