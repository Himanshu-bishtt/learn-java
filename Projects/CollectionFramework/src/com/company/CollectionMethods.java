package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {

    private final List<Integer> data;

    public CollectionMethods(List<Integer> values) {
        this.data = new ArrayList<>();
        this.data.addAll(values);
    }

    public void getData(Integer[] values) {
        Collections.addAll(data, values);
    }

    public Integer findMin() {
        return Collections.min(this.data);
    }

    public Integer findMax() {
        return Collections.max(this.data);
    }

    public void reverseList() {
        Collections.reverse(this.data);
        System.out.println(this.data);
    }

    public void sort() {
        Collections.sort(this.data);
        System.out.println(this.data);

    }

    public void shuffle() {
        Collections.shuffle(this.data);
        System.out.println(this.data);
    }
}
