package _passover_project.part_2.team;

import org.jetbrains.annotations.NotNull;
import _passover_project.part_2.enums.PlayerPosition;
import _passover_project.part_2.game.Game;
import _passover_project.part_2.util.NBADate;
import _passover_project.part_2.util.PrintableSummary;

import java.util.Comparator;
import java.util.HashSet;

public class Player
    extends TeamMember
    implements Comparable<Player>, PrintableSummary {

    private final String collegeName;

    private int totalPoints;
    private float avgPoints;

    private float avgFGPCT;

    private int jerseyNumber;

    private PlayerPosition position;

    private HashSet<Game> games;

    public static final Comparator<Player> nameComparator;

    public static final Comparator<Player> collegeComparator;
    public static final Comparator<Player> collegeNameComparator;
    public static final Comparator<Player> collegeDOBComparator;
    public static final Comparator<Player> avgPointsComparator;
    public static final Comparator<Player> avgFGPCTComparator;

    static {
        Comparator<Player> lastNameComparator = Comparator.comparing(p -> p.getLastName());
        collegeComparator = Comparator.comparing(Player::getCollegeName);
        nameComparator = lastNameComparator.thenComparing(Comparator.comparing(Player::getFirstName));
        collegeNameComparator = collegeComparator.thenComparing(nameComparator);
        collegeDOBComparator = collegeComparator.thenComparing(Player::getDob);
        avgPointsComparator = Comparator.comparing(p -> p.getTotalPoints() / p.getTotalGames());
        avgFGPCTComparator = Comparator.comparing(p -> p.getTotalGames() / p.getAvgPoints());
    }

    public Player(String firstName, String lastName, NBADate dob, String collegeName, PlayerPosition position, Team team, int jerseyNumber) {
        super(firstName, lastName, dob, team);

        this.jerseyNumber = jerseyNumber;
        this.collegeName = collegeName;
        this.position = position;

        games = new HashSet<>();
    }

    @Override
    public int compareTo(@NotNull Player player) {
        return getJerseyNumber() - player.getJerseyNumber();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getTotalGames() {
        return games.size();
    }

    public float getAvgPoints() {
        return avgPoints;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public HashSet<Game> getGames() {
        return games;
    }

    protected void addGame(Game game) {
        games.add(game);

        // 1. Calculate total points

        // 2. Calculate avg points
    }

    public float getAvgFGPCT() {
        return avgFGPCT;
    }

    @Override
    public void printSummary() {
        System.out.println("- " + getFirstName() + " " + getLastName() + " (" + getPosition() + ")");
    }

    @Override
    public String toString() {
        return "- " +
                getFirstName() + " " + getLastName() + ", " +
                getCollegeName() + ", " +
                getJerseyNumber() + ", " +
                getPosition().getPositionName() + ", " +
                getDob();
    }
}
