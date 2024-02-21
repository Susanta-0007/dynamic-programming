class Fabbonacci {

    // Recursion Approach

    public static int fibbo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibbo(n - 1) + fibbo(n - 2);
    }

    // Dynamic Programming Approach => Memoization 

    public static int fibboDP(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f[] = new int[n + 1];
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fibboDP(n - 1) + fibboDP(n - 2);

        return f[n];
    }

    // Tabulaction Approach => Normal Itreation

    public static int fibboTabular(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
   
    public static void main(String[] args) {

        int n = 5;
        System.out.println(fibboTabular(n));
    }
}
