class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;
        int r = 0;
        for(int i = 0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                l =  Math.max(l,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            r++;
            max = Math.max(max,r-l);
        }
        return max;
    }
}