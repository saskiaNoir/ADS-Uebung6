package aufg3;

/**
 * aufg3b
 * 
 * @author Saskia Schwartz, Christian Zekovic, Paul Schade
 *
 */
public class aufg3b {
	public static void main(String[] args) {

		try {
			String eingabe = args[0];
			// String eingabe = "7 5 3 1";

			String[] array = new String[eingabe.length()];
			array = eingabe.split(" ");

			int[] arrayInt = new int[array.length];
			int[][] spielstand = new int[array.length][4];
			int x = 3;
			int falseIndex = 0;

			for (int i = 0; i < array.length; i++) {
				arrayInt[i] = Integer.parseInt(array[i]);
				spielstand[i] = toBinary(arrayInt[i], x);
			}
			int zahlenmenge = arrayInt.length;

			System.out.println("So sieht unser Array am Anfang aus:  ");
			for (int i = 0; i < zahlenmenge; i++) {
				System.out.println(" ");
				for (int j = 0; j < 4; j++) {
					System.out.print(spielstand[i][j]);
				}
			}
			System.out.println("");

			System.out.println(testGewinn(spielstand, zahlenmenge, falseIndex));
			falseIndex = 0;
			gegner(zahlenmenge, spielstand, arrayInt);

			System.out.println("");
			System.out.println("nach beliebigen Zug des Gegners sieht der Array so aus: ");
			for (int i = 0; i < zahlenmenge; i++) {
				System.out.println(" ");
				for (int j = 0; j < 4; j++) {
					System.out.print(spielstand[i][j]);
				}
			}
			System.out.println("");

			optimalZug(spielstand, arrayInt, zahlenmenge, falseIndex);
			falseIndex = 0;

			System.out.println("");
			System.out.println("Unser optimaler Zug: ");
			for (int i = 0; i < zahlenmenge; i++) {
				System.out.println(" ");
				for (int j = 0; j < 4; j++) {
					System.out.print(spielstand[i][j]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int[] toBinary(int zahl, int x) {
		int[] befuellung = new int[4];
		while (zahl >= 2) {
			befuellung[x] = zahl % 2;
			zahl = zahl / 2;
			x--;
		}
		befuellung[x] = zahl;
		return befuellung;
	}

	public static boolean testGewinn(int[][] spielstand, int zahlenmenge, int falseIndex) {
		boolean gewinnPos = false;
		int count = 0;
		for (int i = 0; i < 4; i++) {
			count = 0;
			for (int j = 0; j < zahlenmenge; j++) {
				if (spielstand[j][i] == 1) {
					count++;
				}
			}
			if (count % 2 == 0) {
				gewinnPos = true;
			} else {
				gewinnPos = false;
				falseIndex = i;
				return gewinnPos;
			}
		}
		return gewinnPos;
	}

	public static int random(int zahlenmenge) {
		int randomZahl = (int) (Math.random() * (zahlenmenge - 1) + 1);

		return randomZahl;
	}

	public static void gegner(int zahlenmenge, int[][] spielstand, int[] arrayInt) {
		int stapel = random(zahlenmenge);
		int stapelM = arrayInt[stapel];
		if (stapelM == 0) {
			gegner(zahlenmenge, spielstand, arrayInt);
		} else {

			int münzen = random(stapelM);
			if (münzen > stapelM) {
				gegner(zahlenmenge, spielstand, arrayInt);
			} else {
				arrayInt[stapel] = stapelM - münzen;
				spielstand[stapel] = toBinary(arrayInt[stapel], 3);

			}
		}
	}

	public static void optimalZug(int[][] spielstand, int[] arrayInt, int zahlenmenge, int falseIndex) {

		if (testGewinn(spielstand, zahlenmenge, falseIndex) == true) {
			int stapel = random(zahlenmenge);
			if (arrayInt[stapel] >= 2) {
				arrayInt[stapel] = arrayInt[stapel] - 2;
				spielstand[stapel] = toBinary(arrayInt[stapel], 3);
			} else {
				optimalZug(spielstand, arrayInt, zahlenmenge, falseIndex);
			}
		} else {

			if (arrayInt[falseIndex] >= 1) {
				arrayInt[falseIndex] = arrayInt[falseIndex] - 1;
				spielstand[falseIndex] = toBinary(arrayInt[falseIndex], 3);
			} else {
				optimalZug(spielstand, arrayInt, zahlenmenge, falseIndex);
			}
		}

	}

}