public class Cactus extends Plant implements Waterable{

    /*
    Objektet tar in två parametrar, men använder sig av
    superklassens konstruktor som tar in 3 parametrar,
    med en Watering enum som är förbestämd i klassen.
    */

    public Cactus(String name, double heightMeter) {

        super(name, heightMeter, Watering.CACTUS);
    }

    @Override
    public String getWatering(){

        return getWateringInfo().baseAmount + " Liter" +
                "\n" + getWateringInfo().typOfWater;
    }
}
