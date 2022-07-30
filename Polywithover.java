package Tutorial2;

class Bank{
    void interest(){
        System.out.println("less Interest");
    }
}
class Sbi extends Bank{
    void Interest(){
        System.out.println("high Interest");
    }
}
public class Polywithover {
    public static void main(String[] args) {
        Sbi a=new Sbi();
        a.Interest();

    }
}
