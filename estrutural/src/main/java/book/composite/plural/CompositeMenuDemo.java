package book.composite.plural;




public class CompositeMenuDemo {

	public static void main(String[] args) {
		
		Menu mainMenu = new Menu("Main", "/main");
		
		Menu safetyMenuItem = new Menu("Safety", "/safety");

		MenuItem elias = new MenuItem("Elias", "/elias");



		safetyMenuItem.add(elias);

		System.out.println(safetyMenuItem.toString());
		
//		mainMenu.add(safetyMenuItem);
//
//		Menu claimsSubMenu = new Menu("Claims", "/claims");
//
//		mainMenu.add(claimsSubMenu);
//
//		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
//
//		claimsSubMenu.add(personalClaimsMenu);
//
//		System.out.println(mainMenu.toString());
	}
}
