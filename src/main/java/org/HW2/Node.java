package org.HW2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {
    private T data;
    private Node<T> next;
}
