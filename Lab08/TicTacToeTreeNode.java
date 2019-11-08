import java.util.ArrayList;
public class TicTacToeTreeNode {
	
	/*
	 * start with player x
	 * put an x in each empty space
	 * an empty space means a child
	 * root of the tree original string
	 * recursion to create children of children 
	 * very last leaves of trees are full boards 
	 * doubly linked list lab, nodes to store children
	 * */
	
	TicTacToeTreeNode parent;
	ArrayList<TicTacToeTreeNode> children;
	
	String board;
	String player;
	
	
	public TicTacToeTreeNode(String playerboard){
		board = playerboard;
		children = new ArrayList<TicTacToeTreeNode>();
		//node for direct root
		//nodes for children
		//how to do unknown amount of nodes?
		//arraylist of children
		
	}
	
	public TicTacToeTreeNode(String playerboard, ArrayList<TicTacToeTreeNode> Children){
		board = playerboard;
		children = Children;
	}
	
	public TicTacToeTreeNode(){
		board = " ";
		children = new ArrayList<TicTacToeTreeNode>();
	}
	
	public static void printTree(TicTacToeTreeNode root){
		System.out.println(root.board);
		//System.out.print("\t");
		for (int i = 0; i < root.children.size(); i ++){
			if(root.children.get(i).board != " "){
				System.out.print("\t");
				printTree(root.children.get(i));
			}
		}
	}
	
	// a normal linked list instead of a tree
	public static TicTacToeTreeNode createNode(String playerboard, String player){
		TicTacToeTreeNode newNode = new TicTacToeTreeNode(playerboard);
		for (int i = 0; i < playerboard.length(); i ++){
			if (playerboard.charAt(i) == ' '){
				TicTacToeTreeNode temp = new TicTacToeTreeNode(makeMove(playerboard, i, player));
				newNode.children.add(temp);
			
					if (player == "x" ){
						newNode = createNode(makeMove(playerboard, i, "x"),"o",newNode.children); 
					} else {
						newNode = createNode(makeMove(playerboard, i, "o"),"x",newNode.children); 
					}
			}
		}
		newNode.board = playerboard;
		return newNode;
	}

	public static TicTacToeTreeNode createNode(String playerboard, String player, ArrayList<TicTacToeTreeNode> Children ){
		TicTacToeTreeNode newNode = new TicTacToeTreeNode(playerboard, Children);
		for (int i = 0; i < playerboard.length(); i ++){
			if (playerboard.charAt(i) == ' '){
				TicTacToeTreeNode temp = new TicTacToeTreeNode(makeMove(playerboard, i, player));
				
				newNode.children.add(temp);
				
				
					if (player == "x" ){
						newNode = createNode(makeMove(playerboard, i, "x"),"o",newNode.children); 
					} else {
						newNode = createNode(makeMove(playerboard, i, "o"),"x",newNode.children); 
					}
			}
		}
		newNode.board = playerboard;
		return newNode;
	}
	
	public static void main(String[] args) {
	    String board = "x ox xo o";
	    TicTacToeTreeNode root = createNode(board, "x");
	    printTree(root);
	}
	
	public static String makeMove(String oldBoard, int position, String player) {
	    String before = oldBoard.substring(0, position);
	    String after = oldBoard.substring(position+1);
	    return before + player + after;
	}

}
