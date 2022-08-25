import java.util.ArrayList;
import java.util.Arrays;

public class Widerstand {
    private double widerstand;
    private double toleranz = 0;
    private WColor[] color;
    public double getToleranz(){
        return toleranz;
    }
    public double getWiderstand(){
        return widerstand;
    }

    /**
     * Constructor für Widerstand als Übergabewert
     * @param Ohm
     */
    public Widerstand(double Ohm){
        this.widerstand = Ohm;
    }

    /**
     * Constructor für Widerstände mit 4 Farben
     * @param color1
     * @param color2
     * @param color3
     * @param color4
     */
    public Widerstand(WColor color1, WColor color2, WColor color3, WColor color4){
        WColor[] colors = {color1, color2, color3, color4};
        double ohm = Double.parseDouble(color1.getColorValue() + "" + color2.getColorValue());
        ohm = (ohm * Math.pow(10, (color3.getColorValue())));
        this.widerstand = ohm;
        this.color = colors;
        this.toleranz = (color4.getToleranz());
    }
    /**
     * Constructor für Widerstände mit 5 Farben
     * @param color1
     * @param color2
     * @param color3
     * @param color4
     * @param color5
     */
    public Widerstand(WColor color1, WColor color2, WColor color3, WColor color4, WColor color5){
        WColor[] colors = {color1, color2, color3, color4, color5};
        double ohm = Double.parseDouble(color1.getColorValue() + "" + color2.getColorValue() + color3.getColorValue());
        ohm = (double) (ohm * Math.pow(10, (color4.getColorValue())));
        this.widerstand = ohm;
        this.color = colors;
        this.toleranz = (color5.getToleranz());
    }
    /**
     * Widerstand einer Reihenschaltung berechnen.
     * @param widerstaende
     * @return widerstand
     */
    static double widerstandReihe(ArrayList<Widerstand> widerstaende){
        double wTemp = 0;
        for (Widerstand w : widerstaende){
            wTemp = wTemp + w.widerstand;
        }
        return wTemp;
    }

    /**
     * Widerstand einer Parallelschaltung berechnen
     * @param widerstaende
     * @return widerstand
     */
    static double widerstandParallel(ArrayList<Widerstand> widerstaende){
        double wTmp = 0;
        for(Widerstand w : widerstaende) {
            wTmp = wTmp + 1/w.widerstand;
        }
        return 1/wTmp;
    }

    @Override
    public String toString() {
        return "Widerstand{" +
                "widerstand=" + widerstand +
                ", toleranz=" + toleranz +
                ", color=" + Arrays.toString(color).toString() +
                '}';
    }
}