package algorithm.array;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;

/**
 * @author hsfxuebao
 * @date 2020/03/28
 *
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class L_面03_数组中重复的数字 {

	public static Integer findRepeatBumber(int[] arr) {

		Set<Integer> numberSet = Sets.newHashSet();
		int arrLength = arr.length;
		for (int i = 0; i < arrLength; i++) {
			if (numberSet.contains(arr[i])) {
				return arr[i];
			} else {
				numberSet.add(arr[i]);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] number = {2, 3, 1, 0, 2, 5, 3};
		System.out.println(findRepeatBumber(number));
	}
}
