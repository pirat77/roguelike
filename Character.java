import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Character extends Entity {

    int lives;
    int damage;
    Wearable weaponWorn;
    Wearable armorWorn;
    Wearable hatWorn;
    Integer strenghtValue;
    Integer visionValue;
    Integer engineeringValue;
    Integer scoutingValue;
    int ammo;
    String strenght;
    String vision;
    String engineering;
    String scouting;
    String[] statsList = {strenght, vision, engineering, scouting};
    Map<String, Integer> statistics = new HashMap<String, Integer>();
    ArrayList<ObjectToPick> inventory = new ArrayList<ObjectToPick>();
    ArrayList<ability> abilities = new ArrayList<ability>();

    Character(){
        this.lives = 5;
        this.ammo = 5;
        this.visionValue = 7;
        this.name = "character";
        this.setSymbol('@');
        statistics.put(strenght, strenghtValue);
        statistics.put(vision, visionValue);
        statistics.put(engineering, engineeringValue);
        statistics.put(scouting, scoutingValue);
    }

    public void looseLife(){
        this.lives -= 1;
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

    public boolean isInstance(Class<Character> class1) {
		return true;
	}


}