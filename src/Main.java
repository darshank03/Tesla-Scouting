import com.cpjd.main.TBA;
import com.cpjd.models.events.Event;
import com.cpjd.models.events.EventOPR;
import com.cpjd.models.teams.Team;

//DO NOT RUN CcwmFromTesla UNTIL EVERY TEAM HAS
//PLAYED AT LEAST ONE MATCH OR IT WILL GIVE A
//NULL-POINTER ERROR BECAUSE OF NON-EXISTENT
//CCWM VALUES


public class Main {
    static int keyToNum(String key){
        key = key.replace("frc", "");
        return Integer.parseInt(key);
    }

     public static void main(String[] args) {
        CcwmFromRecent.ccwmRecent();
     }
}
