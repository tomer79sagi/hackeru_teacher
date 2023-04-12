package _passover_project.part_2.game;

import org.jetbrains.annotations.NotNull;
import _passover_project.part_2.team.Player;

import java.util.Comparator;

public record PlayerGameStats(Player player, Game game, float minutesPlayed, int points, float fgpct)
        implements Comparable<PlayerGameStats> {

    public static final Comparator<PlayerGameStats> pointsComparator;
    public static final Comparator<PlayerGameStats> fgpctComparator;
    public static final Comparator<PlayerGameStats> teamPointsComparator;

    public static final Comparator<PlayerGameStats> teamFGPCTComparator;

    static {
        Comparator<PlayerGameStats> teamComparator = Comparator.comparing(s -> s.player().getTeam().getName());

        pointsComparator = Comparator.comparing(PlayerGameStats::points);
        fgpctComparator = Comparator.comparing(PlayerGameStats::fgpct);
        teamPointsComparator = teamComparator.thenComparing(pointsComparator);
        teamFGPCTComparator = teamComparator.thenComparing(fgpctComparator);
    }
    public PlayerGameStats {
//        player.
    }

    @Override
    public int compareTo(@NotNull PlayerGameStats playerGameStats) {
        return 0;
    }
}
