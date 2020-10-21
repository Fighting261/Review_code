import java.util.HashSet;
import java.util.Set;

/**
 * @ program: 20201021
 * @ Description：
 * @ CreateTime：2020/10/21 19:47
 * @ Author：Mr Zhang
 */

  class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }

public class TestDemo {

    //去除重复字符
    public static void main(String[] args) {
        String str = "abcbdde";
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }else {
                continue;
            }
        }
        System.out.println(sb);
    }

    //二叉树的最近公共祖先
    public TreeNode nearestCommonAncestor (TreeNode root, TreeNode p, TreeNode q) {
      if(root == null){
          return null;
      }
      if(root.val == p.val || root.val == q.val){
          return root;
      }
      TreeNode lchild = nearestCommonAncestor(root.left,p,q);
      TreeNode rchild = nearestCommonAncestor(root.right,p,q);
      if(lchild != null && rchild != null){
          return root;
      }
      if(lchild != null){
          return lchild;
      }
        return rchild;
    }
}
