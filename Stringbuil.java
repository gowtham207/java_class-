package Tutiroal;

public class Stringbuil {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub		
		StringBuilder a=new StringBuilder("sunitha");
		a.append(" divya");
		System.out.println(a);
		StringBuilder b=new StringBuilder("Ajith");
		b.insert(5,"a");
		System.out.println(b);
		StringBuilder c=new StringBuilder("Ajitha");
		c.delete(1,3);
		System.out.println(c);
		StringBuilder d=new StringBuilder("Ajith");
		d.reverse();
		System.out.println(d);
		StringBuilder e=new StringBuilder("pooopo");
		e.replace(1,4,"aaaa");
		System.out.println(e);
	}

}
