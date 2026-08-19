class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] freq_s= new int[26];
        

        for(int i=0; i<s.length(); i++){
            ++freq_s[s.charAt(i)-'a'];
            --freq_s[t.charAt(i)-'a'];
        }

        for(int i=0; i<freq_s.length; i++){
            if(freq_s[i]!=0){
                return false;
            }
        }
        return true;
    }
}