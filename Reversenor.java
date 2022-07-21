public class Reversenor {
    public static void main(String[] args) {
        int n = 121;
        int r=0,rem;
        while(n!=0){
            rem=n%10;
            r=(r*10)+rem;
            n=n/10;
        }
            System.out.println(r);
    }
    
}
