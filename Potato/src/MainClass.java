/**
 * Project name code POTATO
 * 
 * @author Bradley How et Samuel Croteau
 */

// programming hub
public class MainClass {

	public static void main(String[] args) {
		System.out.println("yo bob");
		
		System.out.println("thats cool!");
		System.out.println("thats very cool!");
		
		FramePrincipale g = new FramePrincipale();
		Thread t = new Thread(g);
		t.start();
	}

}
