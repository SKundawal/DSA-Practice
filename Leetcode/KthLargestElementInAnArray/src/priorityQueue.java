import java.util.PriorityQueue;

public class priorityQueue {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.offer(num);
            if(pq.size() > k){
                pq.remove();
            }
        }

        return pq.peek();
    }
}
