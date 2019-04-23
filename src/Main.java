import com.cpjd.main.TBA;
import com.cpjd.models.events.Event;
import com.cpjd.models.events.EventOPR;
import com.cpjd.models.teams.Team;



public class Main {
    public static int keyToNum(String key){
        key = key.replace("frc", "");
        int key2 = Integer.parseInt(key);
        return key2;
    }

     public static void main(String[] args) {
        Object [][] teamStatArray = new Object[68][2];

        TBA.setAuthToken("GtPgt3KxWPRM3VHt6H7ydrUcT8RXQy69Dk12p08I1uqzDevaGbzfqOuq9nwYqy5T");
        TBA tba = new TBA();
        Team [] tesla = tba.getEventTeams("2019tes");

        try{
            for (int i = 0; i < 8; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-2;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for(int i = 8; i < 9; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-3;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 9; i < 13; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-2;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for(int i = 13; i < 14; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event recentEvent = tba.getEvent("2019necmp");
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for(int i = 14; i < 15; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-2;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 15; i < 33; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-2;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for(int i = 33; i < 34; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-3;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 34; i < 44; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-2;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for(int i = 44; i < 45; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-3;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 45; i < 47; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-2;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for(int i = 47; i < 48; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-3;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }
            for (int i = 48; i < tesla.length; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-2;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        Object[] teamStat = new Object[2];
                        teamStat[0] = keyToNum(opr.getTeamKey());
                        teamStat[1] = opr.getCcwm();
                        teamStatArray[i] = teamStat;
                    }
                }
            }

            for(int i=0; i < teamStatArray.length; i++){
                for(int j=0; j < teamStatArray.length-i-1; j++){
                    if(Double.parseDouble(teamStatArray[j][1].toString()) < Double.parseDouble(teamStatArray[j+1][1].toString())){
                        Object [] tmp = teamStatArray[j];
                        teamStatArray[j] = teamStatArray[j+1];
                        teamStatArray[j+1] = tmp;
                    }
                }
            }
            for(Object [] h : teamStatArray){
                for(Object g:h){
                    System.out.println(g);
                }
            }

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }


}
