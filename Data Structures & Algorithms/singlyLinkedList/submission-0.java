class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if(this.size <= 0 || index >= size) {
            return -1;
        }
        if (index == size -1) {
            return this.tail.val;
        }
        ListNode node = head;
        int i = 0;
        while(i < index) {
            if(node.next != null){
                node = node.next;
            }
            i++;
        }
        return node.val;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);
        if(head != null) {
            node.next = head;
            this.head = node;
        } else {
            this.head = node;
            this.tail = node;
        }
        this.size++;
    }

    public void insertTail(int val) {
        if(head == null) {
            insertHead(val);
        } else {
            ListNode node = new ListNode(val);
            this.tail.next = node;
            this.tail = node;
            this.size++;
        }
    }

    public boolean remove(int index) {
        if(index >= this.size || index < 0) {
            return false;
        }
        if (index == 0) {
            this.head = this.head.next;
        } else {
            ListNode previousNode = null;
            ListNode currentNode = this.head;
            int i = 0;
            while(i < index) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                i++;
            }
            previousNode.next = currentNode.next;
        }
        this.size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode node = head;
        while(node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
