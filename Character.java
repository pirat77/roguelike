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
    int strenghtValue;
    int visionValue;
    int engineeringValue;
    int scoutingValue;
    int[] statsValueList = {strenghtValue, visionValue, engineeringValue, scoutingValue};
    String strenght;
    String vision;
    String engineering;
    String scouting;
    String[] statsList = {strenght, vision, engineering, scouting};
    Map<String, Integer> statistics = new HashMap<String, Integer>();
    ArrayList<ObjectToPick> inventory = new ArrayList<ObjectToPick>();
    ArrayList<ability> abilities = new ArrayList<ability>();

    Character(){
        statistics.put(strenght, strenghtValue);
        statistics.put(vision, visionValue);
        statistics.put(engineering, engineeringValue);
        statistics.put(scouting, scoutingValue);
    }




    



    public void wearItem(Wearable item){

    }

    public void consumeItem(Consumable item){

    }

    public void inspectItem(Miscallenous item){

    }

    public int getStrenght(){
        return this.strenghtValue;

    }

    public int getScouting(){
        return this.scoutingValue;

    }

    public int getVision(){
        return this.visionValue;

    }

    public int getEngneering(){
        return this.engineeringValue;
        
    }

    public void setStrenght(int change){
        
    }
    public void setVision(int change){
        
    }
    public void setScouting(int change){
        
    }

    public void setEnginnering(int change){
        
    }

    public void unWearItem(Wearable item){

    }

    private void ability(){

    }


}