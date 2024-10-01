public abstract class Plant {

    /*
    Klasserna Palm, Carnivorous och Cactus ärver
    attributer och metoderna från klassen Plant.
    Attributen är inkapslade och klassen är "read-only"
     */

    private final String name;
    private final double heightMeter;
    private final Watering wateringInfo;

    public Plant(String name, double heightMeter, Watering wateringInfo) {
        this.name = name;
        this.heightMeter = heightMeter;
        this.wateringInfo = wateringInfo;
    }

    public String getName() {
        return name;
    }
    public double getHeightMeter() {
        return heightMeter;
    }
    public Watering getWateringInfo() {
        return wateringInfo;
    }
}
