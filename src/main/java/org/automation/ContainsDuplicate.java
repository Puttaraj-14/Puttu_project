package org.automation;

import java.util.HashSet;

class ContainsDuplicate {
    public static boolean duplicate(int[] nums){
        HashSet<Integer> unique = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(unique.contains(nums[i])){
                return true;
            }
             unique.add(nums[i]);
        }
        return false;
    }
    public static void main(String[]args){
        int [] data={1,2,8,9,0,1,9,6};
        System.out.println(duplicate(data));
}
}

