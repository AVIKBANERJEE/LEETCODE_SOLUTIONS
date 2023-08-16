class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(); // To store indices of elements
        
        for (int i = 0; i < nums.length; i++) {
            // Remove elements that are out of the current sliding window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            
            // Remove smaller elements as they are no longer useful
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            // Add current element's index to the deque
            deque.offer(i);
            
            // The maximum element for the current sliding window is at the front of the deque
            if (i >= k - 1) {
                result.add(nums[deque.peek()]);
            }
        }
        
        int[] a = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            a[i] = result.get(i);
        }
        
        return a;
    }
}
