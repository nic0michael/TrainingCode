

/**
 *
 * @author 27825
 */
public class RugbyLeagueHelper {
    
    public static final String CSV_FILE_NAME = "RugbyLeague_v1.csv";

    static void capture() {
        RugbyLeaguePojo[] fourPojos = new RugbyLeaguePojo[4];

        try {
            fourPojos[0] = RugbyLeagueCapture.captureTeam(TeamNames.BLUES.getName());
            fourPojos[1] = RugbyLeagueCapture.captureTeam(TeamNames.BRUMBIES.getName());
            fourPojos[2] = RugbyLeagueCapture.captureTeam(TeamNames.CHIEFS.getName());
            fourPojos[3] = RugbyLeagueCapture.captureTeam(TeamNames.CRUSADERS.getName());
            

            System.out.println("\n\nResults for League");

            for (int i = 0; i < fourPojos.length; i++) {
                saveRugbyLeaguePojo(fourPojos[i]);
                String teamMame = fourPojos[i].getTeamMame();
                int pointsEarned = fourPojos[i].getPointsEarned();
                System.out.println(teamMame + " points earned " + pointsEarned);
            }

        } catch (Exception ex) {
            System.out.println("Try again an error was made");
        }
    }

    private static void saveRugbyLeaguePojo(RugbyLeaguePojo pojo) {

        if (null == pojo) {
            System.err.println("Pojo is null");
            return;
        }

        boolean csvExists = FileUtilities.exists(CSV_FILE_NAME);
        String header = pojo.makeHeader();
        String body = pojo.makeBody();

        try {
            if (csvExists) {
                CsvUtilities.appendeCsvFile(CSV_FILE_NAME, body);
            } else {
                CsvUtilities.writeCsvFile(CSV_FILE_NAME, header, body);
            }
        } catch (Exception ex) {
            if (csvExists) {
                System.out.println("Failed to append file error is : " + ex.getMessage());
            } else {
                System.out.println("Failed to write new file error is : " + ex.getMessage());
            }
        }
    }
}
