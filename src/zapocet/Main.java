package zapocet;

public class Main {
    public static void main(String[] args) {
        //zadani:
        // 0 = 5 = 9 = 2 = 0 = 1 = 5 = 7 (vsechny pozice maji taktez spojeni s hodnotou 0 )
        // reverse: 7 = 5 = 1 = 0 = 2 = 9 = 5 = 0
        MujList list = new MujList(0);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(7);
        //zobrazeni
        list.print(list,"Original");
        list.reverse(list); //reverse
        list.print(list,"reverse");

    }
}
