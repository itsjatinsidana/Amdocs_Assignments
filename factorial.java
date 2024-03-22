public class factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }
    
    public static int fact(int num){
        if((num ==0) || (num==1)){
         return 1;
        }
        else{
            return num * fact(num-1);
        }
     }
}
