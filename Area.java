import java.util.ArrayList;

public class Area {
    boolean wasVisited;
    ArrayList<Entity> entityList;

    Area(){        
        this.wasVisited = false;
        this.entityList = new ArrayList<Entity>();
    }

    public boolean isPenetrable(){
        for (Entity entity : this.entityList){ if (entity.getClass().getName() == "Terrain") {return entity.getCanPass();}}
        return true;
    }

    public char getSymbol(){
        for (Entity entity : this.entityList){ if (entity.getClass().getName() == "Character") {return entity.getSymbol();}}
        for (Entity entity : this.entityList){ if (entity.getClass().getName() == "Enemy") {return entity.getSymbol();}}       
        for (Entity entity : this.entityList){ if (entity.getClass().getName() == "Miscallenous") {return entity.getSymbol();}}     
        for (Entity entity : this.entityList){ if (entity.getClass().getName() == "ObjectToPick") {return entity.getSymbol();}}
        for (Entity entity : this.entityList){ if (entity.getClass().getName() == "Terrain") {return entity.getSymbol();}}
        return '.';
    }

}