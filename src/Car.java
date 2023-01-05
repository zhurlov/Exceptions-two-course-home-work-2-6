public class Car extends Transport {

    private String brand;
    private int yearOfIssue;
    private String countryOfOrigin;

    public Car(int yearOfIssue) {
        this("Challenger", 1965, "America");
    }

    public Car(String brand, int yearOfIssue, String countryOfOrigin) {
        super("Tugella", "gray green",  320);
        setBrand(brand);
        this.brand = Validate.validateString(brand, "ОШИБКА");
        this.yearOfIssue = Validate.validateInt(yearOfIssue, 2022);
        this.countryOfOrigin = Validate.validateString(countryOfOrigin, "УКАЖИТЕ СТРАНУ" );
    }

    @Override
    public void diagnostics() {
        System.out.println("пройти диагностику");
    }


    public void refill(){
        System.out.println("можно заправлять бензином, дизелем");
        System.out.println("для электрокаров заряжаться на специальный электропарковках");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String toString() {
        return brand + " " + getModel() + " " + yearOfIssue + " " + countryOfOrigin + " " + getBodyColor() + " " + getMaximumMovementSpeed() ;
    }
}