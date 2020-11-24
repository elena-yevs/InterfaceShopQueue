package com.company;

public class Customer implements ShopQueue{
    public void head(){
        System.out.println("head");
    };
    public void tail(){
        System.out.println("tail");
    };

    public void serve() {
        System.out.println("serve");
    }
}
