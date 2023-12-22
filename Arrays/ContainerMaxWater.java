public static int maxAreaContainer(ArrayList<Integer> arr) {
		int i = 0;
        int j = arr.size()-1;
        int res = 0;
        while(i < j){
            if(arr.get(i) > arr.get(j)){
                res = Math.max(res,Math.min(arr.get(i),arr.get(j))*(j-i));
                j-=1;    
            } else {
                res = Math.max(res,Math.min(arr.get(i),arr.get(j))*(j-i));
                i+=1;
            }
        }    
        return res;    
	}
