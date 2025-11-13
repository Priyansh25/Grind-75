package array.easy.meetingRooms;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        intervals.sort((a, b) -> a.start - b.start);

        for (int i = 0; i < intervals.size() - 1; i++) {
            if (intervals.get(i).end > intervals.get(i + 1).start) {
                return false;
            }
        }
        return true;
    }

    public static void main() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(4, 5));
        intervals.add(new Interval(7, 9));
        intervals.add(new Interval(9, 10));

        System.out.println("Possiible = " + new Solution().canAttendMeetings(intervals));
    }
}
