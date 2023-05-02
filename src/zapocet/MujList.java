package zapocet;

public class MujList {
    private Uzel prvni; //prvni
    private Uzel posledni; //posledni
    private Uzel rodic ; //rodicovska 0 nad listem


    public void add(int Data){ //add last
        if(rodic == null){
            rodic = new Uzel(0);
            posledni = null;
        }
        if(prvni == null){
            prvni = new Uzel(Data);
            posledni = prvni;
            return;
        }
        Uzel last = posledni;
        Uzel novyUzel = new Uzel(Data);
        last.setNext(novyUzel);
        novyUzel.setPrev(last);
        novyUzel.setRodic(rodic);
        posledni = novyUzel;

    }

    public void reverse(MujList list){
        Uzel uzel = list.prvni; //zepredu
        Uzel uzlo = list.posledni; //zezadu
        int uzelValue;
        System.out.println("\n");

        while(uzel != null && uzlo != null){
            System.out.println("Vyhledavani dvojic: "+uzel.getData() + " | "+uzlo.getData());
            uzelValue = uzel.getData();
            uzel.setData(uzlo.getData());
            uzlo.setData(uzelValue);
            if(uzlo.getData() == uzel.getNext().getData()){
                return;
            }
            uzlo = uzlo.getPrev();
            uzel = uzel.getNext();
        }
    }


    public void shuffle(MujList list,String akce){ //reverse
        Uzel uzlo = list.posledni;
        System.out.println("\n" + "Akce listu je: "+akce + "\nList:");
        System.out.println("Rodic je>:" + list.rodic.getData());
        int counter= 1;
        while (uzlo != null){
            System.out.println("Cislo uzlu: "+ counter + " | Data: " +uzlo.getData());
            uzlo = uzlo.getPrev();
            counter++;
        }
    }

    public void print(MujList list,String akce){ //basic print
        Uzel uzel = list.prvni;
        System.out.println("\n" + "Akce listu je: "+akce + "\nList:");
        System.out.println("Rodic je:" + list.rodic.getData());
        int counter = 0;
        while(uzel != null){
            System.out.println("Cislo uzlu "+ counter + " | Data: " +uzel.getData());
            uzel = uzel.getNext();
            counter++;
        }
    }
}
