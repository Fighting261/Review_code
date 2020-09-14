import java.lang.reflect.Array;
import java.util.*;
public class TestDemo {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    /**
     *
     * @param node TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */

    //二叉树遍历
    public ArrayList<ArrayList<Integer>> printNode (TreeNode node) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            ArrayList<Integer> lists = new ArrayList<>();
            int a = queue.size();
            for (int i = 0;i<a;i++){
                TreeNode father = queue.peek();
                lists.add(father.val);
                if(father.left != null){
                    queue.add(father.left);
                }
                if(father.right != null){
                    queue.add(father.right);
                }
                queue.poll();
            }

            list.add(new ArrayList<>(lists));

        }
        return list;
    }

}
