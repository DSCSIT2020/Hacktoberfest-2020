Problem link: https://leetcode.com/problems/edit-distance/

class Solution {
public:
    int minDistance(string word1, string word2) {
        string w1 = " " + word1;
        string w2 = " " + word2;
        vector<vector<int>> dp(w1.length(), vector<int> (w2.length()));
        for (int i = 0; i < dp.size(); ++i) dp[i][0] = i;
        for (int i = 0; i < dp[0].size(); ++i) dp[0][i] = i;
        for (int i = 1; i < dp.size(); ++i) {
            for (int j = 1; j < dp[0].size(); ++j) {
                if (w1[i] == w2[j]) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = min(dp[i - 1][j] + 1, min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + 1));
            }
        }
        return dp[word1.length()][word2.length()];
    }
};
