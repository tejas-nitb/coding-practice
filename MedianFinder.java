class MedianFinder {

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num < maxHeap.peek()) {
            maxHeap.add(num);
            if(maxHeap.size() - minHeap.size() > 1) {
                minHeap.add(maxHeap.poll());
            }
        } else {
            minHeap.add(num);
            if(minHeap.size() - maxHeap.size() >= 1) {
                maxHeap.add(minHeap.poll());
            }
        }
    }
    
    public double findMedian() {
        double median = maxHeap.peek();
        if(maxHeap.size() - minHeap.size() == 0) {
            median =  (median + minHeap.peek()) / 2;
        }
        return median;
    }
    
}
