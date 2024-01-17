public String removeStars(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '*') {
                deque.pop();
            } else {
                deque.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while( !deque.isEmpty()) {
            sb.append(deque.pollLast());
        }
        return sb.toString();
}
