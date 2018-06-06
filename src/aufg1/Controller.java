package aufg1;
import de.medieninf.ads.ADSTool;

public class Controller {
	public static void main(String[] args) {

		int i = 0;
		String array[] = ADSTool.readWordArray("words.dat");
		PriorityQueue pQueue = new PriorityQueue();
		for (String element : array) {
			i++;
			pQueue.insert(new Element(element));
			// System.out.println(element);
		}

		for (int j = 0; j < pQueue.length(); i++) {

			System.out.println(pQueue.min());
			pQueue.getMin();

		}

	}
}
