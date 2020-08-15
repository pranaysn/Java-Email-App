package emailapp;

public class EmaiApp {

	public static void main(String[] args) {

		Email em1 = new Email();
//		em1.setAltMail("prn@gmail.com");
//		System.out.println(em1.getAltMail());
		// System.out.println("Show Info");
		em1.flow();
		System.out.println(em1.showInfo());

	}

}
