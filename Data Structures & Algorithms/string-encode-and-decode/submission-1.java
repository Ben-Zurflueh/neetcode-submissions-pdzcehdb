class Solution {

    public String encode(List<String> strs) {
        String string = "";
        int length;

        for(String s : strs) {
            length = s.length();
            string += length + "#" + s;
        }
        return string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            
            int j = str.indexOf('#', i);
            if (j == -1) break;
            int length = Integer.parseInt(str.substring(i ,j));

            String tempString = str.substring(j + 1, j + 1 + length);
            decoded_strs.add(tempString);
            i = j + length;   
        }

        return decoded_strs;
    }
}
