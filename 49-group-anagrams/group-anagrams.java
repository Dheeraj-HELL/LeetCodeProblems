class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map= new HashMap<>();
        for(String key : strs){
            char[] chars = key.toCharArray(); 
            Arrays.sort(chars);              
            String sortedKey = new String(chars); 

            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(key);

        }
        return new ArrayList<>(map.values());
    }
    
}