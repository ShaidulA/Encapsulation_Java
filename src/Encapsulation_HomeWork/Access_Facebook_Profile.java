package Encapsulation_HomeWork;

public class Access_Facebook_Profile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook fb=new Facebook();
		fb.getAge();
		fb.getMarital_status();
		fb.getPhone_number();
		
		System.out.println(fb.name);
		System.out.println(fb.getAge());
		System.out.println(fb.getMarital_status());
		System.out.println(fb.getPhone_number());
		
		fb.setAge(41);
		System.out.println(fb.getAge());
		
		fb.setMarital_status("M");
		System.out.println(fb.getMarital_status());
		
		fb.setPhone_number("236598");
		System.out.println(fb.getPhone_number());

	}

}
