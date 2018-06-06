package aufg2;

import de.medieninf.ads.ADSTool;

public class aufg2 {
	public static void main(String[] args) {

		try {
			String args1 = args[0];

			int z1 = 0;
			int z2 = 0;
			int sub = 0;
			int x = 5260;
			int erga = -1;
			int ergebB = -1;

			int array[] = ADSTool.readIntArray(args1);
			// int array2 []={2,3,5,7,11,15,20};

			for (int i = array.length - 1; i > z1; i--) {
				z1 = 0;
				z2 = array[i];
				if (z2 <= x) {
					erga = rechne2(z1, z2, sub, erga, x, array);
					if (erga >= 0) {
						ergebB = z2;
						System.out.println("a: " + erga + "   b: " + ergebB + "  ergibt: " + x);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int rechne2(int z1, int z2, int sub, int erga, int x, int[] array) {

		sub = x - array[z1];
		if (z2 == sub) {

			return array[z1];
		} else if (sub > z2) {
			return rechne2(z1 + 1, z2, sub, erga, x, array);
		} else {
			return rechne2(z1, z2 - 1, sub, erga, x, array);
		}
	}
}
