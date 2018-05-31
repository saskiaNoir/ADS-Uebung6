import de.medieninf.ads.ADSTool;

import java.util.Scanner;

public class Controller {
    public static void main(String []args) {
        int i=0;
        String array[] = ADSTool.readWordArray("words.dat");
        PriorityQueue pQueue= new PriorityQueue();
        for (String element :array){
            i++;
            pQueue.insert(new Element(element));
     //       System.out.println(element);
        }

       System.out.println("Das Element mit der höchsten Priorität ist:  "+pQueue.min());



    }
}
