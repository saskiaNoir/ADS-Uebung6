import java.util.Scanner;

public class aufg3b {
    public static void main(String []args) {

        //  String eingabe=args[0];
        String eingabe = "7531";

        String[] array = new String[eingabe.length()];
        array = eingabe.split("");


        int[] arrayInt = new int[array.length];
        int[][] spielstand = new int[4][array.length];
        int x = 3;

        for (int i = 0; i < array.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
            spielstand[i]= toBinary(arrayInt[i],x);
        }
        int zahlenmenge=arrayInt.length;



        System.out.println(testGewinn(spielstand,zahlenmenge));
        gegner(zahlenmenge,spielstand,arrayInt);

            for(int i=0;i<4;i++){
            System.out.println(" ");
            for(int j=0;j<zahlenmenge;j++){
                System.out.print(spielstand[i][j]);
            }
        }




        }

    public static int[] toBinary(int zahl,int x){
        int []befuellung=new int[4];
         while(zahl >= 2) {
                befuellung[x] = zahl % 2;
                zahl=zahl/2;
                x--;
                }
                befuellung[x] = zahl;
             return befuellung;
        }

        public static boolean testGewinn(int [][] spielstand,int zahlenmenge){
              boolean gewinnPos=false;
              int count=0;
                for(int i=0;i<4;i++){
                    count=0;
                    for(int j=0;j<zahlenmenge;j++){
                        if(spielstand[j][i]==1){
                            count++;
                        }
                    }
                    if(count%2==0){
                        gewinnPos=true;
                    }
                    else{
                        gewinnPos=false;
                        return gewinnPos;
                    }
                }
                return gewinnPos;
        }

        public static int random(int zahlenmenge){
         int randomZahl= (int)(Math.random()*(zahlenmenge));

         return randomZahl;
        }

        public static void gegner(int zahlenmenge,int [][] spielstand,int [] arrayInt) {
                int stapelInt=random(zahlenmenge);
                int stapelM=arrayInt[stapelInt];
                  if(stapelM ==0){
                      gegner(zahlenmenge,spielstand,arrayInt);
            }
            else {
                 //   String [] münzenBinS;

                int münzen= random(stapelM);
         //     münzenBinS= Integer.toBinaryString(münzen).split("");
                      int [] münzenBin= new int[4];
                      münzenBin=toBinary(münzen,3);
       //      for(int i=0;i<münzenBinS.length;i++) {
           //      münzenBin[i]=Integer.parseInt(münzenBinS[i]);
          //   }

             for(int i=0; i<4; i++){
               if((spielstand[stapelInt][i]==1) && (münzenBin[i]==1)){
                   spielstand[stapelInt][i]=0;
               }
               else if((spielstand[stapelInt][i]==0) && (münzenBin[i]==1)){
                   spielstand[stapelInt][i]=1;
               }

            }
        }


}

}