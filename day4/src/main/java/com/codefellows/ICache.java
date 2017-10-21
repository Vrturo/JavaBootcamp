package com.codefellows;

public interface ICache<T> {
    void add(){
        System.out.println(String.format("string: %s added to cache", T));
    }

    public String get() {

    }


}
