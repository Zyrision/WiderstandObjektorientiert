import javax.crypto.KeyAgreement;

public enum WColor {
    BLACK(0,1.0,0.0),
    BROWN(1,10.0,1.0),
    RED(2,100.0,2.0),
    ORANGE(3,1000.0,0.0),
    YELLOW(4,10000.0,0.0),
    GREEN(5,100000.0,0.5),
    BLUE(6,1000000.0,0.25),
    PURPLE(7,10000000.0,0.1),
    GREY(8,100000000.0,0.05),
    WHITE(9,1000000000.0,0.0),
    GOLD(null,0.1,5.0),
    SILVER(null,0.01,10.0);
    private Double multi;
    private Integer colorValue;
    private Double toleranz;

    private WColor(Integer colorValue, Double multi, Double toleranz){
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
