public static boolean detectCycle(LinkedListNode head) {
    LinkedListNode slow = head;
    LinkedListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast) {
        return true;
      }
    }
    if(fast == null) {
      return false;
    }
    return false;
}
