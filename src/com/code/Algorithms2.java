package com.code;

import com.code.utils.ListNode;

/**
 * ���������ǿ���������ʾ�����Ǹ�������λ����������ʽ�洢�����ǵ�ÿ���ڵ�ֻ�洢�������֡���������ӷ���һ���µ�����
 * 
 * ����Լ���������� 0 ֮�⣬���������ֶ��������㿪ͷ��
 * 
 * ʾ����
 * 
 * ���룺(2 -> 4 -> 3) + (5 -> 6 -> 4) �����7 -> 0 -> 8 ԭ��342 + 465 = 807
 */
public class Algorithms2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, cur = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = p != null ? p.val : 0;
			int y = q != null ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			
			if(p!=null) p=p.next;
			if(q!=null) q=q.next;
		}
		if (carry > 0) {
			cur.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

	public static void main(String[] args) {
		Algorithms2 a = new Algorithms2();

		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		l2.next = l3;
		l1.next = l2;

		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(4);
		l6.next = l7;
		l5.next = l6;

		ListNode l81 = a.addTwoNumbers(l1, l5);
		System.out.println(l81.val);

		System.out.println(l81.next.val);
		System.out.println(l81.next.next.val);

	}
}
