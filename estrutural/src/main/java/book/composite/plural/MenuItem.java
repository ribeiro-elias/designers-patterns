package book.composite.plural;


public class MenuItem extends MenuComponent {

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public String toString() {
		return print("Item",this);
	}
}
