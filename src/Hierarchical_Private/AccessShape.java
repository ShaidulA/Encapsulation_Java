package Hierarchical_Private;

public class AccessShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.getColor();
		r.getArea();
		System.out.println(r.getColor());
		System.out.println(r.getArea());
		
		Square s=new Square();
		s.getColor();
		s.getArea();
		System.out.println(s.getColor());
		System.out.println(s.getArea());
		
		Triangle t=new Triangle();
		t.getColor();
		t.getArea();
		System.out.println(t.getColor());
		System.out.println(t.getArea());
		
		r.setArea(52);
		System.out.println(t.getArea());
		
		s.setArea(25);
		System.out.println(s.getArea());
		
		t.setColor("Black");
		System.out.println(t.getColor());
	

	}

}
