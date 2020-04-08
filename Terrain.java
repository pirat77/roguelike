
public class Terrain extends Entity{

    private String name;
    private String flavorTxt;
    private boolean canPass;

    public void Element(String name, String flavorTxt, boolean canPass) {
        this.name = name;
        this.flavorTxt = flavorTxt;
        this.canPass = canPass;
    }
    
    public void explore(){
    
    }
    public Boolean getCanPass(){
        return this.canPass;
    }
    
    public String getName(){
        return this.name;
    }
    public String getFlavoerTxT(){
        return this.flavorTxt;
    }
    
    

}