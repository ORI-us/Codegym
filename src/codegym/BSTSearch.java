/*
Пошук в "Бінарному Дереві Пошуку"

Знайти число в бінарному дереві пошуку і повернути true якщо воно присутнє, інакше повернути false.
 */
package codegym;

/**
 *
 * @author orius
 */
class TreeNode {
  int value;
  TreeNode left, right;
}

public class BSTSearch {
  public boolean exist(TreeNode root, int target) {

  if(root == null)
    return false;

  if(root.value == target)
    return true;
  else
  {
    boolean ret_L = false;
    boolean ret_R = false;
    
    ret_L = this.exist(root.left,  target);
    ret_R = this.exist(root.right, target);
    
    if(ret_L == true || ret_R == true)
      return true;
  }

    return false;
  }
}
