/**
 * Created by Lenovo on 2/6/2022.
 */
public class SinglelyLinkedList<S> {

    Node<S> head=null;
    Node<S> tail=null;
    int size=0;

    public SinglelyLinkedList(){
    }
    public boolean isEmpty(){

        return size==0;
    }
    public int size(){

        return size;
    }
    public S first(){
        if (isEmpty())
            return null;
        return head. getElement();

    }
    public S last(){
        if (isEmpty())
            return null;
        return tail.getElement();
    }
    public void addFirst(S element){
        head=new Node<S>(element,head);
        if(size==0)
            tail=head;
            size++;
    }
    public void addlast(S element){
        Node<S>x=new Node<S>(element,null);
        if (size==0)
            head=x;
        else
            tail.setNext(x);
        tail=x;
        size++;
    }
    public S removeFirst(){
        if (isEmpty())
            return null;
        S del=head.getElement();
        head=head.getNext();
        size--;
        if(size==0)
            tail=null;
        return del;
    }
    private static class  Node<S>
    {
        S element;
        Node<S> next;

        public Node(S element, Node<S> next) {
            this.element = element;
            this.next = next;
        }

        public S getElement() {
            return element;
        }

        public void setElement(S element) {
            this.element = element;
        }

        public Node<S> getNext() {
            return next;
        }

        public void setNext(Node<S> next) {
            this.next = next;
        }
    }
}
