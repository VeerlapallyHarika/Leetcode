class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int cur = target.charAt(i) - 'a';

            if (freq[cur] > 0) {
                freq[cur]--;
                ans.append(target.charAt(i));
            } else {
                int next = -1;
                for (int j = cur + 1; j < 26; j++) {
                    if (freq[j] > 0) {
                        next = j;
                        break;
                    }
                }
                if (next != -1) {
                    freq[next]--;
                    ans.append((char) ('a' + next));
                    for (int j = 0; j < 26; j++) {
                        while (freq[j]-- > 0) {
                            ans.append((char) ('a' + j));
                        }
                    }
                    return ans.toString();
                }
                break;
            }
        }
        for (int i = ans.length() - 1; i >= 0; i--) {
            int cur = ans.charAt(i) - 'a';
            freq[cur]++;
            for (int j = cur + 1; j < 26; j++) {
                if (freq[j] > 0) {
                    freq[j]--;
                    StringBuilder res = new StringBuilder(ans.substring(0, i));
                    res.append((char) ('a' + j));
                    for (int k = 0; k < 26; k++) {
                        while (freq[k]-- > 0) {
                            res.append((char) ('a' + k));
                        }
                    }
                    return res.toString();
                }
            }
        }
        return "";
    }
}