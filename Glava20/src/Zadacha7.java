
enum CarType {
    Cheap,Expensive
}
abstract class Car {
    Car(CarType type, Place place) {
        this.type = type;
        this.place = place;
    }

    abstract void construct();

    CarType type = null;
    Place place = null;

    CarType getType() {
        return type;
    }


    public void setType(CarType type) {
        this.type = type;
    }

    public Place getPlace() {
        return place;
    }

    public void setLocation(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", location=" + place +
                '}';
    }
}
class ExpensiveCar extends Car {
    ExpensiveCar(Place place) {
        super(CarType.Expensive,place);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Welcome to Expensive car");
    }

}
class CheapCar extends Car {
    CheapCar(Place place) {
        super(CarType.Cheap, place);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Welcome to Cheap car");
    }
}
enum Place {
    Europe, Asia
}
class EuropeCarFactory {
    static Car buildCar(CarType type) {
        Car car = null;
        switch (type) {
            case Expensive -> car = new ExpensiveCar(Place.Europe);
            case Cheap -> car = new CheapCar(Place.Europe);

        }
        return car;
    }
}
class AsiaCarFactory {
    public static Car buildCar(CarType type) {
        Car car = null;
        switch (type) {
            case Expensive -> car = new ExpensiveCar(Place.Asia);
            case Cheap -> car = new CheapCar(Place.Asia);

        }
        return car;
    }
}
class CarFactory {
    private CarFactory() {

    }
    public static Car buildCar(CarType type) {
        Car car = null;
        Place place = Place.Asia;
        switch (place) {
            case Europe ->car = EuropeCarFactory.buildCar(type);
            case Asia ->car = AsiaCarFactory.buildCar(type);


        }
        return car;
    }
}


    public class Zadacha7 {
        public static void main(String[] args) {
            System.out.println(CarFactory.buildCar(CarType.Expensive));
            System.out.println(CarFactory.buildCar(CarType.Cheap));
        }

}
