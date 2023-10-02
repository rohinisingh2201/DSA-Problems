class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
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
              
              
            //   children - level order
              if(a.left != null) {
                  q.add(a.left);
              }
              if(a.right != null) {
                  q.add(a.right);
              }
              
              if(i == 0) {  //first ele will be added
                  ans.add(a.data);
              }
          }
      }
      
      return ans;
    }
}
