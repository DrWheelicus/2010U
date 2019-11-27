/**
 * ExpressionTree is a class that creates a binary tree of mathematical operations
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class ExpressionTree {

  TreeNode root;

  /**
   * ExpressionTree class constructor
   *
   * @param root              The root node of the expression tree
   */
  public ExpressionTree(TreeNode root) {
    this.root = root;
  }

  /**
   * A method that evaluates the expression tree
   *
   * @see                     TreeNode#evaluate()
   */
  public Double evaluate() { // evaluate entire tree
    return root.evaluate();
  }

  /**
   * A method that prints the expression tree
   *
   * @see                     TreeNode#print()
   */
  public void print() {
    root.print(0);
  }

}
