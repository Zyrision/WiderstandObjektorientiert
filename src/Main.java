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
        lstWiderstaende.add(new Widerstand(1500000));

        lstWiderstaendeOut(lstWiderstaende);
        Widerstand xy = new Widerstand(WColor.braun, WColor.schwarz, WColor.orange, WColor.silber);
        System.out.println(xy.getWiderstand());
        System.out.println(xy.getToleranz() + " %");

        xy = new Widerstand(WColor.gelb, WColor.violett, WColor.grün, WColor.rot, WColor.braun);
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