package  cviceni11;

public class Main {
    public static void main(String[] args) {
        Graf graf = new Graf();
        graf.add(1,2,4);
        graf.add(1,6,6);
        graf.add(1,7,16);
        graf.add(2,3,24);
        graf.add(6,3,23);
        graf.add(6,5,5);
        graf.add(6,7,8);
        graf.add(7,8,21);
        graf.add(7,5,10);
        graf.add(8,5,14);
        graf.add(8,4,7);
        graf.add(4,5,11);
        graf.add(4,3,9);
        graf.add(3,5,18);

        //cesta pro kontrolu
        //predpokladany vysledek je 37
        graf.add(1,2,4); //uzly 1 - 2
        graf.add(2,3,24); //uzly 2 - 3
        graf.add(3,4,9); //uzly 3 - 4
        Cesta newPath = new Cesta(graf,1 );
        newPath.addVrchol(2).addVrchol(3).addVrchol(4);
        newPath.printCost("1-2-3-4");

        // cesta mezi dvema uzly
        graf.add(6,3,23); //pridani vzdalenosti dvou bodu
        Vrchol v1 = graf.getUzel(6);
        Vrchol v2 = graf.getUzel(3);
        System.out.println("Cost cesty mezi 6 a 3 je: "+v1.getCost(v2));





    }
}
