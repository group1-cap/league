package league;

import java.util.Map;

public class App {
    public static void main(String[] args) {
    Art initArt = new Art();
    initArt.init();

        Delay setDelay = new Delay();
        Initiate match = new Initiate();                                                //create new match

        Map<Integer, Team> tournamentMembers = match.initiates();                       //create new match
        tournamentMembers.get(5).setProfessional(true);
        tournamentMembers.get(6).setProfessional(true);
        tournamentMembers.get(7).setProfessional(true);
        tournamentMembers.get(8).setProfessional(true);

        tournamentMembers.get(1).setTeamName("FC Den Haag");
        tournamentMembers.get(2).setTeamName("FC Amsterdam");
        tournamentMembers.get(3).setTeamName("FC Zwolle");
        tournamentMembers.get(4).setTeamName("FC Arnhem");
        tournamentMembers.get(5).setTeamName("FC Heerenveen");
        tournamentMembers.get(6).setTeamName("FC Groningen");
        tournamentMembers.get(7).setTeamName("FC Den Bosch");
        tournamentMembers.get(8).setTeamName("FC Eindhoven");

        Match newMatch = new Match();
        int teamWinnerMatch1Game1;
        int teamWinnerMatch1Game2;
        int teamWinnerMatch1Game3;
        int teamWinnerMatch1Game4;
        int teamWinnerMatch2Game1 = 0;
        int teamWinnerMatch2Game2 = 0;
        int teamWinnerMatch3Game1 = 0;


        //int matchNumber, int teamNumber1, int teamNumber2
        //match1, 4 games, 8 teams
        System.out.println("\n----ROUND 1----");
        teamWinnerMatch1Game1 = newMatch.simulateGame(tournamentMembers.get(1).getTeamNumber(), tournamentMembers.get(5).getTeamNumber(), tournamentMembers);
        teamWinnerMatch1Game2 = newMatch.simulateGame(tournamentMembers.get(2).getTeamNumber(), tournamentMembers.get(6).getTeamNumber(), tournamentMembers);
        teamWinnerMatch1Game3 = newMatch.simulateGame(tournamentMembers.get(3).getTeamNumber(), tournamentMembers.get(7).getTeamNumber(), tournamentMembers);
        teamWinnerMatch1Game4 = newMatch.simulateGame(tournamentMembers.get(4).getTeamNumber(), tournamentMembers.get(8).getTeamNumber(), tournamentMembers);

        System.out.println("Team 1/5 \t(" + tournamentMembers.get(1).getTeamScore() + "-" + tournamentMembers.get(5).getTeamScore() + ") \tWinning team: " + teamWinnerMatch1Game1); setDelay.setDelay();
        System.out.println("Team 2/6 \t(" + tournamentMembers.get(2).getTeamScore() + "-" + tournamentMembers.get(6).getTeamScore() + ") \tWinning team: " + teamWinnerMatch1Game2); setDelay.setDelay();
        System.out.println("Team 3/7 \t(" + tournamentMembers.get(3).getTeamScore() + "-" + tournamentMembers.get(7).getTeamScore() + ") \tWinning team: " + teamWinnerMatch1Game3); setDelay.setDelay();
        System.out.println("Team 4/8 \t(" + tournamentMembers.get(4).getTeamScore() + "-" + tournamentMembers.get(8).getTeamScore() + ") \tWinning team: " + teamWinnerMatch1Game4); setDelay.setDelay();


        //match2, 2 games, 4 teams
        System.out.println("\n----ROUND 2----");
        teamWinnerMatch2Game1 = newMatch.simulateGame(2, teamWinnerMatch1Game1, teamWinnerMatch1Game2, tournamentMembers);
        teamWinnerMatch2Game2 = newMatch.simulateGame(2, teamWinnerMatch1Game3, teamWinnerMatch1Game4, tournamentMembers);

        System.out.println("Team " + teamWinnerMatch1Game1 + "/" + teamWinnerMatch1Game2 + " \t("
                + tournamentMembers.get(teamWinnerMatch1Game1).getTeamScore() + "-" + tournamentMembers.get(teamWinnerMatch1Game2).getTeamScore()
                + ") \tWinning team: " + teamWinnerMatch2Game1); setDelay.setDelay();
        System.out.println("Team " + teamWinnerMatch1Game3 + "/" + teamWinnerMatch1Game4 + " \t("
                + tournamentMembers.get(teamWinnerMatch1Game3).getTeamScore() + "-" + tournamentMembers.get(teamWinnerMatch1Game4).getTeamScore()
                + ") \tWinning team: " + teamWinnerMatch2Game2); setDelay.setDelay();


        //match3, 1 games, 2 teams
        System.out.println("\n----ROUND 3, FINAL ROUND----");
        teamWinnerMatch3Game1 = newMatch.simulateGame(3, teamWinnerMatch2Game1, teamWinnerMatch2Game2, tournamentMembers);

        System.out.println("Team " + teamWinnerMatch2Game1 + "/" + teamWinnerMatch2Game2 + " \t("
                + tournamentMembers.get(teamWinnerMatch2Game1).getTeamScore() + "-" + tournamentMembers.get(teamWinnerMatch2Game2).getTeamScore()
                + ") \tWinning team: " + teamWinnerMatch3Game1); setDelay.setDelay();


        Art sponsoredArt = new Art();
        if (teamWinnerMatch3Game1 >= 5) {
            System.out.println("\n\nSponsored team: \"" + tournamentMembers.get(teamWinnerMatch3Game1).getTeamName() + "\" won the tournament");
            sponsoredArt.sponsored();
        } else {
            System.out.println("\n\nAmature Team: \"" + tournamentMembers.get(teamWinnerMatch3Game1).getTeamName() + "\" won the tournament, cheers!\n");
            sponsoredArt.amature();
        }
    }
}


//        for (Map.Entry<Integer, Integer> valuePair : teamMap.entrySet()) {
//        System.out.println(valuePair.getKey() + ", " + valuePair.getValue());
//
//        }

