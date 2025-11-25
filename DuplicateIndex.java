import java.util.*;

public class DuplicateIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array :");
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given Array Are :"+Arrays.toString(arr));
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                System.out.println("Duplicate Element: " + arr[i]);
                System.out.println("First Index is: " + map.get(arr[i]));
                System.out.println("Second Index is: " + i);
                return;
            } else {
                map.put(arr[i], i);
            }
        }
    }
}

