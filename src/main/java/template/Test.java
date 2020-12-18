package template;

/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.09 11:52
 */
public class Test {

    public static void main(String[] args) {
//        AbstractClass a = new SubClassA();
//        AbstractClass b = new SubClassB();
//        a.abstractMethod();
//        System.out.println("-------------------");
//        b.abstractMethod();
////        System.out.println( fib(6));
//        long l1 = System.currentTimeMillis();
//
////        System.out.println( fib2(40));
//        System.out.println( fib(40));
//        long l2 = System.currentTimeMillis();
//        System.out.println(l2 - l1);

        dpQ1F();
    }

    public static int fib(int n) {

        if (n == 1 || n == 2) {
            return  1;
        }
//        System.out.println(n);
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {

        int[] dp = new int[n];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];

    }
    public static void dpQ1F() {
        int[][] baseQ = new int[8][8];
        baseQ[0] = new int[]{1,1,4,5};
        baseQ[1] = new int[]{2,3,5,1};
        baseQ[2] = new int[]{3,0,6,8};
        baseQ[3] = new int[]{4,4,7,4};
        baseQ[4] = new int[]{5,3,8,6};
        baseQ[5] = new int[]{6,5,9,3};
        baseQ[6] = new int[]{7,6,10,2};
        baseQ[7] = new int[]{8,8,11,4};
        /**
         *  如果
         */
        int[] pre = new int[]{-1,-1,-1,-1,-1,-1,-1,-1};

        // 如果打0号工，那么没有其他工可以兼职
        pre[0] = -1;

        for (int i = 1; i < baseQ.length; i++) {
            // 用当前工种和之前所有的工种比较，如果可以兼职那就兼职。
            for (int j = i - 1; j >= 0; j--) {
                // 如果当前工作的开始时间比 之前结束之间要小 晚 那就证明可以兼职这份工作
                if (baseQ[i][1] >= baseQ[j][2]) {
                    pre[i] = j; // 打第I份工的时候，可以兼职第J份工
                    break;
                } else {
                    pre[i] = -1;
                }
            }
        }
        /**
         *  先看我们如何兼职，
         *  根据兼职的最优解计算出 工资的最优解
         */
        int[] dp = new int[baseQ.length];

        // 如果我们只有第0份工可以打的话，收益就是0份工作的钱
        dp[0] = baseQ[0][3];
        for (int i = 1; i < baseQ.length; i++) {
            // 证明如果选择当前工作那就没有办法兼职
            if (pre[i] == -1) {
                dp[i] = Math.max(dp[i - 1], baseQ[i][3] + 0);
            } else {
                // 证明可以兼职，那我们就看是上一个问题的最优解好呢，还是当前工作 + 兼职的好呢
                dp[i] = Math.max(dp[i - 1],dp[pre[i]] + baseQ[i][3]);
            }

        }

//        int[] dp = new int[baseQ.length];

    }


    /**
     * 输入：[1,2,3,1]
     * 输出：4
     */
    public static void out(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i]);
        }
    }
}
