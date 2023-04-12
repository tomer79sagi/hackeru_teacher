package _passover_project.part_2;

import _passover_project.part_2.enums.NBAConstants;
import _passover_project.part_2.enums.PlayerPosition;
import _passover_project.part_2.game.Game;
import _passover_project.part_2.game.PlayerGameStats;
import _passover_project.part_2.team.Player;
import _passover_project.part_2.team.Team;
import _passover_project.part_2.util.NBADate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class NBAStats {

    // "teams" is an array as they almost never change
    private static Hashtable<String, Team> teams;

    // "players" is an HashSet, as players must be unique and a Collectoin
    private static HashSet<Player> players;
    private static HashSet<Game> games;

    static {
        initTeams();
        initPlayers();
        initGames();
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

    private static void initGames() {
        Team bulls = teams.get("CHI");
        Team bucks = teams.get("MIL");
        games = new HashSet<>();

        games.add(initGame1(bulls, bucks));
        games.add(initGame2(bulls, bucks));
        games.add(initGame3(bulls, bucks));
        games.add(initGame4(bulls, bucks));
    }

    private static Game initGame1(Team bulls, Team bucks) {
        Game game = new Game(new NBADate(2022, 11, 23));
        ArrayList<PlayerGameStats> homePlayerStats = new ArrayList<>();
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("DeRozan"), game, 37.55f,36,0.583f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Williams"), game, 26.08f,11,0.429f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Vucevic"), game, 29.8f,18,0.5f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("LaVine"), game, 33.93f,18,0.353f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Dosunmu"), game, 24.4f,8,0.6f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Green"), game, 18.57f,11,0.8f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Caruso"), game, 27.3f,0,0f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("White"), game, 25.42f,14,0.5f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Drummond"), game, 16.95f,2,0.333f));

        ArrayList<PlayerGameStats> awayPlayerStats = new ArrayList<>();
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Allen"), game, 32.8f,13,0.5f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Antetokounmpo"), game, 34f,36,0.556f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Lopez"), game, 31.97f,20,0.5f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Carter"), game, 25.4f,2,0.25f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Holiday"), game, 35.83f,14,0.5f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Portis"), game, 24.9f,9,0.4f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Matthews"), game, 16.85f,6,0.667f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Hill"), game, 17.47f,10,0.429f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Nwora"), game, 6.37f,0,0f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Connaughton"), game, 14.4f,3,0.167f));

        game.setHomePlayerStats(homePlayerStats);
        game.setAwayPlayerStats(awayPlayerStats);

        bulls.addGame(game);
        bucks.addGame(game);

        return game;
    }

    private static Game initGame2(Team bulls, Team bucks) {
        Game game = new Game(new NBADate(2022, 10, 11));
        ArrayList<PlayerGameStats> homePlayerStats = new ArrayList<>();
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Mamukelashvili"), game, 32.02f,13,0.333f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Nwora"), game, 31.17f,25,0.529f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Bolden"), game, 33.82f,21,0.818f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Beauchamp"), game, 38.63f,14,0.375f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Carter"), game, 21.17f,13,0.333f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Green"), game, 29.23f,8,0.231f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Wigginton"), game, 30.47f,4,0.2f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Vildoza"), game, 23.5f,6,0.286f));

        ArrayList<PlayerGameStats> awayPlayerStats = new ArrayList<>();
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Terry"), game, 21.45f,5,0.5f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Williams"), game, 31.98f,22,0.529f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Vucevic"), game, 23.6f,17,0.778f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("White"), game, 29.12f,15,0.417f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Dosunmu"), game, 22.35f,8,0.5f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Green"), game, 16.5f,10,0.5f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Drag"), game, 18.97f,13,0.667f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Caruso"), game, 22.78f,6,0.333f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Drummond"), game, 18.42f,16,0.778f));

        game.setHomePlayerStats(homePlayerStats);
        game.setAwayPlayerStats(awayPlayerStats);

        bulls.addGame(game);
        bucks.addGame(game);

        return game;
    }

    private static Game initGame3(Team bulls, Team bucks) {
        Game game = new Game(new NBADate(2022, 12, 28));
        ArrayList<PlayerGameStats> homePlayerStats = new ArrayList<>();
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("DeRozan"), game, 44.42f,42,0.6f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Williams"), game, 41.22f,8,0.333f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Vucevic"), game, 36.5f,15,0.417f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("LaVine"), game, 42.67f,24,0.444f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Dosunmu"), game, 37.78f,6,0.286f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Drag"), game, 19.5f,12,0.455f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("White"), game, 5.68f,0,0f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Green"), game, 16.67f,5,0.333f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Drummond"), game, 16.3f,7,0.667f));
        homePlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Terry"), game, 4.27f,0,0f));

        ArrayList<PlayerGameStats> awayPlayerStats = new ArrayList<>();
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Connaughton"), game, 21.33f,0,0f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Antetokounmpo"), game, 42.25f,45,0.436f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Lopez"), game, 37.38f,14,0.417f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Allen"), game, 30.85f,13,0.25f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Carter"), game, 24.85f,5,0.667f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Portis"), game, 28.33f,20,0.389f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Matthews"), game, 30.85f,3,0.2f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Hill"), game, 28.35f,8,0.429f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Ingles"), game, 19.18f,5,0.333f));
        awayPlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Beauchamp"), game, 1.62f,0,0f));

        game.setHomePlayerStats(homePlayerStats);
        game.setAwayPlayerStats(awayPlayerStats);

        bulls.addGame(game);
        bucks.addGame(game);

        return game;
    }

    private static Game initGame4(Team bulls, Team bucks) {
        Game game = new Game(new NBADate(2023, 2, 16));
        ArrayList<PlayerGameStats> homePlayerStats = new ArrayList<>();
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Allen"), game, 27.82f,10,0.4f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Antetokounmpo"), game, 9.32f,2,0.25f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Lopez"), game, 33.2f,33,0.722f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Carter"), game, 32.03f,22,0.692f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Holiday"), game, 28.18f,15,0.333f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Matthews"), game, 19.83f,5,0.333f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Beauchamp"), game, 22.15f,2,0f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Ingles"), game, 21.42f,5,0.25f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Green"), game, 23.1f,15,0.625f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Mamukelashvili"), game, 19.43f,2,0f));
        homePlayerStats.add(new PlayerGameStats(bucks.getPlayerByLastName("Antetokounmpo"), game, 3.52f,1,0f));

        ArrayList<PlayerGameStats> awayPlayerStats = new ArrayList<>();
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("LaVine"), game, 31.95f,18,0.313f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Williams"), game, 30.03f,16,0.6f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Vucevic"), game, 31.35f,22,0.4f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("White"), game, 37f,8,0.286f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Dosunmu"), game, 35.58f,7,0.273f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Terry"), game, 27.03f,13,0.5f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Drummond"), game, 13.13f,5,0.333f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Hill"), game, 6.88f,5,0.5f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Jones"), game, 21.72f,1,0f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Bradley"), game, 3.52f,5,0.667f));
        awayPlayerStats.add(new PlayerGameStats(bulls.getPlayerByLastName("Simonov"), game, 1.8f,0,0f));

        game.setHomePlayerStats(homePlayerStats);
        game.setAwayPlayerStats(awayPlayerStats);

        bulls.addGame(game);
        bucks.addGame(game);

        return game;
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
