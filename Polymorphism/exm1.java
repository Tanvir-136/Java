class Pizza{
    private String size;
    private int noOFCheeseToppings;
    private int noOFPepperoniToppings;
    private int noOfHamToppings;

    public String getSize(){
        return size; 
    }
    public int getCheeseToppings(){
        return noOFCheeseToppings;
    }
    public int getPepperoniToppings(){
        return getCheeseToppings();
    }
    public int getHamToppings(){
        return getCheeseToppings();
    }
    public void setSize(String size){
        if(size.equals("small")|| size.equals("medium")|| size.equals("large")){
            this.size = size;    
        }else{
            System.out.println("invalid size");
        }
    }
    public void setCheeseToppings(int noOFCheeseToppings){
        this.noOFCheeseToppings = noOFCheeseToppings;
    }
    public void setPepperoniToppings(int noOFCheeseToppings){
        this.noOFCheeseToppings = noOFPepperoniToppings;
    }
    public void setHamToppings(int noOfHamToppings){
        this.noOfHamToppings = noOfHamToppings;
    }
    public Pizza(String size,int noOFCheeseToppings,int noOFPepperoniToppings,int noOfHamToppings){
        setSize(size);
        this.noOFCheeseToppings= noOFCheeseToppings;
        this.noOFPepperoniToppings = noOFPepperoniToppings;
        this.noOfHamToppings = noOfHamToppings;
    }
    public Pizza(){
        this("small",0,0,0);
    }
    public double calcCost(){
        double cost =0;
        switch(size){
            case "small":
                cost =10;
                break;
            case"medium":
                cost =12;
                break;
            case "large":
                cost =14;
                break;
        }
        cost+=(noOFCheeseToppings+noOFPepperoniToppings+noOfHamToppings)*2;
        return cost;
    }
    public String getDescription(){
        return "Pizza{" +"Size= "+size+"\"" +  ",Cheese Toppings= "+noOFCheeseToppings +",Peperoni Toppings = "+noOFPepperoniToppings +",Ham Toppings= "+noOfHamToppings +"Cost= "+ calcCost() +'}';
    }
}
class PizzaOrder {
    private Pizza[] pizzas;
    private int numPizzas;

    public PizzaOrder() {
        pizzas = new Pizza[3];
        numPizzas = 0;
    }

    public void addPizza(Pizza pizza) {
        if (numPizzas < 3) {
            pizzas[numPizzas] = pizza;
            numPizzas++;
        } else {
            System.out.println("Cannot add more than 3 pizzas to the order.");
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < numPizzas; i++) {
            totalCost += pizzas[i].calcCost();
        }
        return totalCost;
    }
}
public class exm1{
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder();
        
        Pizza pizza1 = new Pizza("small", 2, 1, 1);
        Pizza pizza2 = new Pizza("large", 3, 2, 2);
        
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        System.out.println("Total cost of the order: $" + order.calcTotal());
    }
}