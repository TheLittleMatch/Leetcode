package com.code;

/**
 * 
 * Algorithms1 ����֮�� ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
 * ����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á� ʾ��: ���� nums = [2, 7, 11, 15], target = 9 ��Ϊ
 * nums[0] + nums[1] = 2 + 7 = 9 ���Է��� [0, 1]
 */
public class Algorithms1 {

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int pos = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (pos == nums[j]) {
					return new int[] { i, j };
				}
			}
		}
		return nums;

	}

	public static void main(String[] args) {
		Algorithms1 a = new Algorithms1();
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = a.twoSum(nums, target);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}
}
