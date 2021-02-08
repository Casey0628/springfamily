package com.nkx.springcloudorder.arithmetic;

import java.util.Arrays;

public class BubbleSort {
	/**
	 * 核心思路：冒泡排序只会操作相邻的两个数据。每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。如果不满足就让它俩互换。一次冒泡会让至少一个元素移动到它应该在的位置，重复n次，就完成了n个数据的排序工作。
	 * 举例说明：4 5 6 3 2 1,从小到大排序。
	 * 1 2 3 4 5 6进行排序：什么样的情况下不做任何交换了呢，那就是所有的数都在它应该在的位置；O(n)
	 *
	 * 第一次冒泡的结果:4 5 6 3 2 1->4 5 3 6 2 1 - > 4 5 3 2 6 1 -> 4 5 3 2 1 6,哪个元素的位置确定了，6
	 * 第二次冒泡的结果:4 5 3 2 1 6->4 3 5 2 1 6 -> 4 3 2 5 1 6 -> 4 3 2 1 5 6
	 * 第三次冒泡的结果:4 3 2 1 5 6->3 4 2 1 5 6 -> 3 2 4 1 5 6 -> 3 2 1 4 5 6
	 * 	第四次冒泡的结果:3 2 1 4 5 6->2 3 1 4 5 6 -> 2 1 3 4 5 6
	 * 	第五次冒泡的结果:2 1 3 4 5 6->1 2 3 4 5 6
	 *
	 */
	public static void main(String[] args) {

		int data[] = { 4, 5, 6, 3, 2, 1 };
		int n = data.length;

		//1 2
		for (int i = 0; i < n - 1; i++) {	//排序的次数
			boolean flag = false;
			for (int j = 0; j < n - 1 - i; j++) {	//具体冒泡 n - 1 - i,6,5,4,3,2,1
				if (data[j] > data[j + 1]) {
					int temp = data[j];	//用了第三个变量，不用第三个变量
					data[j] = data[j + 1];
					data[j + 1] = temp;
					flag = true;
				}
			}
			if(!flag) break;    //如果数据的顺序是有序的则不需要执行外面的循环
		}
		System.out.println(Arrays.toString(data));
	}
}
// a:2 b:3
// 3 2 => a:3 b:2
// 用加减
//a = a + b => a = 3+2 =5;
//b = a - b => b = 5-3 =2;
//a = a - b => a = 5-2 =3;