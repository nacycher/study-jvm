package com.study.studyjvm.executeEngine;

import org.springframework.util.StopWatch;

/**
 * 测试解释器和JIT编译器
 * 解释器：将字节码逐条解释执行
 * JIT编译器：缓存热点代码为机器码，然后执行
 * <p>
 * -Xint：使用解释器
 * -Xcomp：使用JIT编译器
 * -Xmixed：混合模式，解释器和JIT编译器交替执行
 */
public class intCompTest {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        testPrimeNumber(1000000);
        stopWatch.stop();
        /**
         * Xmixed:0.42s
         * Xint:5.5s
         * Xcomp:0.38s (启动花了较长时间)
         */
        System.out.println(stopWatch.getTotalTimeSeconds());
    }

    public static void testPrimeNumber(int count) {
        for (int i = 0; i < count; i++) {
            // 计算 100 以内的质数
            label:
            for (int j = 2; j <= 100; j++) {
                for (int k = 2; k <= Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        continue label;
                    }
                }
            }
            //System.out.println (j);
        }
    }
}
