

import java.util.LinkedList;


public class PriorityQueue {
    LinkedList<Element> pQueue;


    public PriorityQueue(){
        pQueue=new LinkedList<Element>();
    }

    public void insert(Element element){
        pQueue.add(element);
    }

    public void min(){
        int minimal=0;
        int aktKey;
        for(Element element: pQueue){
            aktKey=element.getKey();
            if(pQueue.get(minimal).key<aktKey){
                minimal=aktKey;
            }
        }
    }
}
