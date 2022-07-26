package Tutorial1;

public class multicatch {
    public static void main(String[] args) {
        int a[]=new int[6];

        try {
            a[10]=5/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            //TODO: handle exception
        }catch(ArithmeticException e){
            System.out.println(e);
            
        }
    }
    
}
