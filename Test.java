/**
 * Created by Lenovo on 3/16/2022.
 */
public class Test {
    public static void main(String[] args) {
        SinglelyLinkedList<String>l=new SinglelyLinkedList<>();
        System.out.println(l.size);
        l.addFirst("fatima");
        l.addlast("alaz");
        System.out.println(l.size());

        while (!l.isEmpty()){
            System.out.println(l.removeFirst());
    }
}}
