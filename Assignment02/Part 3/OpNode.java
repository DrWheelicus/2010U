/**
 * OpNode is a class that holds two value nodes and an operation to use between them
 * This class implements the TreeNode class
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class OpNode implements TreeNode {

  String operation;
  TreeNode left;
  TreeNode right;

  /**
   * OpNode class constructor
   *
   * @param left               The left child of this node
   * @param operation          The operation to use on it's children
   * @param right              The right child of this node
   */
  public OpNode(TreeNode left, String operation, TreeNode right) {
    this.left = left;
    this.right = right;
    this.operation = operation;
  }

  /**
   * A method that evauluates it's children after applying an operation to them
   *
   */
  public Double evaluate() {
    Double l = left.evaluate();
    Double r = right.evaluate();

    if (operation == "+") {         // determine operation to use
      return l + r;
    } else if (operation == "-") {
      return l - r;
    } else if (operation == "*") {
      return l * r;
    } else if (operation == "/") {
      return l / r;
    }
    return null;
  }

  /**
   * A method that prints the current node's children and operation to use on them
   *
   * @param depth              The depth of the current node in the expression tree
   */
  public void print(int depth) {
    right.print(depth + 1);
    for (int i = 0; i < depth; i++) { // indents tree
      System.out.print("\t");
    }
    System.out.println(operation);
    left.print(depth + 1);
  }

}
