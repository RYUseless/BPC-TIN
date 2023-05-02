package  cviceni11;

import java.util.*;

public class KrouskalAlgorithm {
    private Graf graf;
    public KrouskalAlgorithm(Graf g){
        this.graf = g;
    }
    public ArrayList<Cesta> getSpanningTree() {
        HashMap<Vrchol, Set<Vrchol>> forest = new HashMap<Vrchol, Set<Vrchol>>();
        inicializujLes(forest);
        ArrayList<Cesta> minSpanTRee = new ArrayList<Cesta>();
        //NalezeniKostryGrafu

        return null;
    }

    private void inicializujLes(HashMap<Vrchol, Set<Vrchol>> forest){
        for (Vrchol vrchol : graf.getVrcholy()){
            Set<Vrchol> vs = new HashSet<Vrchol>();
            vs.add(vrchol);
            forest.put(vrchol,vs);
        }
    }
    public void nalezeniKostryGrafu(HashMap<Vrchol, Set<Vrchol>> forest, ArrayList<Vrchol> minSpanTree){
            LinkedList<Vrchol> hranolky = new LinkedList<>();
            hranolky.addAll(graf.getHrany());

            //Collections.sort(hranolky, new ComparatorDleCeny());
            for(Vrchol cesta : hranolky){
                //Set<Vrchol> mnozina1 = forest.get();
                //Set<Vrchol> mnozina2 = forest.get();
            }

    }

}
