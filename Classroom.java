
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wilder wilder1 = new Wilder("Jean-Claude", true);
		Wilder wilder2 = new Wilder("Bruce", true);
		Wilder wilder3 = new Wilder("Chuck", false);
		
		System.out.println(wilder1.whoAmI());
		System.out.println(wilder2.whoAmI());
		System.out.println(wilder3.whoAmI());
	}

}
