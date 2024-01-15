public static boolean findDuplicate(int[] arr) {
        Set<Integer> integers = new HashSet<>();
        for(Integer i: arr) {
            if(integers.contains(i)) {
                return true;
            } else {
                integers.add(i);
            }
        }
        return false;
}
