public static int search(ArrayList<Integer> arr, int n, int k) {
        int start = 0;
        int end = arr.size() - 1;
        while(start <= end) {
            int mid = start - (start - end)/2;
            if(arr.get(mid) == k) 
                return mid;
            if(arr.get(start) <= arr.get(mid)){
                if(k >= arr.get(start) && k <= arr.get(mid))  
                    end = mid - 1;
                else 
                    start = mid + 1;
            }
            if(arr.get(mid) <= arr.get(end)){
                if(k <= arr.get(end) && k >= arr.get(mid))  
                    start = mid + 1;
                else 
                    end = mid - 1;
            }
        }
        return -1;
    }
