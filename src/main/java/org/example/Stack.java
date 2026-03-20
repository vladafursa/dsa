package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {
    ArrayList<Integer> stack = new ArrayList<>();

    public void push(int element) {
        stack.add(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

}
