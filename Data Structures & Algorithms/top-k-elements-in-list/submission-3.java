class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
         hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }   
        List<Integer> l=new ArrayList<>(hm.keySet());
        Collections.sort(l,(a,b)->hm.get(b)-hm.get(a));
        for(int j=0;j<k;j++){
            arr[j]=l.get(j);
        }

    return arr;
    }
}
