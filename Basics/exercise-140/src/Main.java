import java.util.ArrayList;

// Write a Java program to merge all overlapping intervals from a given collection of intervals.
public class Main {
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        intervals.add(new Interval(17, 20));

        mergeOverlappingIntervals(intervals);

        for (Interval interval : intervals) {
            System.out.println(interval);
        }
    }

    public static void mergeOverlappingIntervals(ArrayList<Interval> intervals) {
        for (int i = 0; i < intervals.size() - 1; i++) {
            if (intervals.get(i).end >= intervals.get(i+1).start) {
                intervals.get(i).end = intervals.get(i+1).end;
                intervals.remove(i+1);
            }
        }
    }
}

