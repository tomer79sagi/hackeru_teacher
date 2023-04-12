package _passover_project.part_2.game;

import org.jetbrains.annotations.NotNull;
import _passover_project.part_2.team.Player;
import _passover_project.part_2.util.IAdvancedSort;
import _passover_project.part_2.util.NBADate;

import java.util.ArrayList;

public class Game
    implements Comparable<Game>, IAdvancedSort {

    private final NBADate date;
    private ArrayList<PlayerGameStats> awayPlayerStats;
    private ArrayList<PlayerGameStats> homePlayerStats;

    public Game(NBADate date) {
        this(date, null, null);
    }

    public Game(NBADate date, ArrayList<PlayerGameStats> awayPlayerStats, ArrayList<PlayerGameStats> homePlayerStats) {
        this.date = date;
        this.awayPlayerStats = awayPlayerStats;
        this.homePlayerStats = homePlayerStats;
    }
    @Override
    public int compareTo(@NotNull Game game) {
        return 0;
    }

    public NBADate getDate() {
        return date;
    }

    public ArrayList<PlayerGameStats> getAwayPlayerStats() {
        return awayPlayerStats;
    }

    public void setAwayPlayerStats(ArrayList<PlayerGameStats> awayPlayerStats) {
        this.awayPlayerStats = awayPlayerStats;
    }

    public ArrayList<PlayerGameStats> getHomePlayerStats() {
        return homePlayerStats;
    }

    public void setHomePlayerStats(ArrayList<PlayerGameStats> homePlayerStats) {
        this.homePlayerStats = homePlayerStats;
    }

    @Override
    public Player[] sortByTeamPoints() {
        return null;
    }

    @Override
    public Player[] sortByTeamFGPCT() {
        return null;
    }

    @Override
    public Player[] sortByPoints() {
        return null;
    }

    @Override
    public Player[] sortByFGPCT() {
        return null;
    }
}
