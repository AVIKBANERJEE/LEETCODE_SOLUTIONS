class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] res=new int[k];
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
        (a, b) -> a.getValue() - b.getValue() // Min-heap based on frequency
    );
    
    // Maintain a heap of size k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry);
            if (heap.size() > k) {
                heap.poll(); // Remove the element with the smallest frequency
            }
        }

        // Extract the k most frequent elements from the heap
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll().getKey();
        }

        return res;
        
    }
}
