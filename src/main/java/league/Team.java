package league;


    public class Team implements TeamBase {
        private String teamName;
        private int teamNumber;
        private int teamScore;
        private boolean professional;
        private int teamMembers = 12;

        @Override
        public int checkTeamMembers() {                 //Override teamMembers from Interface(TeamBase)
            if (teamMembers < 10) {
                System.out.println("Not enough team-players");
                System.exit(1);
            }
            return 0;
        }

        public Team() {                                 //base-constructor

        }

        public Team(int teamNumber) {                 //2'nd constructor
            this.teamNumber = teamNumber;
        }


        public int getTeamNumber() {                  //getter
            return teamNumber;
        }

        public void setTeamNumber(int teamNumber) {   //setter
            this.teamNumber = teamNumber;
        }

        public int getTeamScore() {                   //getter
            return teamScore;
        }

        public void setTeamScore(int teamScore) {     //setter
            this.teamScore = teamScore;
        }

        public boolean getProfessional() {               //getter
            return professional;
        }

        public void setProfessional(boolean setProfessional) { //setter
            this.professional = setProfessional;
        }


        public int getTeamMembers() {              //getter
            return teamMembers;
        }

        public void setTeamMembers(int teamMembers) { //setter
            this.teamMembers = teamMembers;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }
    }


