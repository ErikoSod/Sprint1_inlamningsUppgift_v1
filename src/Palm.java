public class Palm extends Plant implements Waterable{

    /*
    Objektet tar in två parametrar, men använder sig av
    superklassens konstruktor som tar in 3 parametrar,
    med en Watering enum som är förbestämd i klassen.
    */

    public Palm(String name, double heightMeter){

        super(name, heightMeter, Watering.PALM);
    }
    @Override
    public String getWatering(){

        return getWateringInfo().amountPerMeter * getHeightMeter() + " Liter" +
                "\n" + getWateringInfo().typOfWater;
    }
}
