public class Auto {

    private int engineSize;

    private String brand;

    private String model;

    private String plate;

    public Auto(int engineSize, String brand, String model, String plate){
        this.engineSize = engineSize;
        this.brand = brand;
        this.model = model;
        this.plate = plate;
    }

    public int getEngineSize(){
        return engineSize;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getPlate(){
        return plate;
    }

    public void setEngineSize(int engineSize){
        this.engineSize = engineSize;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }

    public void setPlate(String plate){
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Auto {" +
                " cilindrata = " + engineSize +
                ", Marca = '" + brand + '\'' +
                ", Modello = '" + model + '\'' +
                ", Targa = '" + plate + '\'' +
                '}';
    }
}
