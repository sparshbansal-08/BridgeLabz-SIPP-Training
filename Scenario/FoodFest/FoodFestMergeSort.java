import java.util.*;

class Stall {
    String stallId;
    int footfallCount;

    public Stall(String stallId, int footfallCount) {
        this.stallId = stallId;
        this.footfallCount = footfallCount;
    }

    @Override
    public String toString() {
        return stallId + ": " + footfallCount + " visitors";
    }
}

public class FoodFestMergeSort {
    public static List<Stall> mergeSortedLogs(List<List<Stall>> zoneLogs) {
        if (zoneLogs.size() <= 1) {
            return zoneLogs.isEmpty() ? new ArrayList<>() : zoneLogs.get(0);
        }

        // Divide and conquer
        int mid = zoneLogs.size() / 2;
        List<List<Stall>> left = zoneLogs.subList(0, mid);
        List<List<Stall>> right = zoneLogs.subList(mid, zoneLogs.size());

        return merge(mergeSortedLogs(left), mergeSortedLogs(right));
    }

    public static List<Stall> merge(List<Stall> left, List<Stall> right) {
        List<Stall> result = new ArrayList<>();
        int i = 0, j = 0;

        // Merge while maintaining stability
        while (i < left.size() && j < right.size()) {
            if (left.get(i).footfallCount > right.get(j).footfallCount) {
                result.add(left.get(i));
                i++;
            } else if (left.get(i).footfallCount < right.get(j).footfallCount) {
                result.add(right.get(j));
                j++;
            } else {
                // If counts are equal, preserve relative order (stability)
                result.add(left.get(i));
                i++;
            }
        }

        // Append remaining elements
        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));
        return result;
    }

    public static List<Stall> foodFestSortStalls(List<List<Stall>> zoneLogs) {
        // Combine all zone logs into a single sorted list
        return mergeSortedLogs(zoneLogs);
    }

    public static void main(String[] args) {
        // Sample data: List of sorted logs per zone
        List<Stall> zone1 = Arrays.asList(
            new Stall("StallA", 100),
            new Stall("StallB", 50),
            new Stall("StallC", 30)
        );
        List<Stall> zone2 = Arrays.asList(
            new Stall("StallD", 80),
            new Stall("StallE", 50),
            new Stall("StallF", 20)
        );
        List<Stall> zone3 = Arrays.asList(
            new Stall("StallG", 90),
            new Stall("StallH", 50),
            new Stall("StallI", 10)
        );

        List<List<Stall>> zoneLogs = Arrays.asList(zone1, zone2, zone3);

        // Sort and combine all logs
        List<Stall> sortedStalls = foodFestSortStalls(zoneLogs);

        // Print results
        System.out.println("Combined and sorted stall footfall:");
        for (Stall stall : sortedStalls) {
            System.out.println(stall);
        }
    }
}