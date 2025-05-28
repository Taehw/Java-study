package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) { //최초 노드인 경우
            first = newNode;
        } else { //null이 아니면 마지막에 추가하기
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) { //처음부터 탐색해서 next 가 null이 아닐때까지
            x = x.next;
        }
        return x; //next 가 널이면 마지막 node 일거고 x를 반환 -> 머릿속으로 상상하면서 그려보셈
    }

    //추가 코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) { //첫번째 위치에 추가
            newNode.next = first;
            first = newNode;
        } else {
            //중간 위치에 Node를 추가
            Node prev = getNode(index - 1); //이전노드 찾는거니까 index에서 -1
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++; // 추가하면서 사이즈 늘어나니까
    }

    //Node에 값을 세팅한우 이번값 반환을 위해 반환타입으로 Object 지정
    public Object set(int index, Object element) {
        Node x = getNode(index); //원하는 인덱스에 있는 노드부터 찾기
        Object oldValue = x.item;
        x.item = element; //노드값 교체
        return oldValue;
    }

    //추가 코드
    public Object remove(int index) {
        Node removeNode = getNode(index); //삭제할 노드를 찾고
        Object removedItem = removeNode.item;
        if (index == 0) { //첫번재 노드 삭제
            first = removeNode.next;
        } else {
            //중간 노드 삭제
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--; //삭제됐으니까 size는 줄겠지

        return removedItem; //삭제된 원소를 반환
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for(int i= 0 ; i<index ; i++){ //i가 0이면 첫번재 노드 i는 노드사이의 건너뛰기 횟수
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) { //첫번째 노드부터 x의 다음이 있을때까지 리스트를 순회
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

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
