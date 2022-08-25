import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Fake inputs zum überprüfen der Funktionen
         */

        ArrayList<Widerstand> lstWiderstaende = new ArrayList<>();
        lstWiderstaende.add(new Widerstand(50));
        lstWiderstaende.add(new Widerstand(100));
        lstWiderstaende.add(new Widerstand(150));

        lstWiderstaendeOut(lstWiderstaende);
        Widerstand xy = new Widerstand(WColor.BROWN, WColor.BLACK, WColor.ORANGE, WColor.SILVER);
        System.out.println(xy.getWiderstand());
        System.out.println(xy.getToleranz() + " %");
        System.out.println(xy.toString());;

        xy = new Widerstand(WColor.YELLOW, WColor.PURPLE, WColor.GREEN, WColor.RED, WColor.BROWN);
        System.out.println(xy.getWiderstand());
        System.out.println(xy.getToleranz() + " %");

        Widerstand test = new Widerstand(Widerstand.widerstandReihe(lstWiderstaende));
        System.out.println(test.getWiderstand());

        test = new Widerstand(Widerstand.widerstandParallel(lstWiderstaende));
        System.out.println(test.getWiderstand());
    }

    public static void lstWiderstaendeOut(ArrayList<Widerstand> lstWiderstaende){
        for(Widerstand w: lstWiderstaende){
            System.out.println(String.format("[% .2f]",w.getWiderstand())
                    .replaceAll("[\\[\\]]", ""));
        }
    }
}