package _passover_project.part_2.team;

import _passover_project.part_2.enums.NBAConstants;
import _passover_project.part_2.game.Game;
import _passover_project.part_2.util.IBasicSort;
import _passover_project.part_2.util.PrintableSummary;

import java.util.HashSet;

public class Team
        implements IBasicSort, PrintableSummary {
    private final String name;

    private final String shortName;
    private final NBAConstants.conference conference;

    private Coach coach;
    private final HashSet<Game> games;

    private final HashSet<Player> players;

    public Team(String name, String shortName, NBAConstants.conference conference) {
        this.name = name;
        this.shortName = shortName;
        this.conference = conference;

        players = new HashSet<>();
        games = new HashSet<>();
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

    // Using a copy-constructor
    public HashSet<Game> getGames() {
        return new HashSet<Game>(games);
    }

    public void addGame(Game game) {
        games.add(game);

        // Add the 'Game' reference to each player
        players.forEach(p -> p.addGame(game));
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

    @Override
    public Player[] sortByPoints() {
        return (Player[])players.stream().sorted(Player.avgPointsComparator).toArray();
    }

    @Override
    public Player[] sortByFGPCT() {
        return null;
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
