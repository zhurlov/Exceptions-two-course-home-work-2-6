public class Train extends Car {

    private int tripPrice;
    private double travelTime;
    private String stationName;
    private String endingStation;
    private int numberOfWagons;
    private int speed = 301, speed1 = 270;

    public Train(String brand, int yearOfIssue, String countryOfOrigin, int tripPrice, double travelTime, String stationName, String endingStation, int numberOfWagons) {
        super("Ленинград D-125", 2019, "Россия");
        this.tripPrice = Validate.validateInt(tripPrice, 0);
        this.travelTime = Validate.validateDouble(travelTime, 0);
        this.stationName = Validate.validateString(stationName, "ОШИБКА");
        this.endingStation = Validate.validateString(endingStation, "ОШИБКА");
        this.numberOfWagons = Validate.validateInt(numberOfWagons, 0);
    }

    public Train(int tripPrice, double travelTime, String stationName, String endingStation, int numberOfWagons) {
        super("Ласточка B -901", 2011, "Россия");
        this.tripPrice = Validate.validateInt(tripPrice, 0);
        this.travelTime = Validate.validateDouble(travelTime, 0);
        this.stationName = Validate.validateString(stationName, "ОШИБКА");
        this.endingStation = Validate.validateString(endingStation, "ОШИБКА");
        this.numberOfWagons = Validate.validateInt(numberOfWagons, 0);

    }
    public void diagnostics() {
        throw new UnsupportedOperationException("Диагностику проходить не могут в этом Боксе");
    }
    public void refill(){
        System.out.println("нужно запрявлять дизелем");
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getStationName() {
        return stationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }


    public String toString() {
        return "Поезд " + getBrand() + " " + getYearOfIssue() + " год выпуска в России, скорость передвижения - " + speed
                + " км/ч, отходит от " + stationName + " и следует до станции " + endingStation + ". Цена поездки  " + getTripPrice()
                + ", в поезде " + numberOfWagons + " вагонов";
    }

    public String toString(String leningrad) {
        return "Поезд " + getBrand() + " " + getYearOfIssue() + " год выпуска в России, скорость передвижения - " + speed1
                + " км/ч, отходит от " + stationName + " и следует до станции " + endingStation + ". Цена поездки  " + getTripPrice()
                + ", в поезде " + numberOfWagons + " вагонов";
    }
}
