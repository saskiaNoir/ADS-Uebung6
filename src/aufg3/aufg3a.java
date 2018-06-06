package aufg3;

public class aufg3a {

	public static void main(String []args){

		int a=7;
		int b=5;
		int c=3;
		int d=1;
		//  int [][][][] tabelle= new int [4][4][4][4];
		int []befuellungA=new int [a];
		int []befuellungB=new int [b];
		int []befuellungC=new int [c];
		int []befuellungD=new int [d];
		//    int x=3;
		boolean [][][][] tabelle2= new boolean [a][b][c][d];
		toBinary(a,befuellungA,a-1);
		toBinary(b,befuellungB,b-1);
		toBinary(c,befuellungC,c-1);
		toBinary(d,befuellungD,d-1);

		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				for(int k=0;k<c;k++){
					for(int l=0;l<d;l++){
						if((befuellungA[i]+befuellungB[j]+befuellungC[k]+befuellungD[l])%2==0){
							tabelle2[i][j][k][l]=true;
						}
						else{
							tabelle2[i][j][k][l]=false;
						}
						System.out.println("Position an "+(i+1)+" "+(j+1)+" "+(k+1)+" "+(l+1)+":  "+tabelle2[i][j][k][l]);
					}
				}
			}
		}




     /*   for(int a=0;a<4;a++){
            toBinary(7,befuellungA,x);
            tabelle[a][0][0][0]=befuellungA[a];
            for(int b=0;b<4;b++){
                toBinary(5,befuellungB,x);
                tabelle[a][0][0][b]=befuellungB[b];
                for(int c=0;c<4;c++){
                    for(int d=0;d<4;d++){

                    }
                }

            }
        } */

	}

	public static void toBinary(int zahl,int [] befuellung,int x){

		if(zahl<2){
			befuellung[x]=zahl;
		}
		else{befuellung[x]=+zahl%2;
			toBinary(zahl/2,befuellung,x-1);
		}




	}
}
