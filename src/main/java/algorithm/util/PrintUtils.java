package algorithm.util;

import algorithm.common.DoubleLinkedNode;
import algorithm.common.LinkedNode;

/**
 *
 * 打印工具类
 *
 * @author hsfxuebao
 * @date 2020/03/15
 */
public class PrintUtils {


	/**'
	 * 打印一维数组
	 */
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * 打印二维数组
	 * @param matrix
	 */
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i != matrix.length; i++) {
			for (int j = 0; j != matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 打印单链表
	 * @param head
	 */
	public static void printLinkedList(LinkedNode head) {
		System.out.print("Linked List: ");
		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}
		System.out.println();
	}

	/**
	 * 打印双端链表
	 * @param head
	 */
	public static void printDoubleLinkedList(DoubleLinkedNode head) {
		System.out.print("Double Linked List: ");
		DoubleLinkedNode end = null;
		while (head != null) {
			System.out.print(head.value + " ");
			end = head;
			head = head.next;
		}
		System.out.print("| ");
		while (end != null) {
			System.out.print(end.value + " ");
			end = end.last;
		}
		System.out.println();
	}

}
