import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    int x=sc.nextInt();
    int table;

    for(int i=1;i<=10;i++){
        table=x*i;
        System.out.println(x + "*" + i + "=" + table);

    }
    }
}
