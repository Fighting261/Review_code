import java.util.ArrayList;
import java.util.List;

/**
 * @ program: 20201104
 * @ Description：
 * @ CreateTime：2020/11/4 23:49
 * @ Author：Mr Zhang
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class TestDemo {

    List<Integer> list=new ArrayList<>();

    //前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;
    }

    //中序遍历
    public List<Integer> midorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        midorderTraversal(root.left);
        list.add(root.val);
        midorderTraversal(root.right);

        return list;
    }

    //后续遍历
    public List<Integer> lastorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        lastorderTraversal(root.left);
        lastorderTraversal(root.right);
        list.add(root.val);

        return list;
    }
}
