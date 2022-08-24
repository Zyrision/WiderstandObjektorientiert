public class WColor {
    private String colorName;
    private int colorValue;
    private double toleranz;

    private WColor(String colorName, int colorValue, double toleranz){
        this.colorName = colorName;
        this.colorValue = colorValue;
        this.toleranz = toleranz;
    }

    public static WColor schwarz = new WColor("Schwarz",0,0.0);
    public static WColor braun = new WColor("Braun", 1, 1.0);
    public static WColor rot = new WColor("Rot", 2, 2.0);
    public static WColor orange = new WColor("Orange", 3, 0.0);
    public static WColor gelb = new WColor("Gelb", 4, 0.0);
    public static WColor grün = new WColor("Grün", 5, 0.5);
    public static WColor blau = new WColor("Blau", 6, 0.25);
    public static WColor violett = new WColor("Violett", 7, 0.1);
    public static WColor grau = new WColor("Grau", 8, 0.05);
    public static WColor weiß = new WColor("Weiß", 9, 0.0);
    public static WColor silber = new WColor("Silber", -1, 10.0);
    public static WColor gold = new WColor("Gold", -2, 5.0);

    public String getColorName() {
        return colorName;
    }

    public int getColorValue() {
        return colorValue;
    }

    public double getToleranz() {
        return toleranz;
    }
}
