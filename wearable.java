
public class wearable extends ObjectToPick{
    private int scoutingBonus;
    private int visionBonus;
    private int strenghtBonus;
    private int engineeringBonus;
    private int ammo;

    public int getScoutingBonus(){
        return this.scoutingBonus;
    }

    public int getVisionBonus(){
        return this.visionBonus;
    }

    public int getStrenghtBonus(){
        return this.strenghtBonus;
    }

    public int getEngineeringBonus(){
        return this.engineeringBonus;
    }

    public int getAmmo(){
        return this.ammo;
    }

    public void setScoutingBonus(int change){
        this.scoutingBonus = this.scoutingBonus + change;
    }

    public void setVisionBonus(int change){
        this.visionBonus = this.visionBonus + change;
    }

    public void setStrenghtBonus(int change){
        this.strenghtBonus = this.strenghtBonus + change;
    }
 
    public void setEngineeringBonus(int change){
        this.engineeringBonus = this.engineeringBonus + change;
    }

    public void setAmmo(int change){
        this.ammo = this.ammo + change;
    }


}