package aufg1;

import de.medieninf.ads.ADSTool;

public class Controller {
	public static void main(String[] args) {

		try {
			String args1 = args[0];

			String array[] = ADSTool.readWordArray(args1);
			PriorityQueue pQueue = new PriorityQueue();

			for (String element : array) {
				pQueue.insert(new Element(element));
				// System.out.println(element);
			}

			for (int j = 0; j < pQueue.length(); j++) {

				System.out.println(pQueue.min());
				pQueue.getMin();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
