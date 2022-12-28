package web.model;


public class Car {

    private int id;

    private String model;

    private int mileage;

    private String owner;

    public Car() {
    }

    public Car(String model, int mileage, String owner) {
        this.model = model;
        this.mileage = mileage;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", owner='" + owner + '\'' +
                '}';
    }
}
