package com.company;

import java.util.ArrayList;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;

    //Constructor Method
    public Order(int _orderId, Customer _cust, ArrayList<Menu> _menuitem){
        this.orderId = _orderId;
        this.cust =_cust;
        this.menuItem = _menuitem;
    }

    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public Customer getCust() { return cust; }
    public void setCust(Customer _cust) {this.cust = _cust;}

    public ArrayList<Menu> getMenuItem() { return menuItem; }
    public void setMenuItem(ArrayList<Menu> _menuitem) {this.menuItem = _menuitem;}

}