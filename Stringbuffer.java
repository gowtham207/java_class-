package training;

public class Stringbuffer {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("sunitha");
		a.append("divya");
		System.out.println(a);
		StringBuffer b=new StringBuffer("Ajith");
		b.insert(5,"a");
		System.out.println(b);
		StringBuffer c=new StringBuffer("Ajitha");
		c.delete(1,3);
		System.out.println(c);
		StringBuffer d=new StringBuffer("Ajith");
		d.reverse();
		System.out.println(d);
		StringBuffer e=new StringBuffer("pooopo");
		e.replace(1,4,"aaaa");
		System.out.println(e);


	}

}
