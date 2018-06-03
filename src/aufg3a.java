
public class aufg3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	// umwandeln in binaer
	public static String toBinary(int zahl){
		if(zahl < 2){
			return "" + zahl;
		}else{
			return toBinary(zahl/2) + zahl%2;
		}
	}
	
	// umdrehen der strings um spaeter Nullen nicht zu verlieren
	public static String reverseString(String bin) {
		String reversed = "";
		
		 for( int j = bin.length()-1; j >= 0; j-- ) {
		      reversed += bin.charAt(j);
		 } 
		 
		 return reversed;
	}




	public boolean gewinnPosition( int a, int b, int c, int d){
		
		boolean gewinn = false;
		int binLength = 0;
		int counter=0;
		int geradeAnz=0;
		
		
		String[] table = { toBinary(a), toBinary(b), toBinary(c), toBinary(d)};
		
		// finde groesste Anzahl der Ziffern der Binaerzahlen
		for(int i=0; i< table.length; i++) { 
			if(table[i].length()>= binLength) {
				binLength = table[i].length();
			}	
		}
		
		// fuellt die Binaerzahl mit Nullen auf falls notwendig
		for(int i= 0; i< table.length; i++) {
			while(table[i].length() < binLength) {
				table[i] = "0" + table[i];
			}
		}
		
		int [][] binTable = new int[binLength][binLength];
		
		
		for(int i=0; i< table.length; i++) {
			for(int j=0; j<binTable.length; j++ ) {
				
			}
			
		}
	

		
		
		return gewinn;
		
		
	
		
		
		
	}
	
}