package league;

import java.util.HashMap;
import java.util.Map;

public class Initiate extends Team {                             //create initiate method


    @Override
    public int checkTeamMembers() {
        System.out.println("Check team-members from Initialisation fase");
        return super.checkTeamMembers();
    }

    private Map<Integer, Team> teamMap;             //create empty hashmap pointer array for new teams


    public Map<Integer, Team> initiates() {         //create initiate method for new team array (teamMap)

        teamMap = new HashMap<>();
        teamMap.put(1, new Team(1));    //add new teams to teamMap
        teamMap.put(2, new Team(2));
        teamMap.put(3, new Team(3));
        teamMap.put(4, new Team(4));
        teamMap.put(5, new Team(5));
        teamMap.put(6, new Team(6));
        teamMap.put(7, new Team(7));
        teamMap.put(8, new Team(8));

        for (int x = 0; x < 0x8; x++) {
            if (teamMap.get(1).getTeamMembers() < 0x8) { //fix the x
                System.out.println("Team " + teamMap.get(x).getTeamNumber() + " disqualified, as is does not have at least 10 players");
                System.exit(1);
            }
        }

        return teamMap;
    }

}


//        Team team1 = new Team(1);
//        Team team2 = new Team(2);
//        Team team3 = new Team(3);
//        Team team4 = new Team(4);
//        Team team5 = new Team(5);
//        Team team6 = new Team(6);
//        Team team7 = new Team(7);
//        Team team8 = new Team(8);
