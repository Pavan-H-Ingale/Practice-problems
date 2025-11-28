import java.util.Arrays;

public class Arrayrev {
    public static void main(String[] args) {
        

        int arr[]={15,58,65,32,56,25};
        System.out.println("Given Array is:"+Arrays.toString(arr));


        for (int i=arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }
    }
}
