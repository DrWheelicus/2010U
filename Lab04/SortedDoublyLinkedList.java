public class SortedDoublyLinkedList<E extends Comparable<E>> implements LinkedList<E> {
    class Node
    {
        private E value;
        private Node next;
        private Node previous;

        public Node(E value, Node next, Node previous)
        {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public E getValue() { return value;	}
        public void setValue(E value) { this.value = value; }
        public Node getNext() { return next; }
        public void setNext(Node node) { this.next = node; }
        public Node getPrevious() { return previous; }
        public void setPrevious(Node node) { this.previous = node; }
    }   

	Node head;
	Node tail;

	int size;

	public SortedDoublyLinkedList() {
		this.size = 0;
    }
    
    // inserts sorted elements 
    public void insert(E value) {
        // check if it's empty 
        if (size==0) {
            head = new Node(value, null, null);
            tail = head;
            size++;
            return;
        } else {
            if (value.compareTo(head.getValue()) < 0) {
                // make new head
                // next = head
                // previous = null
                Node newNode = new Node(value, head, null);
                // previous to new node
                head.setPrevious(newNode);
                // new head
                head = newNode;
                size++;
                return;
            } else {
                Node current = head.getNext();

                while (current != null) {
                    if (value.compareTo(current.getValue()) <= 0) {
                        // insert before current
                        // next = current
                        // previous = current.previous
                        Node newNode = new Node(value, current, current.getPrevious());

                        current.getPrevious().setNext(newNode);

                        current.setPrevious(newNode);
                        size++;
                        return;
                    }
                    current = current.getNext();
                }

                // add to tail
                Node newNode = new Node(value, null, tail);
                tail.setNext(newNode);
                tail = newNode;
                size++;

                return;
            }
        }
    }

    public String toString() {
        String result = "[ ";
        Node current = head;

        while (current != null) {
            result += "" + current.getValue().toString() + " ";
            current = current.getNext();
        }

        result += "]";

        return result;
    }
}