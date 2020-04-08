import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Character {

    int lives;
    int damage;
    Wearable weaponWorn;
    Wearable armorWorn;
    Wearable hatWorn;
    Integer strenghtValue;
    Integer visionValue;
    Integer engineeringValue;
    Integer scoutingValue;
    String strenght;
    String vision;
    String engineering;
    String scouting;

    Map<String, Integer> statistics = new HashMap<String, Integer>();

    public Character(){

        statistics.put(strenght, strenghtValue);
        statistics.put(vision, visionValue);
        statistics.put(engineering, engineeringValue);
        statistics.put(scouting, scoutingValue);

    }


    ArrayList<ObjectsToPick> inventory = new ArrayList<ObjectsToPick>();

    ArrayList<ability> abilities = new ArrayList<ability>();




    private void wearItem(weareable){

    }

    private void consumeItem(consumable){

    }

    private void inspectItem(miscellenous){

    }

    private int getStrenght(){
        return

    }

    private int getScouting(){
        return

    }

    private int getVision(){
        return

    }

    private int getEngneering(){
        return 
        
    }

    private void setStrenght(int){
        
    }
    private void setVision(int){
        
    }
    private void setScouting(int){
        
    }

    private void setEnginnering(int){
        
    }

    private void wearItem(wearable){

    }

    private void unWearItem(wearable){

    }

    private void consumeItem(consumable){

    }

    private void inspectItem(miscallenous){

    }

    private void ability(){
        

    }


}