public class LoidesCars {
    private Car[] cars;
    private int numCars;

    public LoidesCars(int numCars){
       cars = new Car[numCars];
       numCars = 0;

    }

    public void AddCar(Car newCar){
        cars[numCars] = newCar;

    }

    public void RemoveCar(String model){

    }

    public Car GetOldestCar(){
        int lowest = cars[0].GetYear();
        Car oldestCar = cars[0];

        for(int i = 0; i < numCars; i++){
            if( cars[i].GetYear() < lowest   ){
                lowest = cars[i].GetYear();
                oldestCar = cars[i];
            }
        }

        return oldestCar;
    }


    public Car MostExpensiveCar(){
        double highest = cars[0].GetPrice();
        Car mostExpensiveCar = cars[0];

        for(int i = 0; i < numCars; i++){
            if( cars[i].GetYear() > highest   ){
                highest = cars[i].GetYear();
                mostExpensiveCar = cars[i];
            }
        }

        return mostExpensiveCar;
    }


}

