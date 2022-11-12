package ee.secretagency.homework.hashcode_equals;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;



    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }



    public String getBrad() {
        return brand;
    }

    public void setBrad(String brad) {
        this.brand = brad;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }




} //END
