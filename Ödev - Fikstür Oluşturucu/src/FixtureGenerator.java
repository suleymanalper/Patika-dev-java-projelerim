import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FixtureGenerator {

    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");

        generateFixture(teams);
    }

    public static void generateFixture(List<String> teams) {
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int totalRounds = teams.size() - 1;
        int matchesPerRound = teams.size() / 2;

        List<String> homeTeams = new ArrayList<>();
        List<String> awayTeams = new ArrayList<>();

        for (int i = 0; i < matchesPerRound; i++) {
            homeTeams.add(teams.get(i));
            awayTeams.add(teams.get(teams.size() - 1 - i));
        }

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("Round " + round);

            for (int i = 0; i < matchesPerRound; i++) {
                String homeTeam = homeTeams.get(i);
                String awayTeam = awayTeams.get(i);
                System.out.println(homeTeam + " vs " + awayTeam);
            }

            // Rotate teams
            String lastHomeTeam = homeTeams.get(homeTeams.size() - 1);
            String firstAwayTeam = awayTeams.get(0);

            homeTeams.remove(homeTeams.size() - 1);
            homeTeams.add(0, firstAwayTeam);

            awayTeams.remove(0);
            awayTeams.add(lastHomeTeam);

            System.out.println();
        }
    }
}
