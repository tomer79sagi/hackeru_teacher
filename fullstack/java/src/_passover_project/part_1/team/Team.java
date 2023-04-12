package _passover_project.part_1.team;

import _passover_project.part_1.enums.NBAConstants;
import _passover_project.part_1.util.PrintableSummary;

import java.util.HashSet;

public class Team
        implements PrintableSummary {
    private final String name;

    private final String shortName;
    private final NBAConstants.conference conference;

    private Coach coach;

    private final HashSet<Player> players;

    public Team(String name, String shortName, NBAConstants.conference conference) {
        this.name = name;
        this.shortName = shortName;
        this.conference = conference;

        players = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public NBAConstants.conference getConference() {
        return conference;
    }

    public String getShortName() {
        return shortName;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player getPlayerByJerseyNumber(int jerseyNumber) {
        return players.stream().filter(p -> p.getJerseyNumber() == jerseyNumber).findFirst().orElse(null);
    }

    public Player getPlayerByLastName(String lastName) {
        return players.stream().filter(p -> p.getLastName().equalsIgnoreCase(lastName)).findFirst().orElse(null);
    }

    public HashSet<Player> getPlayers() {
        return players;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @Override
    public void printSummary() {
        System.out.println("> " + getName() + " (" + getShortName() + ")");
        players.forEach(PrintableSummary::printSummary);
    }
}
