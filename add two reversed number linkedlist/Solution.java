class Solution {    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode ans = new ListNode((temp1.val+temp2.val)%10,null);
        ListNode anstemp = ans;
        int carry = (temp1.val+temp2.val)/10;
        temp1 = temp1.next;
        temp2 = temp2.next;
        while(temp1 != null || temp2 != null){
            if(temp1 != null && temp2 != null){
                int to_add = (temp1.val+temp2.val+carry)%10;
                carry = (temp1.val+temp2.val+carry)/10;
                anstemp.next = new ListNode(to_add);
                anstemp = anstemp.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }else if(temp1 != null){
                int to_add = (temp1.val+carry)%10;
                carry = (temp1.val+carry)/10;
                anstemp.next = new ListNode(to_add);
                anstemp = anstemp.next;
                temp1 = temp1.next;
            }else if(temp2 != null){
                int to_add = (temp2.val+carry)%10;
                carry = (temp2.val+carry)/10;
                anstemp.next =  new ListNode(to_add);
                anstemp = anstemp.next;
                temp2 = temp2.next;
            }
        }
        if(carry != 0){
            anstemp.next = new ListNode(1);
        }
        return ans;
    }
}