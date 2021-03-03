package bai10_dsa_list.bai_tap.linked_list;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private  Object data;

        public Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }
    private Node head;
    private  int numNodes =0;

    public MyLinkedList(){ // phương thức khởi tạo không có tham số

    }
// phương thức trả về data theo index
    public  Object get(int index){
        Node temp =head;
        for(int i =0; i<index; i++){
            temp =temp.next;
        }
        return temp.data;
    }
    //phương thức kiểm tra 1 phần tử có tồn tại trong danh sách hay không
    public boolean contains(E element){
        Node temp =head;

        While(temp.next != null);{
            if (temp.data.equals(element)){
                return true;
            }
            temp =temp.next;
        }
        if(temp.data.equals(element)){
            return true;
        }
        return false;
    }
    private void While(boolean b) {
    }
//phương thức trả về vị trí của 1 phần tử trong danh sách
    public int indexOf(E element){
        Node temp = head;
        for(int i =0; i<numNodes; i++){
            if((E)temp.getData()==element)
                return i;
            temp =temp.next;
        }
        return -1;
    }
}
