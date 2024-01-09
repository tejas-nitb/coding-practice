public static Node mergeKLists(Node arr[]) {
        int last = k-1;
        while (last != 0)  { 
            int i = 0, j = last;
            while (i < j)  {
                arr[i] = sortedMerge(arr[i], arr[j]);
                i++; 
                j--;
                if (i >= j) 
                    last = j; 
            }
        }
        return arr[0]; 
} 

private static Node sortedMerge(Node a, Node b) { 
        Node result = null; 
        if (a == null) 
            return b; 
        else if (b == null) 
            return a;  
        if (a.data <= b.data) { 
            result = a;
            result.next = sortedMerge(a.next, b); 
        } else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
    } 
