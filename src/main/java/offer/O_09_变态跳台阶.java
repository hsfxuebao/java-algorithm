package offer;

/**
 * @author haoshaofei
 * @date 2020/03/13
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 *如果台阶级数为n的话，这时我们把n级台阶时的跳法看成n的函数，记为,第一次跳的时候有n种不同的选择：
 * f(n) = f(n-1)+ f(n-2)+ ... +f(2) + f(1) +f(0)
 * 因此 f(n-1)+ f(n-2)+ ... +f(2) + f(1) +f(0)
 * 两式相减得到 f(n) = 2*f(n-1)
 * 因此可以得到下面的结果
 *          f(n) = 2^(n-1)
  *
 *
 * 作者：lkkwxy
 * 链接：https://www.jianshu.com/p/965d12083d7f
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 *
 *
 */
public class O_09_变态跳台阶 {

    /**
     * 排列组合问题，每个台接都可以选择条或者不跳（不可以回调），所以右2 ^ (n-1)中跳法
     */
    public int JumpFloorII(int target) {

        return 1 << (target-1);
    }
}