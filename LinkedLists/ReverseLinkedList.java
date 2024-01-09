public static Node reverse(Node node) {
        Node previous = null;
        Node current = node;
        Node adjacent = null;
        while (current != null) {
            adjacent = current.next;
            current.next = previous;
            previous = current;
            current = adjacent;
        }
        node = previous;
        return node;
}
