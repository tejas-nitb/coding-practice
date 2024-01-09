public static Node merge(Node h1, Node h2) { 
        if (h1 == null) 
            return h2; 
        if (h2 == null) 
            return h1; 
        if (h1.data < h2.data) { 
            h1.next = merge(h1.next, h2); 
            return h1; 
        } else { 
            h2.next = merge(h1, h2.next); 
            return h2; 
        } 
    } 
