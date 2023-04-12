package _passover_project.part_1.team;

import org.jetbrains.annotations.NotNull;
import _passover_project.part_1.enums.PlayerPosition;
import _passover_project.part_1.util.NBADate;
import _passover_project.part_1.util.PrintableSummary;

import java.util.Comparator;

public class Player
    extends TeamMember
    implements Comparable<Player>, PrintableSummary {

    private final String collegeName;

    private int jerseyNumber;

    private PlayerPosition position;

    public static final Comparator<Player> nameComparator;

    public static final Comparator<Player> collegeComparator;
    public static final Comparator<Player> collegeNameComparator;
    public static final Comparator<Player> collegeDOBComparator;

    static {
        Comparator<Player> lastNameComparator = Comparator.comparing(p -> p.getLastName());
        collegeComparator = Comparator.comparing(Player::getCollegeName);
        nameComparator = lastNameComparator.thenComparing(Comparator.comparing(Player::getFirstName));
        collegeNameComparator = collegeComparator.thenComparing(nameComparator);
        collegeDOBComparator = collegeComparator.thenComparing(Player::getDob);
    }

    public Player(String firstName, String lastName, NBADate dob, String collegeName, PlayerPosition position, Team team, int jerseyNumber) {
        super(firstName, lastName, dob, team);

        this.jerseyNumber = jerseyNumber;
        this.collegeName = collegeName;
        this.position = position;
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
