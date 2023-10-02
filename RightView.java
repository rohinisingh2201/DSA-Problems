class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        //add code here.
        
        ArrayList<Integer> ans = new ArrayList<>();
      
      if(root == null) {
          return ans;
      }
      
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      
      while(!q.isEmpty()) {
          int x = q.size();
          
          for(int i=0; i<x; i++) {
              Node a = q.poll(); //front ele will come out
              
            //   children
              if(a.left != null) {
                  q.add(a.left);
              }
              if(a.right != null) {
                  q.add(a.right);
              }
              
              if(i == x-1) {  //last ele will be added
                  ans.add(a.data);
              }
          }
      }
      
      return ans;
        
    }
}
