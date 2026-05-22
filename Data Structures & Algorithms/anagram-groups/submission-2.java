class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];


            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();

            for (int num : count) {
                keyBuilder.append("#");
                keyBuilder.append(num);
            }

            String key = keyBuilder.toString();

            res.putIfAbsent(key, new ArrayList<>());

            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
