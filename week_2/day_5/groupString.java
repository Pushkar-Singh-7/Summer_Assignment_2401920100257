class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        StringBuilder res = new StringBuilder();
        char ch = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ch) {
                count++;
            } else {
                res.append(ch);
                if (count != 1) {
                    res.append(count);
                }
                ch = chars[i];
                count = 1;
            }
        }
        res.append(ch);
        if (count != 1) {
            res.append(count);
        }
        for (int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }

        return res.length();
    }
}
