package league;

import java.util.Map;

public class Match {

    public int simulateGame(int teamNumber1, int teamNumber2, Map<Integer, Team> arrayPointer) {

        int winningTeam = 0x0;

        short x = (short) genRandomNumber(teamNumber1);
        short y = (short) genRandomNumber(teamNumber2);

        if (x > y) {
            winningTeam = teamNumber1;
            arrayPointer.get(teamNumber1).setTeamScore((int) x);
            arrayPointer.get(teamNumber2).setTeamScore((int) y);
            //System.out.println("Rand x: " + x);
        } else if (x < y) {
            winningTeam = teamNumber2;
            arrayPointer.get(teamNumber1).setTeamScore((int) x);
            arrayPointer.get(teamNumber2).setTeamScore((int) y);
            //System.out.println("Rand y: " + y);
        } else {
            System.out.println("\n### ! DRAW GAME !(" + x + "-" + y + "), Taking penalties ! ###\n");
            double a = genRandomNumber(teamNumber1);
            double b = genRandomNumber(teamNumber2);
            if (a > b) {
                winningTeam = teamNumber1;
                arrayPointer.get(teamNumber1).setTeamScore((int) a);
                arrayPointer.get(teamNumber2).setTeamScore((int) b);
                System.out.println("\tPenalties of team " + teamNumber1 + " scored: " + (int) a + "\n\tPenalties of team " + teamNumber2 + " scored: " + (int) b + "\n");
            } else if (a < b) {
                winningTeam = teamNumber2;
                arrayPointer.get(teamNumber1).setTeamScore((int) a);
                arrayPointer.get(teamNumber2).setTeamScore((int) b);
                System.out.println("\tPenalties of team " + teamNumber1 + " scored: " + (int) a + "\n\tPenalties of team " + teamNumber2 + " scored: " + (int) b + "\n");
            } else {
                System.out.println("PERROR: NUM GEN COLLISION");
                System.exit(1);
            }
        }

        return (winningTeam);
    }

    //OVERLOAD
    public int simulateGame(int matchNumber, int teamNumber1, int teamNumber2, Map<Integer, Team> arrayPointer) {

        int winningTeam = 0x0;

        short x = (short) genRandomNumber(teamNumber1);
        short y = (short) genRandomNumber(teamNumber2);

        if (x > y) {
            winningTeam = teamNumber1;
            arrayPointer.get(teamNumber1).setTeamScore((int) x);
            arrayPointer.get(teamNumber2).setTeamScore((int) y);
            //System.out.println("Rand x: " + x);
        } else if (x < y) {
            winningTeam = teamNumber2;
            arrayPointer.get(teamNumber1).setTeamScore((int) x);
            arrayPointer.get(teamNumber2).setTeamScore((int) y);
            //System.out.println("Rand y: " + y);
        } else {
            System.out.println("\n### ! DRAW GAME !(" + x + "-" + y + "), Taking penalties ! ###\n");
            double a = genRandomNumber(teamNumber1);
            double b = genRandomNumber(teamNumber2);
            if (a > b) {
                winningTeam = teamNumber1;
                arrayPointer.get(teamNumber1).setTeamScore((int) a);
                arrayPointer.get(teamNumber2).setTeamScore((int) b);
                System.out.println("\tPenalties of team " + teamNumber1 + " scored: " + (int) a + "\n\tPenalties of team " + teamNumber2 + " scored: " + (int) b + "\n");
            } else if (a < b) {
                winningTeam = teamNumber2;
                arrayPointer.get(teamNumber1).setTeamScore((int) a);
                arrayPointer.get(teamNumber2).setTeamScore((int) b);
                System.out.println("\tPenalties of team " + teamNumber1 + " scored: " + (int) a + "\n\tPenalties of team " + teamNumber2 + " scored: " + (int) b + "\n");
            } else {
                System.out.println("PERROR: NUM GEN COLLISION FOR MATCH NR: "+ matchNumber);
                System.exit(1);
            }
        }

        return (winningTeam);
    }


        public double genRandomNumber(int teamXY) {
        double x = (Math.random() * 10);
        double y = x * 1.25;
        if (teamXY >= 5) {
            Math.ceil(y);
            return y;
        } else {
            Math.ceil(x);
            return x;
        }
    }
}
