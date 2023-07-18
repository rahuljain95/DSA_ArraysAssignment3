// Question 8
// Given an array of meeting time intervals where intervals[i] = [starti, endi],
// determine if a person could attend all meetings.

// Example 1:
// Input: intervals = [[0,30],[5,10],[15,20]]
// Output: false

public class MeetingRoom {
	public static boolean canAttend(int[][] intervals){
		if(intervals == null || intervals.length == 0) return true;
		for(int i = 1; i < intervals.length; i++){
			if(intervals[i][0] < intervals[i - 1][1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] t = {{0, 30}, {5, 10}, {15, 20}};
		System.out.println(canAttend(t));
	}
}