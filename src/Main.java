import com.cpjd.main.TBA;
import com.cpjd.models.events.Event;
import com.cpjd.models.events.EventOPR;
import com.cpjd.models.teams.Team;

public class Main {
    public static int keyToNum(String key){
        int len = key.length();
        key = key.replace("frc", "");
        int key2 = Integer.parseInt(key);
        return key2;
    }

    /*public static void main(String[] args) {
        TBA.setAuthToken("7OQs1gZNI4oaw5vA7KypSoIrWT24z83rvr9tkkf9XaEkoSOQETbPkseiuMGO8snZ");
        TBA tba = new TBA();
        Team team = tba.getTeam(4907);
        int teamNumber = Math.toIntExact(team.getTeamNumber());
        Event [] teamEvents = tba.getTeamEvents(teamNumber);
        int recentEventIndex = teamEvents.length-3;
        Event recentEvent = teamEvents[recentEventIndex];
        System.out.println(recentEvent.getName());
        for(EventOPR opr : tba.getOprs(recentEvent.getKey())){
            if(opr.getTeamKey().equals(team.getKey())){
                System.out.println(team.getKey());
                System.out.println(opr.getCcwm());
            }
        }
    }*/
     public static void main(String[] args) {

        TBA.setAuthToken("7OQs1gZNI4oaw5vA7KypSoIrWT24z83rvr9tkkf9XaEkoSOQETbPkseiuMGO8snZ");
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
                    }
                }
            }
            for(int i = 14; i < 15; i++){
                Team team = tesla[i];
                int teamNumber = Math.toIntExact(team.getTeamNumber());
                Event [] teamEvents = tba.getTeamEvents(teamNumber);
                int recentEventIndex = teamEvents.length-4;
                Event recentEvent = teamEvents[recentEventIndex];
                String eventName = recentEvent.getKey();
                EventOPR[] oprs =  tba.getOprs(eventName);
                for (EventOPR opr : oprs){
                    if(keyToNum(opr.getTeamKey()) == teamNumber){
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
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
                        System.out.println(keyToNum(opr.getTeamKey()));
                        System.out.println(opr.getCcwm());
                    }
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }

}
