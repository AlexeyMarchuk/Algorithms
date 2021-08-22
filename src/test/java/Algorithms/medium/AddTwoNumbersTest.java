//package Algorithms.medium;
//
//
//import org.junit.Test;
//import sun.security.krb5.internal.KerberosTime;
//
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;
//
//
//public class AddTwoNumbersTest {
//
//
//    @Test
//    public void test() {
//
//
//        ListNode node1 = new ListNode(2, new ListNode(5, new ListNode(1)));
//        ListNode node2 = new ListNode(3, new ListNode(5, new ListNode(1)));
//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//        AddTwoNumbers addTwoNumbers1 = new AddTwoNumbers();
//        KerberosTime now = KerberosTime.now();
//
//        String [] i = addTwoNumbers.addTwoNumbers(node1, node2);
//        assertThat(i, is(new String [] {"251", "351"}));
//    }
//
//    @Test
//    public void test2 () {
//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//        int i  = addTwoNumbers.sumArrays(new String[] {"12", "2"});
//        assertThat(i, is(3));
//
//    }
//
//}