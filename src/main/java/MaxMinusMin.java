
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javafx.util.converter.IntegerStringConverter;

import java.util.*;


public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        
        return (max-min);

        // 2nd Way (WITHOUT COLLECTIONS package imported): VERIFY with INSTRUCTOR!
        // int max = Integer.MAX_VALUE;
        // int min = Integer.MIN_VALUE;
        // int Final = max-min;
        // for(int i: nums){
        //     if(max > i){
        //         max = i;
        //     }
        //     if(min < i){
        //         min = i;
        //     }

        // }
        // return Final;
    }
}
