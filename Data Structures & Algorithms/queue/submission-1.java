class Deque {

    private DequeNode head;
    private DequeNode tail;
    private int size;
    private int value;

    class DequeNode {
        int val;
        DequeNode right;
        DequeNode left;

        public DequeNode(int val) {
            this.val = val;
        }

    }
    public Deque() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void append(int value) {
        DequeNode node = new DequeNode(value);
        if (head != null) {
            node.left = tail;
            this.tail.right = node;
            this.tail = node;
        } else {
            this.head = node;
            this.tail = node;
        }
        this.size++;
    }

    public void appendleft(int value) {
        DequeNode node = new DequeNode(value);
        if (head != null) {
            node.right = head;
            this.head.left = node;
            this.head = node;
        } else {
            this.head = node;
            this.tail = node;
        }
        this.size++;
    }

    public int pop() {
        if (this.tail == null) {
            return -1;
        }
        if (tail != null && tail != head) {
            value = this.tail.val;
            this.tail = this.tail.left;
            this.tail.right = null;
        } else if (head == tail) {
            value = this.head.val;
            this.head = null;
            this.tail = null;
        }
        return value;
    }

    public int popleft() {
        if (this.head == null) {
            return -1;
        }
        if (head != null & head != tail) {
            value = this.head.val;
            this.head = this.head.right;
            this.head.left = null;
        } else if (head == tail) {
            value = this.head.val;
            this.head = null;
            this.tail = null;
        }
        return value;
    }
}
