package kraftwerk;

import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse Kernkraftwerk beinahltet die notwendigen Elemente: den Reaktor,
 * die Pumpe, die Wärmetauscher, usw.
 * 
 * @author Sovann Som 1326670
 * @author Maximilian Czerwonka 1415407
 * @author Stephen Kessler 1412750
 * @version JDK8.0
 */
public class Kernkraftwerk {

	
	public static List<Wasserelement> wasserkreislauf;

	
	public static Reaktor reaktor;

	
	public static Pumpe pumpe;

	
	public static Waermetauscher tauscher1;

	
	public static Waermetauscher tauscher2;

	/**
	 * Hier in der Main findet unsere Simulation statt. Hier wird die Pumpe für
	 * den Antrieb des Reaktors gestartet.
	 *
	 * @param 
	 *           
	 */
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