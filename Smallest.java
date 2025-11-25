import java.util.*;

public class Smallest {
    public static void main(String[] args) {
       int arr[]={45,52,21,24,85,96};
        int min=arr[0];
        int smin=arr[0];
     
        System.out.println("Given array is :"+ Arrays.toString(arr));

        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
                
            }
             else if(arr[i]<smin && smin!=min){
                smin=arr[i];
            }

        }

        System.out.println("Smallest  number in Given Array :"+min);
        System.out.println("Second Smallest number in Given Array :"+smin);
    }
}
