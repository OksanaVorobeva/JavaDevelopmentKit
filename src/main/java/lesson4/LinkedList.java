package lesson4;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LinkedList implements Collection<Integer> {
   private ListNode head, tail;
   private int size=0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head==tail && head==null;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return Collection.super.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate<? super Integer> filter) {
        return Collection.super.removeIf(filter);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Collection.super.spliterator();
    }

    @Override
    public Stream<Integer> stream() {
        return Collection.super.stream();
    }

    @Override
    public Stream<Integer> parallelStream() {
        return Collection.super.parallelStream();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        if(head==null){
            head=new ListNode(integer,null,null);
            tail=head;
        }else {
           ListNode curent = new ListNode(integer,null,null);
           ListNode prev=tail;
            tail.setNext(curent);
            tail=curent;
            tail.setPrevious(prev);
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
