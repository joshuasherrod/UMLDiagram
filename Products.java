package edu.sdccd.cisc191.UMLClassDiagram;

public class Products {
    private edu.sdccd.cisc191.UMLClassDiagram.Shoes[] shoes;
    private edu.sdccd.cisc191.UMLClassDiagram.Shirts[] shirts;
    private edu.sdccd.cisc191.UMLClassDiagram.Pants[] pants;

    private String itemName;
    private int itemPrice;

    public Products() {
    }

    public String getItemName() {

        return itemName;
    }

    public void setItemName(String itemName) {

        this.itemName = itemName;
    }

    public int getItemPrice() {

        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {

        this.itemPrice = itemPrice;
    }
}
