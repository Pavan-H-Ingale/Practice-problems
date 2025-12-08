public class revString {
    public static void main(String[] args) {
        String name="I am  Pavan";
        String res="";
        System.out.println(name);


        for(int i=name.length()-1;i>=0;i--){
            res= res+name.charAt(i);


        }

        System.out.println(res);
    }
}
