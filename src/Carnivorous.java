public class Carnivorous extends Plant implements Waterable{

    /*
    Objektet tar in två parametrar, men använder sig av
    superklassens konstruktor som tar in 3 parametrar,
    med en Watering enum som är förbestämd i klassen.
    */

    public Carnivorous(String name, double heightMeter) {

        super(name, heightMeter, Watering.CARNIVOROUS);
    }

    @Override
    public String getWatering(){

        return getWateringInfo().baseAmount + (getWateringInfo().amountPerMeter * getHeightMeter()) + " Liter" +
                "\n" + getWateringInfo().typOfWater;
    }
}
