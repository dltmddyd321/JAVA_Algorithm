public class LinkedList<N> {

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data;

        private Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString(){
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input);

        newNode.next = head;

        head = newNode;

        size ++;
        if(head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node newNode = new Node(input);

        if(size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size ++;
        }
    }

    Node node(int index) {
        Node x= head;
        for(int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    public void add(int k, Object input) {
        if(k==0) {
            addFirst(input);
        } else {
            Node tmp1 = node(k-1);
            Node tmp2 = tmp1.next;

            Node newNode = new Node(input);

            tmp1.next = newNode;
            newNode.next = tmp2;
            size ++;

            if(newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public Object removeFirst() {
        Node tmp = head;
        head = tmp.next;

        Object returnData = tmp.data;
        tmp = null;
        size --;
        return returnData;
    }

    public Object remove(int k) {
        if(k==0) {
            return removeFirst();
        }
        Node tmp = node(k-1);
        Node todoDel = tmp.next;
        tmp.next = tmp.next.next;

        Object returnData = todoDel.data;

        if(todoDel == null) {
            tail = tmp;
        }

        todoDel = null;
        size --;
        return returnData;
    }

    public Object removeLast() {
        return remove(size -1);
    }

    public int SearchNode(Object data) {
        Node tmp = head;

        int index = 0;

        while (tmp.data != data) {
            tmp = tmp.next;
            index ++;
            if(tmp == null) {
                return -1;
            }
        }
        return index;
    }
}
