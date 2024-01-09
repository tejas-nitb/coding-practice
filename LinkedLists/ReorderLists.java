public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode lastHead = null;
        if (slow != null) {
            ListNode adjacent = null;
            ListNode previous = null;
            ListNode current = slow.next;
            while (current != null) {
                adjacent = current.next;
                current.next = previous;
                previous = current;
                current = adjacent;
            }
            slow.next = null;
            lastHead = previous;
        }
        if (lastHead != null) {
            ListNode firstHead = head;
            ListNode firstHeadNext = null;
            ListNode lastHeadNext = null;
            while (firstHead != null && lastHead != null) {
                firstHeadNext = firstHead.next;
                lastHeadNext = lastHead.next;
                firstHead.next = lastHead;
                lastHead.next = firstHeadNext;
                firstHead = firstHeadNext;
                lastHead = lastHeadNext;
            }
        }
  }
