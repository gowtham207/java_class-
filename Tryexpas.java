package Tutorial1;

public class Tryexpas {
    public static void main(String[] args) {
        int a=10,b=0;
        int c=0;
        try{
            c=a/b;
        }
        catch(Exception e){
            System.out.println("Error");
        }
        System.out.println(c);
    }
}
