class Solution {
    public boolean isAnagram(String s, String t) {
         char[] ch=s.toCharArray();
         char[] ch1=t.toCharArray();
         Arrays.sort(ch);
         Arrays.sort(ch1);
         String a=new String(ch);
         String b=new String(ch1);
        boolean x=true;
        if(a.length()!=b.length()){
             x=false;
        }else{
            for(int i=0;i<s.length();i++){
                if(a.charAt(i)!=b.charAt(i)){
                    x=false;
                }
            }
        }
        return x;
    }
}
