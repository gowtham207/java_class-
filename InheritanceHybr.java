package Tutorial2;

class Item{
    void Div(){
        int offer=25;
        System.out.println("--------------------------");
        String shopping="T-naagar";
        System.out.println(shopping);
        System.out.println("T-shift:Pant:Saree");
        System.out.println(offer+75);
        System.out.println("-------------------------------");
    }
}

class Purchase extends Item{
    void Suni(){
        System.out.println("Wedding Shopping");
    }
}

class Deliver extends Item{
    void Aji(){
        System.out.println("Online Diliver");
    }
}

public class InheritanceHybr {
public static void main(String[] args) {
    Deliver a=new Deliver();
    a.Aji();
    a.Div();
    
}    
}
