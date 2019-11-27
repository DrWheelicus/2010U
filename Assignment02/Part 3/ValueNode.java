/**
 * ValueNode is a class that holds a value within the expression tree
 * This class implements the TreeNode class
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public class ValueNode implements TreeNode {

  Double value;

  /**
   * ValueNode class constructor
   *
   * @param value              The current node's value
   */
  public ValueNode (int value) {
    this.value = (double)value;
  }

  /**
   * A method that returns the current node's value
   *
   */
  public Double evaluate() { return value; }

  /**
   * A method that prints the current node
   *
   * @param depth              The depth of the current node in the expression tree
   */
  public void print(int depth) {
    for (int i = 0; i < depth; i++) { // indents tree
      System.out.print("\t");
    }
    System.out.println(value);
  }

}
