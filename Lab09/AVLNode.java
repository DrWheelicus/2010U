public class AVLNode {
	public AVLNode left = null;
	public AVLNode right = null;
	public int value = 0;
	public AVLNode parent = null;

	public AVLNode insert(int newValue) {
		// perform binary-search style insertion
		if (newValue < this.value) {
			// insert the value to the left sub-tree
			if (this.left == null) {
				AVLNode newNode = new AVLNode();
				newNode.value = newValue;
				newNode.parent = this;
				this.left = newNode;
			} else {
				this.left.insert(newValue);
			}
		} else {
			// insert the value into the right sub-tree
			if (this.right == null) {
				AVLNode newNode = new AVLNode();
				newNode.value = newValue;
				newNode.parent = this;
				this.right = newNode;
			} else {
				this.right.insert(newValue);
			}
		}

		return rebalance();
	}

	public AVLNode rebalance() {
		/*
		 * balance right side if balance > 1 get right child balance
		 */
		if (getBalance() > 1) {
			if (this.right.getBalance() == -1) {
				/*
				 * double rotation right side if right child balance == -1 rotate by changing
				 * parent node, left and right nodes
				 */
				AVLNode c = this;
				AVLNode a = c.right; // to right
				AVLNode b = a.left; // to left
				AVLNode t = b.right; // to right
				c.right = b; // to right
				a.left = t; // to left
				b.right = a; // to right
			}
			AVLNode C = this;
			AVLNode B = C.left; // to right
			AVLNode A = B.left; // to right
			AVLNode T = B.right; // ? //to left
			B.left = A; // to right
			B.right = C; // to left
			/*
			 * single rotation right update children update parent
			 */
		} else if (getBalance() < -1) {
			if (this.left.getBalance() == 1) {
				/*
				 * if balance < -1 get left child balance
				 * 
				 * double rotation left side if left child balance == 1 rotate changing parent
				 * node left and right nodes
				 */
				AVLNode a = this;
				AVLNode c = a.left; // to left
				AVLNode b = c.right; // to right
				AVLNode ta = a.right; // to left
				AVLNode tb = b.right;
				AVLNode tc = c.left;
				a.right = b;
				a.left = tc;
				b.right = c;
				c.left = tb;
				c.right = ta;
				System.out.println();
				// a.left = b; // to left
				// b.left = c; // to left
				// c.right = t; // to right
				/*
				 * ta = a.right; tc = c.left; tb = b.right; a.right = b; a.left = tc; b.right =
				 * c; c.left = tb; c.right = ta
				 */
			}
			AVLNode A = this;
			AVLNode B = A.right;
			AVLNode C = B.right;
			AVLNode T = B.left;
			A.right = T; // where the tree gets cut off?
			B.left = A;
			A.parent = B;
			A = B;
			System.out.println();
			/*
			 * single rotation left update children update parents
			 *
			 */

			// balance the tree (if necessary)
		}
		return null;
	}

	public int getBalance() {
		int rightHeight = 0;
		if (this.right != null) {
			rightHeight = this.right.getHeight();
		}

		int leftHeight = 0;
		if (this.left != null) {
			leftHeight = this.left.getHeight();
		}

		return rightHeight - leftHeight;
	}

	public void print(int depth) {
		if (this.right != null) {
			this.right.print(depth + 1);
		}

		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}
		System.out.println(this.value);

		if (this.left != null) {
			this.left.print(depth + 1);
		}
	}

	public int getHeight() {
		int leftHeight = 1;
		if (left != null) {
			leftHeight = left.getHeight() + 1;
		}

		int rightHeight = 0;
		if (right != null) {
			rightHeight = right.getHeight() + 1;
		}

		return (leftHeight > rightHeight) ? leftHeight : rightHeight;
	}
}
