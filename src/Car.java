public class Car {
    private String name;
    private String model;
    private int year;
    private double price;

    public Car(String newName, String newModel, int newYear, double newPrice){
        name = newName;
        model = newModel;
        year = newYear;
        price = newPrice;
    }

    public int Drive(){
        return 1;
    }

    public String GetName(){
        return name;

    }

    public String GetModel(){
        return model;

    }

    public int GetYear(){
        return year;

    }

    public double GetPrice(){
        return price;
    }

    public void SetName(String newName){
        name = newName;
    }

    public void SetModel(String newModel){
        model = newModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void SetPrice(double price){
        this.price = price;
    }
}

