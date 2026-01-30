package Interview.Old.MediaIo.Calender;

import java.util.Map;

public class User {
    private int userId;
    private String userName;
    private Map<Events, RESPONSE> event;  //e1 -> ACCEPTED

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Map<Events, RESPONSE> getEvent() {
        return event;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEvent(Map<Events, RESPONSE> event) {
        this.event = event;
    }

    public User(int userId, String userName, Map<Events, RESPONSE> event) {
        this.userId = userId;
        this.userName = userName;
        this.event = event;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", event=" + event +
                '}';
    }
}
