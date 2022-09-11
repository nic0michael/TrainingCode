
import java.io.*;

/**
 *
 * @author 27825
 */
class RugbyLeagueCapture {

    public static RugbyLeaguePojo captureTeam(String teamName) throws Exception {
        System.out.println("\n\nCapturing statistics for team : "+teamName);
        RugbyLeaguePojo pojo = new RugbyLeaguePojo();

        int gamesPlayed;
        int gamesWon;
        int gamesDrawn;
        int gamesLost;
        int pointsEarned;        
        
        try{
            gamesPlayed=getIntFromLine("Enter games played");
            gamesWon=getIntFromLine("Enter games won");
            gamesDrawn=getIntFromLine("Enter games drawn");
            gamesLost=getIntFromLine("Enter games lost");
            pointsEarned=getIntFromLine("Enter points earned");
        }catch(Exception e){
            System.out.println("Invalid numeric value entered");
            throw new Exception("Invalid numeric value entered");
        }
        pojo.setTeamMame(teamName);
        pojo.setGamesPlayed(gamesPlayed);
        pojo.setGamesWon(gamesWon);
        pojo.setGamesDrawn(gamesDrawn);
        pojo.setGamesLost(gamesLost);
        pojo.setPointsEarned(pointsEarned);

        return pojo;
    }

    private static int getIntFromLine(String displayMessage) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        System.out.println(displayMessage);
        String textRead = reader.readLine();
        int value =Integer.parseInt(textRead);
        return value;
    }

}
