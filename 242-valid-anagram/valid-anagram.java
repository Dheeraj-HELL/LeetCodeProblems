class Solution {
    public boolean isAnagram(String s, String t) {
        // s.sort();
        // t.sort();
        char[] S=s.toCharArray();
        Arrays.sort(S);
        char[] T=t.toCharArray();
        Arrays.sort(T);
        if(S.length!=T.length) return false;
        // for(int i=0;i<s.length();i++){
        //     if(S[i]!=T[i]){
        //         return false;
                
        //     }else{
        //         return true;
        //     }
        // }
        int i=0;
        boolean ans=true;
        while(i<S.length ){
            if(S[i]!=T[i]){
                ans=false;
            }
            i++;
            
        }
        return ans;
    }
}