public int[] topKFrequent(int[] nums, int k) {
        
      Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){ map.put(num, map.getOrDefault(num, 0) + 1); }
        
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(int key : map.keySet()){ maxHeap.add(key); }
        
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = maxHeap.poll();
        }
        
        return result;
    } 
