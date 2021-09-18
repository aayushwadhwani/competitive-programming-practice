class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    static ListNode reverse(ListNode root){
        ListNode current = root;
        ListNode prev = null;
        ListNode next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode root = new ListNode(5,new ListNode(6,new ListNode(7,null)));
        ListNode traverse = root;
        System.out.println("The linked list before reversing is :");
        while(traverse != null){
            System.out.println(traverse.val);
            traverse = traverse.next;
        }
        root = reverse(root);
        traverse = root;
        System.out.println("The linked list after reversing is :");
        while(traverse != null){
            System.out.println(traverse.val);
            traverse = traverse.next;
        }
    }
}