class Parts {
    private int sno;
    private String name;
    private String model;
    private double price;

    Parts(int sno, String name, String model, double price) {
        this.sno = sno;
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public int getSno() {
        return sno;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getModel() {
        return model;
    }

    public double tax() {
        return 0.1 * this.price;
    }

    public void display() {
        System.out.println("\nS.N. : " + this.getSno() + "\nName : " + this.getName() + "\nModel : " + this.getModel()
                + "\nPirce : " + this.getPrice() + "\nTax : " + this.tax());
    }
}

class PartsVAT extends Parts {
    PartsVAT(int sno, String name, String model, double price) {
        super(sno, name, model, price);
    }

    public double tax() {
        return 0.13 * getPrice();
    }

    public void display() {
        System.out.println("\nS.N. : " + this.getSno() + "\nName : " + this.getName() + "\nModel : " + this.getModel()
                + "\nPirce : " + this.getPrice() + "\nTax : " + this.tax());
    }
}

class Three{
    public static void main(String[] args){
        PartsVAT obj = new PartsVAT(12, "Tesla", "Y", 400000.00d);
        obj.display();

        Parts objOne = new Parts(11, "Audi", "R8", 650000.00d);
        objOne.display();
    }   
}