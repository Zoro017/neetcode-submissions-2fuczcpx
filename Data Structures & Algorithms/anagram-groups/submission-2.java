class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String , List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] s1 = s.toCharArray();
            Arrays.sort(s1);
            String ans = new String(s1);

            if(!map.containsKey(ans)){
                map.put(ans , new ArrayList<>());
            }
            map.get(ans).add(s);
        }        
        return new ArrayList(map.values());
    }
}
