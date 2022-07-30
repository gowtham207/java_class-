package Tutorial2;

class Bank{
    void Run(){
        System.out.println("interet");
    }
}
class Sbi extends Bank{
    void Run(){
        System.out.println("sbi interest");
    }
}
class Icici extends Bank{
    void Run(){
        System.out.println("icici interest");
    }
}
class Iob extends Bank{
    void Run(){
        System.out.println("iob interest");
    }
}
public class Polyover {
public static void main(String[] args) {
    Bank b=new Bank();
    Iob a=new Iob();
    Sbi s=new Sbi();
    Icici c=new Icici();
    a.Run();
    s.Run();
    c.Run();
    b.Run();
    

}    
}
