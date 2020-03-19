package com.banyuan.club.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/18 11:17 上午
 */
public class MyCollection implements Collection {

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public boolean add(Object o) {
    return false;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    return false;
  }

  @Override  //不用谢写
  public boolean removeIf(Predicate filter) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override  //不用写
  public Spliterator spliterator() {
    return null;
  }

  @Override  //不用写
  public Stream stream() {
    return null;
  }

  @Override //不用写
  public Stream parallelStream() {
    return null;
  }

  @Override
  public boolean retainAll(Collection c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection c) {
    return false;
  }

  @Override
  public boolean containsAll(Collection c) {
    return false;
  }

  @Override
  public Object[] toArray(Object[] a) {
    return new Object[0];
  }
}
