package algorithm.string;

/**
 * @author hsfxuebao
 * @date 2020/03/17
 *
 * 字符串匹配算法，返回index
 */
public class N_01_KMP {

	public static int getIndexOf(String s, String m) {
		if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
			return -1;
		}
		char[] ss = s.toCharArray();
		char[] ms = m.toCharArray();
		int si = 0;
		int mi = 0;
		int[] next = getNextArray(ms);
		while (si < ss.length && mi < ms.length) {
			if (ss[si] == ms[mi]) {
				si++;
				mi++;
			} else if (next[mi] == -1) {
				si++;
			} else {
				mi = next[mi];
			}
		}
		return mi == ms.length ? si - mi : -1;
	}

	/**
	 * 最大公共前后缀
	 * @param ms
	 * @return
	 */
	public static int[] getNextArray(char[] ms) {
		if (ms.length == 1) {
			return new int[] { -1 };
		}

		//next数组就是该字符最长公共前后缀size（包括自己）；
		int[] next = new int[ms.length];
		next[0] = -1;
		next[1] = 0;
		int pos = 2;
		int cn = 0;
		while (pos < next.length) {
			if (ms[pos - 1] == ms[cn]) {
				next[pos++] = ++cn;
			} else if (cn > 0) {
				cn = next[cn];
			} else {
				next[pos++] = 0;
			}
		}
		return next;
	}

	public static void main(String[] args) {
		String str = "abcabcababaccc";
		String match = "ababa";
		System.out.println(getIndexOf(str, match));

	}
}
