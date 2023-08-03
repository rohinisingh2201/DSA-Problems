class GfG
{
    
    Node merge(Node a, Node b) {
        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }
        
        Node result;
        if(a.data < b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }
        result.next = null;
        return result;
    }
    
    Node flatten(Node root)
    {
    	// Your code here
	    if(root == null || root.next == null) {
	        return root;
	    }
	    
	    return merge(root, flatten(root.next));
    }
    
}
