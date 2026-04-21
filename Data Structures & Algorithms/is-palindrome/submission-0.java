class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int r=s.length()-1;
        boolean x=true;
        while(l<r){
            
            if(s.charAt(l)!=s.charAt(r)){
             x=false;
             break;
            }
            l++;
            r--;
        }
        return x;
    }
}
