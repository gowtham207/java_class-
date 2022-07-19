package Tutorial.Tutorial1;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("Enter the class 1:");
        
        
        int a=h.nextInt();
        System.out.println("Enter the class2:");
        int b=h.nextInt();
        if(a==b)
        {
            System.out.println("divya");         //ddout
        
        if(a!=b)
        {
            System.out.println("sunitha");
        }
        else if(a>=20)
        {
            System.out.println("ajith");
        }
        else{
            System.out.println("gowtham");
        }
        
    }
    
}
}