public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        ListNode list1 = head;
        ListNode list2 = reverse(slow);
        int max = Integer.MIN_VALUE;
        while(list2 != null) {
            max = Math.max(max, list1.val + list2.val);
            list1 = list1.next;
            list2 = list2.next; 
        }
        return max;
}

private ListNode reverse(ListNode head) {
    ListNode previous = null;
    ListNode current = head;
    ListNode adjacent = null;
    while(current != null) {
        adjacent = current.next;
        current.next = previous;
        previous = current;
        current = adjacent;
    }
    head = previous;
    return head;
}
