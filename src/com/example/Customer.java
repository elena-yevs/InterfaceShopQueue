package com.example;

public class Customer implements ShopQueue{
    public void head(){
        System.out.println("head");
    }
    public void tail(){
        System.out.println("tail");
    }

    public void serve() {
        System.out.println("serve");
    }
    public void free() {
        System.out.println("serve");
    }
}
