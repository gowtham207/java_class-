package Tutorial.Tutorial1;
import java.util.Scanner;
public class Arimiticdemo {
    public static void main(String[] args) 
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        
        System.out.println("1.additon");
        System.out.println("2.Substraction");
        System.out.println("3.multiple");
        System.out.println("4.division");
        int c=n.nextInt();
        if(c==1){
            System.out.println(a+b);
        }

        else if(c==2){
            System.out.println(a-b);
        }
        else if(c==3){
            System.out.println(a*b);
        }
        
        else if(c==4){
            System.out.println(a/b);
        }
        else{
            System.out.println("Wrong input");
        }
    }
    
}
