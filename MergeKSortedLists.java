public static LinkedListNode<Integer> mergeKLists(LinkedListNode<Integer>[] listArray) {
        int k = listArray.length;
		PriorityQueue<LinkedListNode<Integer>> queue = new PriorityQueue<>(new NodeComparator());
		LinkedListNode<Integer> head = new LinkedListNode<>(0);
		LinkedListNode<Integer> last = head;
		for(int i=0; i<k ; i++) {
			if(listArray[i] != null) {
				queue.add(listArray[i]);
			}
		}
		if(queue.isEmpty()) {
			return null;
		}
		while(!queue.isEmpty()) {
			LinkedListNode<Integer> current = queue.poll();
			last.next = current;
			last = last.next;
			if(current.next != null) {
				queue.add(current.next);
			}
		}
		return head.next;
    }

	static class NodeComparator implements Comparator<LinkedListNode<Integer>> {
		public int compare(LinkedListNode<Integer> k1, LinkedListNode<Integer> k2) {
			if(k1.data > k2.data) {
				return 1;
			} else if(k1.data < k2.data) {
				return -1;
			} 
			return 0;
		}
	}
