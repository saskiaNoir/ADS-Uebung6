public class Element {

    int key;
    String element;


    public Element(String element){
        this.element=element;
        key=element.length();
    }

    public int getKey(){
        return key;
    }


}
