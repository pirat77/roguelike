import java.util.ArrayList;

public class Area {
    boolean wasVisited;
    ArrayList<Entity> entityList;

    Area(){        
        this.wasVisited = true;
        this.entityList = new ArrayList<Entity>();
    }

    public static char getSymbol(ArrayList<Entity> entityList){
        for (Entity entity : entityList){ if (entity.isInstance(Character)) {return entity.getSymbol();}}            
        for (Entity entity : entityList){ if (entity.isInstance(ObjectToPick)) {return entity.getSymbol();}}
        for (Entity entity : entityList){ if (entity.isInstance(Terrain)) {return entity.getSymbol();}}
        return '.';
    }

}