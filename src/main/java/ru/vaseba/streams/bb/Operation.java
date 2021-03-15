package ru.vaseba.streams.bb;

public interface Operation<T> {
    T oper(T val1, T val2);
}
