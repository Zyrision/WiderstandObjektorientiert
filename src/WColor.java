import javax.crypto.KeyAgreement;

public enum WColor {
    BLACK(0,1,0),
    BROWN(1,10,1),
    RED(2,100,2),
    ORANGE(3,1000,0),
    YELLOW(4,10000,0),
    GREEN(5,100000,0.5),
    BLUE(6,1000000,0.25),
    PURPLE(7,10000000,0.1),
    GREY(8,100000000,0.05),
    WHITE(9,1000000000,0),
    GOLD(-1,10000000000.0,10),
    SILVER(-2,100000000000.0,5);
    private double multi;
    private int colorValue;
    private double toleranz;

    private WColor(int colorValue, double multi, double toleranz){
        this.colorValue = colorValue;
        this.multi = multi;
        this.toleranz = toleranz;
    }


    public double getMulti() {
        return multi;
    }
    public int getColorValue() {
        return colorValue;
    }
    public double getToleranz() {
        return toleranz;
    }
}
