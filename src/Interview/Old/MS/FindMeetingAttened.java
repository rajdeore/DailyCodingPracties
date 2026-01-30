package Interview.Old.MS;

import java.util.Arrays;

public class FindMeetingAttened {

    public static void main(String[] args) {
        float[] startTime = {1, 1.5f,  2, 3, 4};
        float[] endTime = {2, 2.5f, 3, 4, 5};

        Arrays.sort(startTime);
        Arrays.sort(endTime);

        int meetingAttened = findMeetingAttened(startTime, endTime);
        System.out.println("MeetingAttened = " + meetingAttened);

    }

    private static int findMeetingAttened(float[] startTime, float[] endTime) {
        if(startTime.length == 0){
            return 0;
        }
        int meetingCount = 1;
        int curMeeting = 1;
        int attedMeetingTime = 1;
        while(curMeeting <= startTime.length-1)
        {
            if(startTime[curMeeting] >= endTime[attedMeetingTime]){
                attedMeetingTime = curMeeting;
                meetingCount++;
            }

            curMeeting += 1;
        }
        return meetingCount;
    }
}
