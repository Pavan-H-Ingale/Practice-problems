import java.util.Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int arr[]={42,52,36,25,65,89,45,86};
        int max=arr[0];
        int smax=arr[0];
        System.out.println("Given Array are :"+Arrays.toString(arr));

        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
        }
        else if(arr[i]>smax && smax!=max){
                smax=arr[i];
        }

        }
            System.out.println("Maximum number in arr are :"+max);
            System.out.println("Second Maximum number in arr are :"+smax);
        
    }
}
