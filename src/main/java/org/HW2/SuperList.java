package org.HW2;

public class SuperList<T>{
    private  Node<T> head;

    public void push(T t) {
        if (this.head == null){
            this.head = new Node<T>();
            this.head.setData(t);
        }
        else {
            Node<T> newNode = new Node<T>();
            newNode.setData(t);
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public void print(){
        if (this.head != null) {
            Node<T> currentNode = this.head;
            while (currentNode != null){
                System.out.println(currentNode.getData() + " -> ");
                currentNode = currentNode.getNext();
            }
        }else {
            System.out.println("EMPTY");
        }
    }

    public void delete(T t) {
        if(this.head != null){
            Node<T> currentNode = this.head;
            Node<T> prev = this.head;
            while (currentNode != null) {
                if (currentNode.getData() == t){
                    prev.setNext(currentNode.getNext());
                    break;
                }else {
                    prev = currentNode;
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    public void add(T t){
        if (this.head == null){
            this.head = new Node<T>();
            this.head.setData(t);
        }else {
            Node<T> last = this.head;
            while (last.getNext() != null) last = last.getNext();

            Node<T> newNode = new Node<T>();
            newNode.setData(t);

            last.setNext(newNode);
        }
    }

    public void add(T t, int index){
        if (this.head == null) {
            this.head = new Node<T>();
            this.head.setData(t);
        }else {
            int nodeIndex = 0;

            Node<T> currentNode = this.head;

            while (index > nodeIndex){
                if (currentNode.getNext() != null){
                    currentNode = currentNode.getNext();
                }

                nodeIndex++;
            }

            if(nodeIndex == index){
                Node<T> newNode = new Node<T>();
                newNode.setData(t);
                newNode.setNext(currentNode.getNext());

                currentNode.setNext(newNode);
            }
        }
    }

    public boolean contains(T t){
        if (this.head != null){
            Node<T> currentNode = this.head;
            while (currentNode != null){
                if (currentNode.getData() == t) return true;
                else {
                    currentNode = currentNode.getNext();
                }
            }
        }
        return false;
    }
}
