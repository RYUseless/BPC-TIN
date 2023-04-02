package cviceni10;

public class Main {
    public static void main(String[] args) {
        Populace populace = new Populace(50);
        for (int i = 0; i < 250; i++) {
            populace.mutate(1,50);
            populace.crossover(100);
            populace.select();
            if(i%20==0){
                populace.show();
                System.out.println("----- NEW SHOW -----");

            }
        }
    }
}

