package Interview.Old.MediaIo.Calender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalenderApp {


    public static void main(String[] args) {

        HashMap<Events, RESPONSE> u1EventS = new HashMap<>();
        User u1 = new User(1, "Raj1", u1EventS );
        Map<Events, RESPONSE> u2EventS = new HashMap<>();
        User u2 = new User(2, "Raj2", u2EventS );
        Map<Events, RESPONSE> u3EventS = new HashMap<>();
        User u3 = new User(3, "Raj3", u3EventS );

        //Demo Event
        List<User> participent = new ArrayList<>();
        Events e1 = new Events(1, u1, 2, 3, participent );

        //let imagin invite is send
        Map<Events, RESPONSE> u1Response = new HashMap<>();
        u1Response.put(e1, RESPONSE.ACCEPTED);
        //u1.setEvent(u1Response);




        System.out.println(e1.toString());

        System.out.println( u1.toString());

        //end point should return List Of List
        //response: [{630pm-7pm}, {730pm-8pm}]






    }
    public static void getFreeSlots(User owner, int startTime, int endTime){

    }
}
