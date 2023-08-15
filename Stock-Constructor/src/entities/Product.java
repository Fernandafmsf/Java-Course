package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    //construtor
    public Product(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    //outro tipo de construtor, o que caracteriza uma sobrecarga
    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    //getters e setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public int getQuantity(){
        return this.quantity;
    }


    public double TotalValueInStock() {
        return quantity*price;
    }

    public void AddProduct(int quantity) {
        this.quantity += quantity;
        //this é usado para referenciar o proprio objeto
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    //esse método esta sobreescrevendo método 'toString', um método da classe Object
    //esse método vai retornar a resposta
    public String toString() {
        return name
                +", $"
                +String.format("%.2f", price)
                +", "
                +quantity
                +" units, Total: $ "
                +String.format("%.2f", TotalValueInStock());
    }

}
