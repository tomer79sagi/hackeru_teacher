package _passover_project.part_2.team;

import _passover_project.part_2.util.NBADate;
import _passover_project.part_2.util.PrintableSummary;

public abstract class TeamMember
        implements PrintableSummary {
    private final String firstName;
    private final String lastName;
    private final NBADate dob;

    private final Team team;

    public TeamMember(String firstName, String lastName, NBADate dob, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.team = team;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public NBADate getDob() {
        return dob;
    }

    public Team getTeam() {
        return team;
    }

    public String toString() {
        return "- " + getFirstName() + " " + getLastName();
    }
}
