import com.worldcup.downloader.TournamentDownloader;

public class WorldCupPipelineApplication {

    public static void main(String[] args) {

        TournamentDownloader downloader = new TournamentDownloader();

        String fileContents = downloader.downloadTournamentData();

        System.out.println(fileContents);

        // TODO:
        // Pass data to parser
        // Write JSON
    }

}