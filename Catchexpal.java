package Tutorial1;

public class Catchexpal {
    public static void main(String[] args) {
        int a=0,b=10;
        try {
            System.out.println(b/a);
        } catch (ArithmeticException e) {
            System.out.println("error  occured");
            //TODO: handle exception
        }

    }
    
}
