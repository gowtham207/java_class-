package Tutorial1;

public class Finalexplas {
    public static void main(String[] args) {
        int a[]=new int[6];

        try {
            a[10]=5/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            //TODO: handle exception
        }catch(Exception e){
            System.out.println(e);
            
        }
        finally{
            System.out.println("error one");
        }
    }
    
}
