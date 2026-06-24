public abstract class Factory {
    public Car creat(String requestedGrade){
        Car car = retrieveCar(requestedGrade);
        car = preparecar(car);
        return car;
    }
    private Car preparecar(Car car){
        car.clean();
        car.mechaninCheck();
        car.fuelCar();
        return  car;
    }
    abstract Car retrieveCar(String requestedGrade);
}
