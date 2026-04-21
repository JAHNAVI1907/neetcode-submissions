class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i=0;
        int n=nums.length;
        int prd[]=new int[n];
        int product=1;
        while(i<n){
            for(int j=0;j<n;j++){
                if(i!=j){
                    product=product*nums[j];
                }
            }
            prd[i]=product;
            i++;
            product=1;

        }
        return prd;
    }
}  
