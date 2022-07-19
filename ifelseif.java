package Tutorial.Tutorial1;
import java.util.Scanner;
public class ifelseif {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int s=100;
        int m=z.nextInt();
        if(m>=90 && m<=100)
        {
            System.out.println("Grade A");
        }
        else if(m>=65 && m<90)
        {
            System.out.println("Grade B");
        }
        else{
            System.out.println("fail");
        }
    }
    
}
