public class MyLinkedList {
    Node head;

    public void insertatlast(int data) {
        Node n = new Node(data);
        Node temp = head;
        if (head == null) {
            head = n;
        }
        else {
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next=n;
        }

    }

    public void insertatbegin(int data) {
        Node n = new Node(data);
        Node temp = head;
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void insertatpoint(int data, int ele) {
        Node n = new Node(data);
        Node temp = head;
        if (head.data == ele) {
            n.next = head;
            head = n;
        } else {
            while (temp.data == ele) {
                temp = temp.next;
            }
            n.next = temp;
            temp = n;
        }
    }

    public void deletefromlast() {
        Node temp=head;
        if(head.next==null){
            head=null;
        }
        else{
            while (temp.next.next!=null){
                temp=temp.next;
            }
            System.out.println("Deleted node="+temp.next.data);
            temp.next=null;
        }

    }

    public void deletefrombegin() {
        Node temp=head;
        if(head==null){
            System.out.println("Already empty");
        }
        else{
            System.out.println("Deleted node="+head.data);
            head=head.next;
        }
    }

    public void deletefrompoint() {

    }

    public void display() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.insertatlast(4);

        obj.insertatlast(6);
        obj.deletefromlast();
        obj.display();
        obj.insertatbegin(2);
        obj.display();
        obj.insertatpoint(0,2);
        obj.insertatlast(8);
        obj.insertatlast(10);
        obj.insertatlast(12);
        obj.deletefrombegin();

        obj.display();
    }
}

