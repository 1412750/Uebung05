package kraftwerk;

import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse Kernkraftwerk beinahltet die notwendigen Elemente: den Reaktor,
 * die Pumpe, die Wärmetauscher, usw.
 * 
 * @author tomi
 *
 */
public class Kernkraftwerk {

	/** The wasserkreislauf. */
	public static List<Wasserelement> wasserkreislauf;

	/** The reaktor. */
	public static Reaktor reaktor;

	/** The pumpe. */
	public static Pumpe pumpe;

	/** The tauscher1. */
	public static Waermetauscher tauscher1;

	/** The tauscher2. */
	public static Waermetauscher tauscher2;

	/**
	 * Hier in der Main findet usnere Simulation statt. Hier wird die Pumpe für
	 * den Antrieb des Reaktors gestartet.
	 *
	 * @param args
	 *            the arguments
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