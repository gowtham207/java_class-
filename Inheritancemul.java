package Tutorial2;

class Item{
    void Div(){
        int offer=25;
        String shopping="T-naagar";
        System.out.println(shopping);
        System.out.println("T-shift,Pant,Saree");
        System.out.println(offer+75);
    }
}

class Purchase extends Item{
    void Suni(){
        System.out.println("Wedding Shopping");
    }
}

class Deliver extends Purchase{
    void Aji(){
        System.out.println("Online Diliver");
    }
}
public class Inheritancemul {
    public static void main(String[] args) {
        Deliver a=new Deliver();
        a.Aji();
        a.Suni();
        a.Div();
    }
    
}
