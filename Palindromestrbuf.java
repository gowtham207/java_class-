public class Palindromestrbuf {
    public static void main(String[] args) {
        String a="madam";
        StringBuffer b=new StringBuffer(a);
        b.reverse();
        if(a.equals(b.toString()))
        {
            System.out.println("palindrome");

        }
        else{
            System.out.println("not a palindrome");
        }
        
    }
}
