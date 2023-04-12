package _passover_project.part_1;

import _passover_project.part_1.enums.NBAConstants;
import _passover_project.part_1.enums.PlayerPosition;
import _passover_project.part_1.team.Player;
import _passover_project.part_1.team.Team;
import _passover_project.part_1.util.NBADate;

import java.util.HashSet;
import java.util.Hashtable;

public class NBAStats {

    // "teams" is an array as they almost never change
    private static Hashtable<String, Team> teams;

    // "players" is an HashSet, as players must be unique and a Collectoin
    private static HashSet<Player> players;

    static {
        initTeams();
        initPlayers();
    }

    private static void initTeams() {
        teams = new Hashtable<String, Team>();
        teams.put("CHI", new Team("Chicago Bulls", "CHI", NBAConstants.conference.EAST));
        teams.put("MIL", new Team("Milwaukee Bucks", "MIL", NBAConstants.conference.EAST));
        teams.put("BOS", new Team("Boston Celtics", "BOS", NBAConstants.conference.EAST));
        teams.put("DEN", new Team("Denver Nuggets", "DEN", NBAConstants.conference.WEST));
        teams.put("MEM", new Team("Memphis Grizzlies", "MEM", NBAConstants.conference.WEST));
    }
    private static void initPlayers() {
        players = new HashSet<>();

        Team bulls = teams.get("CHI");
        bulls.addPlayer(new Player("Zach", "LaVine", new NBADate(1995, 3, 10), "UCLA", PlayerPosition.G, bulls, 8));
        bulls.addPlayer(new Player("DeMar", "DeRozan", new NBADate(1989, 8, 7), "Southern California", PlayerPosition.F, bulls, 11));
        bulls.addPlayer(new Player("Nikola", "Vucevic", new NBADate(1990, 10, 24), "Southern California", PlayerPosition.C, bulls, 9));
        bulls.addPlayer(new Player("Patrick", "Williams", new NBADate(2001, 8, 26), "Florida State", PlayerPosition.F, bulls, 44));
        bulls.addPlayer(new Player("Coby", "White", new NBADate(2000, 2, 16), "North Carolina", PlayerPosition.G, bulls, 0));
        players.addAll(bulls.getPlayers());

        Team bucks = teams.get("MIL");
        bucks.addPlayer(new Player("Giannis", "Antetokounmpo", new NBADate(1994, 12, 6), "Filathlitikos", PlayerPosition.F, bucks, 34));
        bucks.addPlayer(new Player("Khris", "Middleton", new NBADate(1991, 8, 12), "Texas A&M", PlayerPosition.F, bucks, 22));
        bucks.addPlayer(new Player("Brook", "Lopez", new NBADate(1988, 4, 1), "Stanford", PlayerPosition.C, bucks, 11));
        bucks.addPlayer(new Player("Grayson", "Allen", new NBADate(1995, 10, 8), "Duke", PlayerPosition.G, bucks, 12));
        bucks.addPlayer(new Player("Jrue", "Holiday", new NBADate(1990, 6, 12), "UCLA", PlayerPosition.G, bucks, 21));
        players.addAll(bucks.getPlayers());
    }

    public static void main(String[] args) {
        Team bulls = teams.get("CHI");
        Team bucks = teams.get("MIL");

        bulls.printSummary();
        System.out.println();
        bucks.printSummary();

        System.out.println("\nSort by Name");
        bulls.getPlayers().stream().sorted(Player.nameComparator).forEach(System.out::println);

        System.out.println("\nSort by Jersey Number");
        bulls.getPlayers().stream().sorted().forEach(System.out::println);

        System.out.println("\nSort by College");
        bucks.getPlayers().stream().sorted(Player.collegeComparator).forEach(System.out::println);

        // Sort players in teams using default 'compareTo' method
        System.out.println("\nSort by Jersey Number");
        players.stream().sorted().forEach(System.out::println);

        // Sort all players in NBA
        System.out.println("\nSort by collegeName");
        players.stream().sorted(Player.collegeNameComparator).forEach(System.out::println);
    }
}
