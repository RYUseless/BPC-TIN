package zapocet;

public class Main {
    public static void main(String[] args) {
        MujList list = new MujList();
        list.add(0);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(7);
        list.print(list,"Original"); //prvotni zobrazeni
        //list.shuffle(list,"Shuffle"); //reverse zobrazeni
        list.reverse(list);
        list.print(list,"reverse"); //prvotni zobrazeni

    }
}
