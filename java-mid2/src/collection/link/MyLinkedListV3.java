package collection.link;

public class MyLinkedListV3 <E>{

    private Node <E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) { //최초 노드인 경우
            first = newNode;
        } else { //null이 아니면 마지막에 추가하기
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) { //처음부터 탐색해서 next 가 null이 아닐때까지
            x = x.next;
        }
        return x; //next 가 널이면 마지막 node 일거고 x를 반환 -> 머릿속으로 상상하면서 그려보셈
    }

    //추가 코드
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e); //타입추론에 의해 생략
        if (index == 0) { //첫번째 위치에 추가
            newNode.next = first;
            first = newNode;
        } else {
            //중간 위치에 Node를 추가
            Node<E> prev = getNode(index - 1); //이전노드 찾는거니까 index에서 -1
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++; // 추가하면서 사이즈 늘어나니까
    }

    //Node에 값을 세팅한우 이번값 반환을 위해 반환타입으로 Object 지정
    public E set(int index, E element) {
        Node<E> x = getNode(index); //원하는 인덱스에 있는 노드부터 찾기
        E oldValue = x.item;
        x.item = element; //노드값 교체
        return oldValue;
    }

    //추가 코드
    public E remove(int index) {
        Node<E> removeNode = getNode(index); //삭제할 노드를 찾고
        E removedItem = removeNode.item;
        if (index == 0) { //첫번재 노드 삭제
            first = removeNode.next;
        } else {
            //중간 노드 삭제
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--; //삭제됐으니까 size는 줄겠지

        return removedItem; //삭제된 원소를 반환
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for(int i= 0 ; i<index ; i++){ //i가 0이면 첫번재 노드 i는 노드사이의 건너뛰기 횟수
            x = x.next;
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) { //첫번째 노드부터 x의 다음이 있을때까지 리스트를 순회
            // -> item의 인덱스와 같은 원소가 리스트이 있으면 index를 반환
            if(o.equals(x.item))
                return index;
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    //증첩클래스 생성
    private static class Node <E>{
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> temp = this;
            sb.append("[");
            while (temp != null) {
                sb.append(temp.item);
                if(temp.next !=null){
                    sb.append("->");
                }
                temp = temp.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

}
