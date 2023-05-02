package ZapocetPriprava;
public class Uzel {
    private char Data;
    private Uzel next;
    private Uzel prev;

    public Uzel(char Data){
        this.Data = Data;
        next = null;
        prev = null;
    }

    public char getData() {
        return Data;
    }

    public void setData(char data) {
        Data = data;
    }

    public Uzel getNext() {
        return next;
    }

    public void setNext(Uzel next) {
        this.next = next;
    }

    public Uzel getPrev() {
        return prev;
    }

    public void setPrev(Uzel prev) {
        this.prev = prev;
    }

    public boolean hasNext(){
        if(next == null){
            return false;
        } else
            return true;
    }
}
