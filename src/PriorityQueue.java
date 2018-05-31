

import java.util.LinkedList;


public class PriorityQueue {
    LinkedList<Element> pQueue;


    public PriorityQueue(){
        pQueue=new LinkedList<Element>();
    }

    public void insert(Element element){
        pQueue.add(element);
    }

    public String min(){
        Element minimal=pQueue.get(0);
        Element aktKey;
        for(Element element: pQueue){
            aktKey=element;
            if(minimal.key>aktKey.key){
                minimal=aktKey;
            }
        }
        return minimal.element;
    }
}
