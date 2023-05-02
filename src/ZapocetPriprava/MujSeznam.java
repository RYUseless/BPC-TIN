package ZapocetPriprava;

public class MujSeznam {
    private Uzel prvni;

    public void add(char Data) {
        Uzel uzel = new Uzel(Data);
        if (prvni == null) {
            uzel.setData(Data);
            prvni = uzel;
        } else {
            uzel.setData(Data);
            uzel.setNext(prvni);
            uzel.setPrev(null);
            prvni = uzel;
        }
    }
    public void print(MujSeznam mujSeznam, String akce){
        Uzel uzel = mujSeznam.prvni;
        System.out.println("\n" + "Akce listu je: "+akce + "\nList:");
        int counter = 0;
        while(uzel != null){
            System.out.println("cislo uzlu "+ counter + " | data: " +uzel.getData());
            uzel = uzel.getNext();
            counter++;
        }
    }
    public void findStred() {
        Uzel tmp1 = prvni;
        Uzel tmp2 = prvni;
        while ( tmp1 != null && tmp2 != null && tmp1.hasNext())  {
            System.out.println("tmp1: " + tmp1.getData());
            System.out.println("tmp2: " + tmp2.getData());
            tmp2 = tmp2.getNext();
            if(tmp2 != null && tmp2.getNext() != null){
                tmp2 = tmp2.getNext();
                tmp1 = tmp1.getNext();
            }
        }
        System.out.println("stred je: "+tmp1.getData());
    }



    }

