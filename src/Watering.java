public enum Watering {

    /*
    Enum Watering har tre satta konstanter som representerar
    vattenmängd och typ av vatten som används av de olika subklasserna
    av Plant för att räkna ut den totala mängden vatten en växt behöver
    i getWatering metoden.
     */

    PALM("Kranvatten",0,0.5),
    CARNIVOROUS("Proteindryck",0.1,0.2),
    CACTUS("Mineralvatten",0.02,0);

    public final String typOfWater;
    public final double baseAmount;
    public final double amountPerMeter;

    Watering(String typ, double baseAmount, double amountPerMeter) {
        this.typOfWater = typ;
        this.baseAmount = baseAmount;
        this.amountPerMeter = amountPerMeter;
    }
}
