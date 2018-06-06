package aufg1;


import java.util.LinkedList;


public class PriorityQueue <T extends Element>{
    LinkedList<Element> pQueue;
    Element minElement;
    Element zwischenspeicher;


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
        minElement=minimal;
        return minimal.content;
    }

    public void getMin(){

        zwischenspeicher=minElement;
        pQueue.remove(minElement);


    }

    public void replaceMin(Element x){
        min();
      int index=  pQueue.indexOf(minElement);
        pQueue.set(index,x);
        minElement=null;
        System.out.println(pQueue.get(index).content);
    }

    public int length(){
        return pQueue.size();
    }
}
