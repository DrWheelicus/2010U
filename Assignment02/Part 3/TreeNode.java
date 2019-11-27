/**
 * TreeNode is an interface class used by OpNode and ValueNode
 *
 * @author Hayden MacIntyre
 * @author Aaron Woodhouse
 */
public interface TreeNode {

  public abstract Double evaluate();
  public abstract void print(int depth);

}
