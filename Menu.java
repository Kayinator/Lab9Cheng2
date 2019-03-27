package com.company;

import java.util.ArrayList;

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private int price;
    private int quantity;


    //Constructor Method
    public Menu(int _menuId, String _menuItem, int _price, int _quantity){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.price = _price;
        this.quantity = _quantity;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public int getPrice(){ return price;}
    public void setPrice(int _price) {this.price = _price;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int _quantity) {this.quantity = _quantity;}


    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println(menu.getmenuItem());
        }
    }
}