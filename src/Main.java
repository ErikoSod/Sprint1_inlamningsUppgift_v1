import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public Main() {

        /*
            Växt objekten sparas i en referens av typen Interface Waterable och
            sen i en lista av samma typ.
         */

        Waterable igge = new Cactus("Igge", 0.20);
        Waterable laura = new Palm("Laura", 5);
        Waterable meatloaf = new Carnivorous("Meatloaf", 0.7);
        Waterable olof = new Palm("Olof", 1);

        List<Waterable> plantsList = Arrays.asList(igge, laura, meatloaf, olof);

        findWaterablePlant(plantsList);
}

    private void findWaterablePlant (List<Waterable> waterableList) {

        try{
            boolean plantNotFound = true;
            String selectedPlant = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            for (Waterable plant : waterableList) {
                if (selectedPlant.equalsIgnoreCase(plant.getName()))
                {
                    //Här används polymorfism när metoden getWatering anropas.
                    JOptionPane.showMessageDialog(null,plant.getWatering(), plant.getName(), JOptionPane.INFORMATION_MESSAGE);
                    plantNotFound = false;
                }
            }
            if (plantNotFound){
                JOptionPane.showMessageDialog(null, "Växt finns inte!", null, JOptionPane.WARNING_MESSAGE);
            }

        }catch (NullPointerException _){
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        while (true) {
        Main main = new Main();
        }
    }
}