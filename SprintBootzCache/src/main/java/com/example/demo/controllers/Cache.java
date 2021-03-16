package com.example.demo.controllers;

import java.util.HashMap;

public class Cache extends HashMap<Integer, String> {

    public String get(int key) {
        return super.get(key);
    }

    public boolean has(int key) {
        return super.containsKey(key);
    }

    public void set(int key, String value) {
        super.put(key, value);
    }

    public void delete(int key) {
        super.remove(key);
    }

}
