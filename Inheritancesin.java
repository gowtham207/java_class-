package Tutorial2;

class A{
    void display(){
        System.out.println("From class A");
    }

}

class B extends A{
    void screen(){
        System.out.println("Froom class B");
    }

}
public class Inheritancesin{
    public static void main(String[] args) {
        B b=new B();
        b.screen();
        b.display();
        return;
    }

}
    

