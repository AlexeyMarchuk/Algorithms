package Algorithms.medium;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public String [] addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder i1  = new StringBuilder();
        StringBuilder i2 = new StringBuilder();

        i1 = i1.append(l1.val);
        while (l1.next != null) {

            l1 = l1.next;
            i1 = i1.append(l1.val);
        }

        i2 = i2.append(l2.val);
        while (l2.next != null) {

            l2 = l2.next;
            i2 = i2.append(l2.val);
        }

        return new String [] {i1.toString(), i2.toString()};
    }

    public static int sumArrays (String[] input) {
        int sum1 = 0;
        char[] string1 = input[0].toCharArray();
        for(int i = string1.length-1; i >=0; i --) {
            System.out.println(i);

            sum1 += Integer.parseInt(Character.valueOf(string1[i]).toString());
            System.out.println("sum: " + sum1);
        }
        System.out.println(sum1);
        return sum1;
    }
}
