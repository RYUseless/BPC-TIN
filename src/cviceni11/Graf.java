package cviceni11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Graf {
    public HashMap<Integer, Vrchol> vrcholSet = new HashMap<Integer, Vrchol>();

    public void add(int uzel1Label, int uzel2Label, int cost ){
        Vrchol v1 = vrcholSet.get(uzel1Label);
        Vrchol v2 = vrcholSet.get(uzel2Label);
        if(v1 == null){
            v1= new Vrchol(uzel1Label);
            vrcholSet.put(uzel1Label, v1);
        }
        if(v2 == null){
            v2 = new Vrchol(uzel2Label);
            vrcholSet.put(uzel2Label, v2);
        }
        v1.connect(v2, cost);
        v2.connect(v1, cost);
    }
    public Vrchol getUzel(int label){
        return vrcholSet.get(label);
    }
    public Collection<Vrchol> getVrcholy(){
        return vrcholSet.values();
    }
    public Set<Vrchol> getHrany(){
        return null;

    }

}
