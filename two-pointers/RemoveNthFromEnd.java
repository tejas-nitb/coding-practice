public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
        LinkedListNode left = head;
        LinkedListNode right = head;
        for(int i=0; i < n; i++) {
            right = right.next;
        }
        if(right == null) {
            head = head.next;
            return head;
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        if(left.next != null) {
            left.next = left.next.next;
        }
        return head;
}
