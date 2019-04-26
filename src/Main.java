import com.cpjd.main.TBA;
import com.cpjd.models.events.Event;
import com.cpjd.models.events.EventOPR;
import com.cpjd.models.teams.Team;

/*DO NOT RUN CcwmFromTesla UNTIL EVERY TEAM HAS
PLAYED AT LEAST ONE MATCH OR IT WILL GIVE A
NULL-POINTER ERROR BECAUSE OF NON-EXISTENT
CCWM VALUES*/


public class Main {
    static int keyToNum(String key){
        key = key.replace("frc", "");
        return Integer.parseInt(key);
    }
    private static void willWeWin(int [] teams) {
        Object[][] teamStatArray = new Object[68][2];
        int ourScore=0;
        int theirScore=0;
        TBA.setAuthToken("GtPgt3KxWPRM3VHt6H7ydrUcT8RXQy69Dk12p08I1uqzDevaGbzfqOuq9nwYqy5T");
        TBA tba = new TBA();
        Team[] tesla = tba.getEventTeams("2019tes");

        try {
            for (int i = 0; i < 8; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 8; i < 9; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 9; i < 13; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 13; i < 14; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event recentEvent = tba.getEvent("2019tes");
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 14; i < 15; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 15; i < 33; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 33; i < 34; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 34; i < 44; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 44; i < 45; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 45; i < 47; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 47; i < 48; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 48; i < tesla.length; i++) {
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event[] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length - 1;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs = tba.getOprs(eventName);
                for (EventOPR opr : oprs) {
                    if (Main.keyToNum(opr.getTeamKey()) == teamNumber) {
                        Object[] teamStat = new Object[2];
                        teamStat[0] = Main.keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getOpr();
                        teamStatArray[i] = teamStat;
                    }
                }
            }

            for (int i = 0; i < teamStatArray.length; i++) {
                for (int j = 0; j < teamStatArray.length - i - 1; j++) {
                    if (Double.parseDouble(teamStatArray[j][1].toString()) < Double.parseDouble(teamStatArray[j + 1][1].toString())) {
                        Object[] tmp = teamStatArray[j];
                        teamStatArray[j] = teamStatArray[j + 1];
                        teamStatArray[j + 1] = tmp;
                    }
                }
            }
            for(int i = 0; i < teams.length; i++){

                for(Object [] matchTeam : teamStatArray){
                    if(matchTeam[0].equals(teams[i])){
                        if(i<3){
                            ourScore += Double.parseDouble(String.valueOf(matchTeam[1]));
                        }
                        else{
                            theirScore += Double.parseDouble(String.valueOf(matchTeam[1]));
                        }
                    }
                }
            }
            if(ourScore < theirScore){
                System.out.println("We will lose");
                System.out.println("our opr is "+ourScore);
                System.out.println("their opr is "+theirScore);
            }else if(ourScore > theirScore){
                System.out.println("We will win");
                System.out.println("our opr is "+ourScore);
                System.out.println("their opr is "+theirScore);
            }else{
                System.out.println("TIE");
                System.out.println("our opr is "+ourScore);
                System.out.println("their opr is "+theirScore);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

     public static void main(String[] args) {
        int [] Array1 = {5422,5667,203,7626,333,2576};
        int [] Array2 = {5422,5992,2626,1629,7457,3026};
        int [] Array3 = {5422,4817,610,1262,7460,3324};
        int [] Array4 = {5422,548,4145,3313,2358,346};
        int [] Array5 = {5422,5618,4329,4122,27,5401};
        int [] Array6 = {5422,2095,1155,379,4338,4967};
        int [] Array7 = {5422,3197,6909,7850,1259,341};
        int [] Array8 = {5422,1153,5934,1747,4590,4917};
        int [] Array9 = {5422,6569,6964,4817,5205,6574};
        int [] Array10 = {5422,3620,3572,2168,4329,5585};
        willWeWin(Array1);
        willWeWin(Array2);
        willWeWin(Array3);
        willWeWin(Array4);
        willWeWin(Array5);
        willWeWin(Array6);
        willWeWin(Array7);
        willWeWin(Array8);
        willWeWin(Array9);
        willWeWin(Array10);

     }
}
