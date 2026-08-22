class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int[] freq = new int[26];
        int maxfreq = 0;
        int left = 0;
        
        for (int right = 0; right < arr.length; right++) {
            freq[arr[right] - 'A']++;
            maxfreq = Math.max(maxfreq, freq[arr[right] - 'A']);
            
            if ((right - left + 1) - maxfreq > k) {
                freq[arr[left] - 'A']--;
                left++;
            }
        }
        
        return arr.length - left;
    }
}