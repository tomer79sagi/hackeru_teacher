package _passover_project.part_2.team;

import _passover_project.part_2.util.NBADate;

public class Coach
    extends TeamMember
    implements Comparable<Coach> {
    public Coach(String firstName, String lastName, NBADate dob, Team team) {
        super(firstName, lastName, dob, team);
    }

    @Override
    public int compareTo(Coach coach) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void printSummary() {
        super.printSummary();
    }
}
