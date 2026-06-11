
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String, List<String>> map = new HashMap<>();

        for(String word : strs) {

            StringBuilder keyBuilder = new StringBuilder();
            int[] letters = new int[26];
            
            for(int i =  0; i < word.length(); i ++) {

                char ch = word.charAt(i);
                letters[ch - 'a']++;
            }

            for(int j = 0; j < 26; j ++) {

                keyBuilder.append("#");
                keyBuilder.append(letters[j]);
            }

            String key = keyBuilder.toString();

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
