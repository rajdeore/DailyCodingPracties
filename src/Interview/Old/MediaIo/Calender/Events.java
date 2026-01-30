package Interview.Old.MediaIo.Calender;

import java.util.List;

public class Events {
    private int eventId;
    private User OwnerName;
    private int timeStart;
    private int timeEnd;
    private List<User> participants;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public User getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(User ownerName) {
        OwnerName = ownerName;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public Events(int eventId, User ownerName, int timeStart, int timeEnd, List<User> participants) {
        this.eventId = eventId;
        OwnerName = ownerName;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Events{" +
                "eventId=" + eventId +
                ", OwnerName=" + OwnerName +
                ", timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                ", participants=" + participants +
                '}';
    }
}
