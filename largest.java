import java.util.Arrays;

public class largest {
    public static void main(String[] args) {
        int Arr[]={45,25,36,25,55,85,65};
        int max=Arr[0];
        int min=Arr[0];
    System.out.println("Given Array are:"+ Arrays.toString(Arr));
        
        for(int i=0;i<Arr.length;i++){
           if(Arr[i]>max){
            max=Arr[i];
           }
            if(Arr[i]<min){
            min=Arr[i];
           }
         }
         System.out.println("Maximum number in Array are :"+max);
         System.out.println("Minimum number in Array are :"+min);
            
    }



}


