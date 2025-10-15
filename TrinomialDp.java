public class TrinomialDP {
    public static int trinomial(int n, int k) {
        int size = 2 * n + 1;
        int[][] dp = new int[n + 1][size];
        dp[0][n] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < size - 1; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j] + dp[i - 1][j + 1];
            }
        }

        return dp[n][n + k];
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}
