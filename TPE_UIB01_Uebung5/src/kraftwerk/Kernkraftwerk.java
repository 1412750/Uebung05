package kraftwerk;

import java.util.ArrayList;
import java.util.List;

public class Kernkraftwerk {
	
	public static List<Wasserelement>  wasserkreislauf;
	public static Reaktor reaktor;
	public static Pumpe pumpe;
	public static Waermetauscher tauscher1;
	public static Waermetauscher tauscher2;
	
	public static void main(String args[]) {
		wasserkreislauf = new ArrayList<Wasserelement>();
		for (int i = 0; i < 12; i++) {
			wasserkreislauf.add(new Wasserelement());
		}
		
		tauscher1 = new Waermetauscher();
		tauscher2 = new Waermetauscher();
		
		reaktor = new Reaktor();
		reaktor.start();

		Pumpe pumpe = new Pumpe();
		pumpe.start();
		
		Leitware leitware = new Leitware();
		leitware.start();
	}
}