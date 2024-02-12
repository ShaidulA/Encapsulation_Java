package Demo;

public class Facebookprofileaccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook fb=new Facebook();
		System.out.println(fb.name);
		System.out.println(fb.age);
		System.out.println(fb.collegename);
		System.out.println(fb.getPhone_number());
		
		fb.setPhone_number("92531");
		System.out.println(fb.getPhone_number());

	}

}
