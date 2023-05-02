package zapocet;

public class Uzel {
    private int Data;
    private Uzel next;
    private Uzel prev;
    private Uzel rodic;

    public Uzel getRodic() {
        return rodic;
    }

    public void setRodic(Uzel rodic) {
        this.rodic = rodic;
    }

    public Uzel(int data){
        this.Data = data;

    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
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

}
