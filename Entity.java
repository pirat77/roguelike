

public abstract class Entity{

    
    public String name;
    private int y;
    private int x;
    private char symbol;
    private String color;

    public void setCoordinates(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setSymbol(char symbol){
        this.symbol = symbol;
    }

    public char getSymbol(){
        return this.symbol;
    }



}

