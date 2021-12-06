package plural.flyweight;

public class FlyweightInventoryDemo {

	public static void main(String[] args) {
		InventorySystem ims = new InventorySystem();
		long start = System.currentTimeMillis();
		ims.takeOrder("Roomba", 221);
		ims.takeOrder("Bose Headphones", 361);
		ims.takeOrder("Samsung TV", 432);
		ims.takeOrder("Roomba", 563);
		ims.process();
		
		System.out.println(ims.report());
		long end = System.currentTimeMillis();
		long tempo = end - start ;
		System.out.println(tempo);
	}
}
