package TopKFrequentElements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class function {
    public static List<Integer> topKFrequent (int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        List<Integer> list= map.entrySet().stream().sorted((a, b)->b.getValue()-a.getValue()).map(a->a.getKey()).collect(Collectors.toList());
        return list.subList(0,k);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        List list = topKFrequent(nums, k);
        System.out.println(list);
    }
}
