
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> Sport = new ArrayList<>();
        System.out.println("File:");
        String file = scan.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                Sport.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        for (String line : Sport) {
            String[] parts = line.split(",");
            String team1 = parts[0];
            String team2 = parts[1];
            int point1 = Integer.valueOf(parts[2]);
            int point2 = Integer.valueOf(parts[3]);
            if ((team1.equals(team)) || (team2.equals(team))) {
                games += 1;
                if (team1.equals(team)) {
                    if (point1 > point2) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                }
                if (team2.equals(team)) {
                    if (point2 > point1) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                }
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
