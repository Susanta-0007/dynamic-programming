import java.util.Arrays;

public class ClimbingStairs {

    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return countWays(n - 1) + countWays(n - 2);
    }

    // Memolization

    public static int countWaysDP(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = countWaysDP(n - 1) + countWaysDP(n - 2);

        return dp[n];
    }

    // Tabulaction

    public static int countWaysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWaysTab(n));
    }
}
