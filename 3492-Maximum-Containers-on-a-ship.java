import static java.lang.Math.*;
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        long totalSlots = (long) n * n;
        long weightLimit = (long) maxWeight / w;
        return (int) min(totalSlots, weightLimit);
    }
}