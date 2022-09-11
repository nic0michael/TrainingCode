
public enum TeamNames {
    BLUES("Blues"), 
    CRUSADERS("Crusaders"), 
    CHIEFS("Chiefs"), 
    BRUMBIES("Brumbies");
    

    private String name;
    
    private TeamNames(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
}
