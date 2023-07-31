class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node ptr1 = head1;
         Node ptr2 = head2;
         int a = 0;
         int b = 0;
         
         while(ptr1 != null) {
             a++;
             ptr1 = ptr1.next; //cal length of ll1
         }
         
         while(ptr2 != null) {
             b++;
             ptr2 = ptr2.next;
         }
         
         ptr1 = head1;
         ptr2 = head2;
         
         int diff = Math.abs(a - b);
         
         if(a > b) {
             for(int i=0; i<diff; i++) { 
                 ptr1 = ptr1.next;
             }
         } else if(b > a) {
             for(int i=0; i<diff; i++) {
                 ptr2 = ptr2.next;
             }
         }
         
         while(ptr1 != ptr2) {
             ptr1 = ptr1.next;
             ptr2 = ptr2.next;
         }
         
         if(ptr1 != null) {
             return ptr1.data; //intersection point
         }
         
         return -1;
         
	}
}
