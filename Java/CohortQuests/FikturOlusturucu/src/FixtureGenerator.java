import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {
    private List<Team> teams;
    private List<String> fixtures;

    public FixtureGenerator(List<Team> teams) {
        this.teams = teams;
        this.fixtures = new ArrayList<>();
    }

    public void generateFixtures() {
        if (teams.size() % 2 != 0) {
            teams.add(new Team("Bay"));
        }

        int totalRounds = teams.size() - 1;
        int matchesPerRound = teams.size() / 2;

        for (int round = 0; round < totalRounds; round++) {
            for (int match = 0; match < matchesPerRound; match++) {
                Team homeTeam = teams.get((round + match) % (teams.size() - 1));
                Team awayTeam = teams.get((teams.size() - 1 - match + round) % (teams.size() - 1));

                fixtures.add(homeTeam.getName() + " vs " + awayTeam.getName());
            }
        }
    }

    public void printFixtures() {
        int round = 1;
        for (String fixture : fixtures) {
            System.out.println("Round " + round);
            System.out.println(fixture);
            round++;
        }
    }
}