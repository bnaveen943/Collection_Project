package collect;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Node<T> {
	T data;
	Node<T> next;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
}

