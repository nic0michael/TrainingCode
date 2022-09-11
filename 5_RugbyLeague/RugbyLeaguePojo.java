
/**
 *
 * @author 27825
 */
public class RugbyLeaguePojo {
    private String teamMame;
    private int gamesPlayed; 
    private int gamesWon;
    private int gamesDrawn;
    private int gamesLost; 
    private int pointsEarned;
    
    
    public String makeHeader(){
        String header ="";
        header +="teamMame";
        header +=",";
        header +="gamesPlayed";
        header +=",";
        header +="gamesWon";
        header +=",";
        header +="gamesDrawn";
        header +=",";
        header +="gamesLost";
        header +=",";
        header +="pointsEarned";
        
        return header;
    }
    
    public String makeBody() {  
        String body ="";
        body += teamMame;
        body += ",";
        body += gamesPlayed;
        body += ",";
        body += gamesWon;
        body += ",";
        body += gamesDrawn;
        body += ",";
        body += gamesLost;
        body += ",";
        body += pointsEarned;
        
        return body;
    }

    public String getTeamMame() {
        return teamMame;
    }

    public void setTeamMame(String teamMame) {
        this.teamMame = teamMame;
    }

    
    
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesDrawn() {
        return gamesDrawn;
    }

    public void setGamesDrawn(int gamesDrawn) {
        this.gamesDrawn = gamesDrawn;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
    
}
